//CC(2CM)-->AC(2AM, 1CM)-->(2AM, 1CM) -Multilevel Inheritance
package Assignments;
abstract class Abs_GP{
	void gpAdd(){
		System.out.println("GP Addition 10+10="+20);
	}
	abstract void gpSub();
	abstract void gpMul();
}
abstract class Abs_P extends Abs_GP {
	static void pAdd(){
		System.out.println("Parent Addition 20+20="+40);
	}
	abstract void pSub();
	abstract void pMul();
}
public class Abstract_C_AC_AC extends Abs_P  {
	void div() {
		System.out.println("Division 20/10="+20/10);
	}
	static void mod() {
		System.out.println("Modulus 21%10="+21%10);
	}
	void pSub(){
		System.out.println("Parent Subtraction");
	}
	 void pMul() {
		System.out.println("Parent Multiplicaton");
	}

	public static void main(String[] args) {
		Abstract_C_AC_AC ac1=new Abstract_C_AC_AC();
		ac1.gpAdd();
		ac1.gpSub();
		ac1.gpMul();
		pAdd();
		ac1.pSub();
		ac1.pMul();
		ac1.div();
		mod();
		}
	void gpSub(){
		System.out.println("GP Subtraction");
	}
	 void gpMul() {
		System.out.println("GP Multiplicaton");
	}
}
