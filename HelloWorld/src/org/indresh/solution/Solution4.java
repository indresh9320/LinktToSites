package org.indresh.solution;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String time=sc.next();
		DateFormat df=new SimpleDateFormat("hh:mm:ssaa");
		DateFormat outFormat=new SimpleDateFormat("HH:mm:ss");
		Date date=null;
		try {
			date=df.parse(time);
			System.out.println(outFormat.format(date));
		}catch (Exception e) {
			System.out.println(e);
		}
		sc.close();
	}

}
