package collection;
//List (I) extends Collection (I)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Collection_List {
	public static void main(String[] args) {
		List l1=new ArrayList();//Upcastig of ArrayList(C) to List (I)
		l1.add(1234);//follows the order of insertion or indexing
		l1.add(7654);
		//l1.add(null);//accepts any number of null values
		l1.add(5);
		l1.add(33);
		//l1.add(null);
		l1.add(1);
		l1.add(245);
		//l1.add(null);
		l1.add(1234);//duplictes are allowed
		l1.add(1234);
		l1.add(7654);
		l1.add(7654);
		l1.add(5);//dynamic in nature
		l1.add(5);
		l1.add(5);
		l1.add(5);
		Collections.sort(l1);//can be sorted too, 
		//cannot accept hetrogeneous values only homogeneous values to sort
		System.out.println(l1);

		Collections.sort(l1, Collections.reverseOrder());
		//Collections.reverseOrder();
		System.out.println(l1);
		
	}

}
