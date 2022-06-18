package core_java;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total_score;
		float scored;
		float Percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your score:");
		scored=sc.nextFloat();
		System.out.println("Enter total_score:");
		total_score=sc.nextFloat();
		Percentage=(float)((scored/total_score)*100);
		System.out.println("Percentage:"+Percentage);
	}

}
