package core_java;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number :");
int num = scan.nextInt();
int reverse = 0;
int len = String.valueOf(num).length();
System.out.println("Length "+len);
for(int i=0;i<len;i++)
{
	int reminder = num % 10;
	reverse = reverse*10+reminder;
	num = num/10;
}
System.out.println(reverse);
	}

}
