package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class hetroValues {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(987);
		al1.add(8);
		al1.add("Sangeetha");
		al1.add('A');
		al1.add(null);
		al1.add(0.1);
		al1.add(0.099);
		al1.add(7.8f);
		System.out.println(al1);
		ArrayList al2=new ArrayList();
		al2.add(987);
		al2.add(8);
		al2.add(56);
		al2.add(700);
		al2.add(43);
		al2.add(0);
		Collections.sort(al2);
		System.out.println(al2);
	}

}
