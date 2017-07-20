<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../js/jquery-3.2.1.js"></script>
<script>
	/* 이 밑에 html의 트리구조가 완성됬을 때 이 함수가 불려진다 
	 $(document).ready(function(){}); */
	$(function() {
		//댓글쓰기-------------------------------
		$("#writebutton").click(function() {
			$.ajax({
				url : "../writecomments.kdata",
				// 데이터 보내기 (아이디, 내용, 게시판 글번호)
				data : {
					"id" : $("#id").val(),
					"comment" : $("#comment").val(),
					"num" : 2
				},
				// 비동기 통신으로 갖다오면서 어떤 타입으로 가져오겠다. xml은 시작태그가 있고 닫는 태그가 있어서 불편
				// 그래서 간편한 json이 나옴
				// 배열: [ ], 객체 { }
				dataType : "json",
				success : function(data) {
					//console.log(data);
					var str = "<table>";
					$.each(data, function(index, item) {
						//console.log(index);
						//console.log(item.id);

						// CommentsWriteService의 obj.put에 들어가는 String
						str = str + "<tr>";
						str = str + "<td>" + item.comment_num + "</td>";
						str = str + "<td>" + item.id + "</td>";
						str = str + "<td>" + item.content + "</td>";
						str = str + "<td><input type='button' value='x' id=delete></td>";
						str = str + "</tr>";
					});
					str = str + "</table>"
					$("#list").html(str);
				},
				error : function() {
				}
			});
		});
		
	 	//댓글삭제-------------------------------
		//동적으로 처리하는 이벤트는 반드시 on을 써야한다.
		$("#list").on("click","#delete",(function(){
			//같은 레벨에서 찾아갈려변 filter, 자식을 찾아갈려면 find
			//console.log($(this).parent().parent().find("td:first-child").text());
			var tr = $(this)
			
			$.ajax({
				url: "../deletecomments.kdata",
				data: {"comment_num": $(this).parent().parent().find("td:first-child").text()
				},
				success: function(){
					$(tr).parent().parent().remove();
				},
				error: function(){
					console.log("error")
				}
			});
		})); 
	});
</script>
</head>
<body>
	<fieldset>
		<legend>게시판 내용 보기</legend>
		<table>
			<tr>
				<th>제목</th>
				<td>안녕하세요.</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>안녕하세요.</td>
			</tr>
		</table>
	</fieldset>
	<fieldset>
		<legend>댓글 쓰기</legend>
		<ul>
			<li>아이디: <input type="text" name="id" id="id"></li>
			<li>내용: <input type="text" name="comment" id="comment"></li>
			<li><input type="button" value="댓글쓰기" id="writebutton"></li>
		</ul>
	</fieldset>
	<!-- <fieldset>
		<legend>댓글 내용</legend>
		<ol>
			<li>안녕하세요 <input type="button" value="X">
		</ol>
	</fieldset> -->
	<fieldset>
		<legend>댓글 내용</legend>
		<div id="list"></div>
	</fieldset>
</body>
</html>