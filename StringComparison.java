package StringConcept;

public class StringComparison {

	public static void main(String[] args) {
		
		System.out.println("===== String comparison =====");
		System.out.println();
		
		String s = " hello ";// memory of s=123(stack) heap(" hello ")

		String s2 = " hello ";
		System.out.println("s == s2: " + (s == s2));					
		
		String s3 = new String(" hello ");
		System.out.println("s == s3: " + (s == s3));					
		System.out.println("s.equals(s3): " + s.equals(s3)); 			
		System.out.println("s == s3.intern(): " + (s == s3.intern()));	
		
		String a1 = "FITA";
		String firstName2 = "Fita";
		System.out.println("firstName.equals(firstName2): " 
							+ a1.equals(firstName2));			
		System.out.println("firstName.equalsIgnoreCase(firstName2): " 
							+ a1.equalsIgnoreCase(firstName2)); 

	




	}

}
