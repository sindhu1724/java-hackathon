public class Q1Booleanvariable {

	public static void main(String[] args) {
	boolean a = true; 
	boolean b = false; 
	boolean c = false;
	System.out.println("Atleast two variables are "+ atleastTwoAreTrue(a, b, c)); 
		
   }
	public static boolean atleastTwoAreTrue(boolean a, boolean b, boolean c) {
		 
		return (a && b) || (a && c) || (b && c);
	}

}

