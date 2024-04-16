package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionsClass_DifferentMethods {
 
	public static void main(String[] args) {
		List a1=new ArrayList();
		a1.add("Pen");//passing an object
		a1.add("Pencil");
		a1.add("Ruler");
		a1.add("Sharpener");
		System.out.println("add: "+a1);
		System.out.println("contains-YES: "+a1.contains("Pen"));
		System.out.println("contains-NO: "+a1.contains("Eraser"));
		a1.remove("Sharpener");
		System.out.println("remove-Sharperner: "+a1);
		System.out.println("NO: "+a1.isEmpty());
		
				
		List a2=new ArrayList();
		System.out.println("addAll: "+a2.addAll(a1));//passing a collection
		a2.containsAll(a1);
		System.out.println("containsAll-YES: "+a2.containsAll(a1));
		a2.add("Compass");a2.add("Set Squares");
		a2.removeAll(a1);
		System.out.println("remove All-Pen and Pencil: "+a2);
		System.out.println("Size: "+a2.size());
		a1.clear();
		System.out.println(a1);
	}

}
