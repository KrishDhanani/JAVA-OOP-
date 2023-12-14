package Practice;
import java.util.Scanner;
public class practice2 {
    public static void main(String args[])
    {
       
       
       // 1. celsious to ferenhit
        // System.out.println("Enter degree celsious: ");
         Scanner sc = new Scanner(System.in);
        // float c = sc.nextFloat();
        // float f = (c*1.8f)+32;
        // System.out.println("The ferenhit is " +f);

        // 2. inch to meter
        // System.out.println("Enter inches ");
        // double inch = sc.nextDouble();
        // double meter  = inch * 0.0254;
        // System.out.println(meter);

        // 3. find year and days 
        // System.out.println("Enter the miniutes:-  ");
        // float m = sc.nextFloat();
        // float days = m/1440;
        // System.out.println("The days are "+days);
        // float year = m/525600;
        // System.out.println("The nomber of Years are "+year);

        // 4. find bmi
        // System.out.println("Enter the weight (In kilogram)");
        // float w = sc.nextFloat();
        // System.out.println("Enter the hight (In meter)");
        // float h = sc.nextFloat();
        // float BMI = w/(h*h);
        // System.out.println(BMI);

        /* 5. Write a Java program to takes the user for a distance (in meters) and the time 
        was taken (as three numbers: hours, minutes, seconds), and display the speed, 
        in meters per second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
         */         

         System.out.println("Enter the distance (In meter)");
         float mt = sc.nextFloat();
         System.out.println("Enter the time (In hour)");
         float hr = sc.nextFloat();
         System.out.println("Enter the time (In miniute)");
         float mi = sc.nextFloat();
         System.out.println("Enter the time (In second)");
         float sd = sc.nextFloat();
        
        float time = (hr*3600)+(mi*60)+sd; 

         float speed = mt/sd;
         System.out.println("The speed in meter/second "+ speed);
         float Speed = mt*1000.0f/sd;
         System.out.println("The speed in kilometer/hour " + Speed);
         float SpeeD = mt*1609.0f/hr;
         System.out.println("Your speed in miles/hour " + SpeeD);

    }
    
}
