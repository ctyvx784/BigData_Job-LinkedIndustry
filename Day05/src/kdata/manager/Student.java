package kdata.manager;

public class Student {

		private int num;
		private String name, address,callnum;
		
	
		public int getNum() {
			return num;
		}
		public Student(int num, String name, String callnum,String address) {
			super();
			this.num = num;
			this.name = name;
			this.callnum = callnum;
			this.address = address;
		}
		public String getCallnum() {
			return callnum;
		}
		public void setCallnum(String callnum) {
			this.callnum = callnum;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Student [num=" + num + ", callnum=" + callnum + ", name=" + name + ", address=" + address + "]";
		}
	
		
		
}
