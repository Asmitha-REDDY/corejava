package core_java;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("enter String1:");
		String s1 = sc.nextLine();
		System.out.println("enter String2:");
		String s2 = sc.nextLine();
		String s4 = "hello";
		String s3 = s1+s2;
		System.out.println("resultant" + s3);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println("concatation:" + s1.concat(s2));
		System.out.println("equals:" + s1.equals(s2));
		System.out.println("double equal:" + (s1==s2));
		System.out.println("startWith:" + s1.endsWith(s2));
		System.out.println("endsWith:" + s1.endsWith(s2));
		System.out.println(s4.indexOf('1'));
		System.out.println(s4.lastIndexOf('1'));
		System.out.println(s4.replace("asmi", "asmitha"));
		System.out.println(s4.contains("reddy"));
		System.out.println(s1.compareTo(s2));				
		
		
		

	}

}
