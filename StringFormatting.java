package StringConcept;

import java.util.Scanner;

public class StringFormatting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		
		String name = sc.next();  // for string we use next()
		
		String first = "Java L1 Course";
		String second = "Fita Acadamy";
		String third = "TATA MOTORS";
		
		String templates = "Dear, %s! Welcome to %s! from %s %s";
		
		String formatting = String.format(templates, name, first, second, third); // String.format and printf both are same
		System.out.println(formatting);
		
		System.out.printf("you have %d mobile available",10);
		System.out.printf("\nHello, %s welcome to %s\n", "\tgugan\t", "\tfita academy\t");
		
		
		

	}

}
