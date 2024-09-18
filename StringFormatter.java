package StringConcept;

import java.util.Formatter;

public class StringFormatter {

	public static void main(String[] args) {
		
		Formatter formatter = new Formatter();
		System.out.println("----space format specifier----");
		
		formatter.format("%d",111);
		System.out.println(formatter);
		
		formatter = new Formatter();    // if we give space means result will be in space
		formatter.format(" %d",111);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%d",-111);
		System.out.println(formatter);
		
		formatter = new Formatter();    // // if we give space means result will be in space
		formatter.format(" %d",-111);
		System.out.println(formatter);
		
		// ================== + Sign Specifier
		System.out.println("\n===== + Sign Specifier =====\n");

		// + sign specifier
		formatter = new Formatter();
		formatter.format("%+d", 111);
		System.out.println(formatter);

		// + sign specifier
		// on - sign, it will have no effect
		formatter = new Formatter();
		formatter.format("%+d", -111);
		System.out.println(formatter);
		
		

		// ================== ( specifier
		
		System.out.println("\n===== ( specifier =====\n");
		

		// ( Specifier
		formatter = new Formatter();
		formatter.format("%(d", -111);
		System.out.println(formatter);

		formatter = new Formatter();
		formatter.format("%(d", 111);
		System.out.println(formatter);
		
		

		// ================== Comma, Specifier
		
		System.out.println("\n===== Comma, Specifier =====\n");
		

		// comma Specifier
		formatter = new Formatter();
		formatter.format("%, d", 525487);
		System.out.println(formatter);

		// comma Specifier
		formatter = new Formatter();
		formatter.format("%, .3f", 32659526566.4521);
		System.out.println(formatter);
		
		

		// ================== Left Justification(-) Specifier(alignment)
		
		System.out.println("\n===== Justification(-) Specifier =====\n");
		

		// right justify by default
		formatter = new Formatter();
		formatter.format("|%10.4f|", 1234.1234);  // |10.04| is a space value we can give anything
		System.out.println(formatter);

		// left justify
		formatter = new Formatter();
		formatter.format("|%-30.4f|", 1234.1234);
		System.out.println(formatter);
		
		
		// ====== %n format specifier
		formatter = new Formatter();
		formatter.format("fita academy %nwelcome to java");
		System.out.println(formatter);
		
		
		System.out.println("\n===== Precision Formats =====\n");
		

		// added floating-point data
		// using the %f or %e specifiers,
		// Format to 2 decimal places
		// in a 16 character field.
		formatter = new Formatter();
		formatter.format("%16.2e", 123.1234567);
		System.out.println("Scientific notation to 2 places: " + formatter);

		// Format 4 decimal places.
		formatter = new Formatter();
		formatter.format("%.3f", 1.23234167);
		System.out.println("Decimal floating-point notation to 4 places: " + formatter);

		// Format 4 places.
		// The %g format specifier causes Formatter
		// to use either %f or %e, whichever is shorter
		formatter = new Formatter();
		formatter.format("%.4g", 123.1444267);
		System.out.println("Scientific or Decimal floating-point notation to 4 places: " + formatter);

		// Display at most 15 characters in a string.
		formatter = new Formatter();
		formatter.format("%.15s", "12345678901234567890");
		System.out.println("String notation to 15 places: " + formatter);

		// Format into 6 digit
		formatter = new Formatter();
		formatter.format("%06d", 23488);
		System.out.println("value in 6 digits: " + formatter);


	}

}
