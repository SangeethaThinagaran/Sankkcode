package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorConcepts {

	public static void main(String[] args) {
					List l1=new ArrayList();//to know the behav of list (I)
			l1.add(1234);
			l1.add(5);
			l1.add("Sun");
			l1.add("Moon");
			l1.add("Star");
			//Iterator i1=l1.iterator();//Iterator concepts
			ListIterator i2= l1.listIterator();
			//while(i2.hasNext()==true) {
				//System.out.println(i2.next());
				
			//}
			//System.out.println("---------------------");
						
			while (i2.hasPrevious()==true) {
				System.out.println(i2.previous());
			}
			
			
			
		
	}

}
