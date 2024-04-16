package collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

//Set(I) extends Collection(I)
public class Collection_Set {

	public static void main(String[] args) {
	Set s1=  new TreeSet();//Explicit Upcasting of TreeSet(C) to Set(I) 
	s1.add(1234);//does not follow order of insertion or indexing
	s1.add(3456);//they get added based on Hashcode
	s1.add(-45);
	s1.add(6);                                      
	s1.add(4444);
	s1.add(0);
	s1.add(6);//Duplicates are not allowed
	s1.add(6);
	//Collections.sort(s1); sorting is not allowed
	//s1.add(null);//null values are not accepted
	s1.add(null);
	System.out.println(s1);
	}

}
