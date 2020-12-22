import java.util.Arrays;
import java.util.Scanner;

public class Q14ReverseWordString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Original String: ");
		String str = sc.nextLine();
		String[] strArray = str.split("\\s");
	    
		for(int i = strArray.length-1; i >=0 ; i-- ) {
	         System.out.print(strArray[i]+" ");
		         
		      }
		
	}

}
