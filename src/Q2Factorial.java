import java.util.Scanner;

public class Q2Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for factorial");
		int i = sc.nextInt(); 
		factorial (i); 
		sc.close();

}
	public static void factorial(int i) {
	                int count = 1;
	                for(int j=1; j<=i;j++) 
	                {
		           count = count*j;
                    }
	                System.out.println(count);
	        }
 
}