/**
Author:George Samu
Date:5/24/2020
Purpose: Chapter 3 number 8

*/

import java.util.Scanner;

public class RainbowCalculation
{
	public static void main (String[]args)
	{
	
	//rainbowHeight= yourHeight + distanceToRainbow * tangent(alpha)
	//Creating a scanner and collecting a data
	
	Scanner keyboard= new Scanner(System.in);
	System.out.println("What is your height in inches ");
	int heightInInches= keyboard.nextInt();
	
	System.out.println("What is the distance To Rainbow in inches: ");
	int distanceToRainbow=keyboard.nextInt();
	
	System.out.println("What is the angle: ");
	double alphaDegrees= keyboard.nextDouble();
	
	//computing data
	double radians = alphaDegrees * Math.PI /180;
	
	double rainbowHeight= heightInInches + distanceToRainbow * Math.tan(radians);
	
	
	System.out.println("Height of the Rainbow is: " + rainbowHeight+ " inches");
	System.out.println("Your distance from the rainbow: " + distanceToRainbow +
						" inches");
	
	}//end main
}//RainbowCalculation
	
	
	