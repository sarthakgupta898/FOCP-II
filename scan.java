import java.util.*;
class scan
{
	public static void main (String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("please type two numbers:");
		int num1=console.nextInt();
		int num2=console.nextInt();
		int prod=num1+num2;
		System.out.println("the product is " +prod);
		System.out.println(args[0]);
	}
}