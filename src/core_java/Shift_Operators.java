package core_java;

import java.util.Scanner;

public class Shift_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = s.nextInt();
		int result = (number>>1);
		System.out.println(result);
		int number1=s.nextInt();
		int output = (number1<<2);
		System.out.println(result);

	}

}
