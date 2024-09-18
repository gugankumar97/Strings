package StringConcept;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		/*
		 * *****String
		 */
		System.out.println(" ########String#######");
		String str ="Welcome ";
		
		
		System.out.println(str.concat("User"));
		// System.out.println(Arrays.toString(str.split("e")));
		
		System.out.println(str);
		System.out.println(str.replace("Wel",""));
		System.out.println(str);
		System.out.println(str.replace("Welcome", "Hello"));

		/*
		 * *****StringBuffer
		 */
		System.out.println("\t ########String Buffer#######");
		StringBuffer sbr = new StringBuffer("Welcome ");
		
		System.out.println(sbr.append("User"));
		System.out.println(sbr);
		
		
		/*
		 * *****StringBuilder
		 */
		System.out.println("\t ########String Builder#######");
		
		StringBuilder sbdr = new StringBuilder(" Welcome ");
		
		System.out.println(sbdr.append("User"));
		sbdr.delete(0, 4);
		
		
		System.out.println(sbdr);

	}

}
