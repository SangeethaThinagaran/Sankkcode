package javaprogramming;
	class ParentOR {
		void addOR() {
			System.out.println("ParentOR");
		}
	}
	public class Overriding_Prog extends ParentOR {
 		void addOR() {
 			super.addOR();
			System.out.println("ChildOR");
		}
		public static void main(String[] args) {
			Overriding_Prog or1=new Overriding_Prog();
			or1.addOR();
			}
}

