package kdata.project.dto;

import java.sql.Date;

public class CommentsDTO {
	private int commentNum;
	private String id;
	private Date writeDate;
	private int number;
	private String comment;
	
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public CommentsDTO(String id, String comment, int number) {
		super();
		this.id = id;
		this.comment = comment;
		this.number = number;
	}
	
	public CommentsDTO(int commentNum, String comment) {
		super();
		this.commentNum = commentNum;
		this.comment = comment;
	}
	
	public CommentsDTO(int commentNum, String id, Date writeDate, String comment,int number ) {
		super();
		this.commentNum = commentNum;
		this.id = id;
		this.writeDate = writeDate;
		this.number = number;
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "CommentsDTO [commentNum=" + commentNum + ", id=" + id + ", writeDate=" + writeDate + ", number="
				+ number + ", comment=" + comment + "]";
	}
	
}
