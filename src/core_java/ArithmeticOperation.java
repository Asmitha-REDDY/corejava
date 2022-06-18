package core_java;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c;
		int choice;
		while(true)
		{
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");
			System.out.println("5 to Quit\n");
			System.out.println("enter your choice");
			choice=s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter number a: ");
				a=s.nextInt();
				System.out.println("enter number b: ");
				b=s.nextInt();
				c=a+b;
				System.out.println("Sum = "+ c +"\n");
				break;
			case 2:
				System.out.println("enter number a: ");
				a=s.nextInt();
				System.out.println("enter number b: ");
				b=s.nextInt();
				c=a-b;
				System.out.println("Sub = "+ c +"\n");
				break;
			case 3:
				System.out.println("enter number a: ");
				a=s.nextInt();
				System.out.println("enter number b: ");
				b=s.nextInt();
				c=a*b;
				System.out.println("mul = "+ c +"\n");
				break;
			case 4:
				System.out.println("enter number a: ");
				a=s.nextInt();
				System.out.println("enter number b: ");
				b=s.nextInt();
				if((a==0||b==0)
						{
					System.out.println("zero is not applicable");
						c=a/b;
					}
				System.out.println("div = "+ c +"\n");
		break;
		case 5:
			System.exit(0);
			default:
				System.out.println("out off loop");
				
		}

	}
	}

