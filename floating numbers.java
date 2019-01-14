// Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places
import java.util.*;
class FloatingNumber
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Input floating number ");
		double a=scn.nextDouble();
		System.out.print("another floating number");
		double b=scn.nextDouble();

         a=Math.round(a*1000);
         a=a/1000;
         b=Math.round(b*1000);
         b=b/1000;
         if(a==b){
        	 System.out.println("they are same upto three decimal place");
         }
         else
         {
        	 System.out.println("they are different");
                }
	}
}