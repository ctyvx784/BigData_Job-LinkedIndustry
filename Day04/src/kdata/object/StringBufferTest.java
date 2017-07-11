package kdata.object;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode());
		sb.append("Good");
		//System.out.println(sb);
		sb.append("!");
		System.out.println(sb.hashCode());
		System.out.println(sb);
	}

}
