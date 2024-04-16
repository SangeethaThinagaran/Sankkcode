//Multilevel Inheritance with 5 classes
package Assignments;
class Pondicherry{
	void universities() {
	System.out.println("List of Universities");	
	}
}
class UniversityEngg extends Pondicherry{
	static void collegeEngg() {
		System.out.println("List of Engineering Colleges");
	}
}
class UniversityMed extends UniversityEngg {
	void collegeMed() {
	System.out.println("List of Medical Colleges");	
	}
}
class collegeEngg extends UniversityMed{
	static void deptEngg() {
	System.out.println("List of Engineering Departments");	
	}
}
class collegeMed extends collegeEngg{
	void deptMed() {
	System.out.println("List of Medical Departments");	
	}
}
public class Multilevel_Inheritance_5Classes extends collegeMed {
	public static void main(String[] args) {
		Multilevel_Inheritance_5Classes	m1=new Multilevel_Inheritance_5Classes(); 
				m1.universities();
				collegeEngg();
				m1.collegeMed();
				deptEngg();
				m1.deptMed();
		}
	}


