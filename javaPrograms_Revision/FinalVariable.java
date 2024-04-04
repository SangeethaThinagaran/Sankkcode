package javaPrograms_Revision;

public class FinalVariable {
		final static int a=5;
		char c;
		static void add() {
			//a=5;
			int b=1;
			int sum=a+b;
			System.out.println(sum);
		}
		void sub() {
			//a=14;
			int b=0;
			int sub=a-b;
			System.out.println(sub);
		}
	public static void main(String[] args) {
		add();
		GlobalVariable g1=new GlobalVariable();
		g1.sub();
	}
	}



