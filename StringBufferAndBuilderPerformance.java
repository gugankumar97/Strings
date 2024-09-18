package StringConcept;

/** StringBuffer and StringBuilder are same but their performance is different
 * 
 * normally we use StringBuilder
 * 
 * but in threads concept we will use StringBuffer for security reasons
 */

public class StringBufferAndBuilderPerformance {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		System.out.println("Current time: "+ System.currentTimeMillis()); 
		
		StringBuffer sb = new StringBuffer("Welcome");
		
		for (int i =1000; i < 10000; i++) {
			sb.append("User");
		}
		
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		
		StringBuilder sb2 = new StringBuilder("Welcome");
		
		for (int i = 0; i < 20000; i++) {
			sb2.append("User");
		}
		
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

	}

}
