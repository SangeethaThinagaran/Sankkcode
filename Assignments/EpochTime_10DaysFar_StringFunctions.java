package Assignments;

import java.util.Date;

public class EpochTime_10DaysFar_StringFunctions {
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String currenttime=d2.toString();
		System.out.println(currenttime);
		long futuretime=d2.getTime()+(1000*60*60*1);
		System.out.println();
	}
	

}
