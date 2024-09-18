package StringConcept;

import java.util.Scanner; 

public class ReadFromConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	// Addition of two numbers using byte:
		
		System.out.println("Value of number1: ");
		byte number1 = sc.nextByte();
		
		System.out.println("Value of number2: ");
		byte number2 = sc.nextByte();
		

		int total = number1+number2;
		System.out.println("Addition of two numbers: "+total);
		
		
		
	// Addition of two numbers using float:
		
		 System.out.println("Value of number3: ");
		 float number3 = sc.nextFloat();
				 
		 System.out.println("Value of number4: ");	
		 float number4 = sc.nextFloat();
		 
		 float total1 = number3+number4;
		 System.out.println("The Addition of two float numbers: "+total1);
		 
		 
	// Area of the circle:
		 
		 System.out.println("value of radius:");
		 double radius = sc.nextDouble();
		 
		 double area = Math.PI*(radius*radius);
		 System.out.println("Area of a circle:"+area);
		 
		 
	// circumference of a circle:
		 
		 System.out.println("value of Radius: ");  // we are giving radius value in double
		 double Radius = sc.nextDouble();
		 
		 double circumference = Math.PI * 2*Radius;
		 
		 System.out.println("Circumference of a circle is :"+circumference);
		 
		 
		 
		 
		 

	}

}
