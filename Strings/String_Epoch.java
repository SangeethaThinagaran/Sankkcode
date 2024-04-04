package Strings;

import java.util.Date;

public class String_Epoch {

	public static void main(String[] args) {
		//d1- server time; d2-human understandable time
		Date d1=new Date();
		d1.getTime();//will return long because it will return epoch value
		//d1.getDate();//depreciated Methods
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String currenttime=d2.toString();
		Date d3=new Date(d2.getTime()+(1000*60*60*24*10));
		System.out.println(d3);
		//long futuretime=(d3.getTime()+(1000*60*60*24*1));
		//Date d4=new Date(futuretime);
		//System.out.println("Future Time is"+futuretime);
		//String ft=d4.toString();
		
		//String month=	currenttime.substring(4, 7);
		//System.out.println(month);
		//String date=	currenttime.substring(8, 10);
		//date=date+10;
		//System.out.println(date);
		//String year=	currenttime.substring(24);
		//System.out.println(year);
		//System.out.println();
		//System.out.println(month.concat(date).concat(year));
		//System.out.println(month.concat(" ").concat(date).concat(" ").concat(year));
		//System.out.println(month.concat("/").concat(date).concat("/").concat(year));
		//System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		//System.out.println(date.concat("/").concat(month).concat("/").concat(year));

	}

}
