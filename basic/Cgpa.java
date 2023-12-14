import java.util.Scanner;
public class Cgpa
{
	public static void main(String args[])
{
	System.out.println("enter the first sem marks:- ");
	Scanner sc = new Scanner(System.in);
	float h = sc.nextFloat();
	System.out.println(h);
	
	System.out.println("enter second sem marks:- ");
	float j = sc.nextFloat();
	System.out.println(j);

	System.out.println("Enter third sem marks:-");
	float k = sc.nextFloat();
	System.out.println(k);

	float d;
	d=(h+j+k)/3;
	System.out.println("The CGPA is:- " +d);
		
}
}