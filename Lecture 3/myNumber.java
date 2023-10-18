package myNumber;

public class myclass {
	static class MyNumber {
		private int num;
		public int num2;
		public MyNumber() {
			num = 0;
			num2 = 100;
		}
		int getNum() {
			return num;
		}
		void setNum(int i) {
			num=i;
			num2=10*i;
		}
	}
	public static void main(String[]ar) {
		MyNumber A = new MyNumber();
		System.out.println(A.getNum());
		A.setNum(10);
		System.out.println(A.getNum());
		System.out.println(A.num2);
	}
}
