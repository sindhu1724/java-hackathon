import java.util.Scanner;

public class Q12PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word");
		String str = sc.next();
		String rev = "";
		char[] inputChar = str.toCharArray();
		int length = inputChar.length;
		for(int i=length-1;i>=0;i--) {
			rev=rev+inputChar[i];
			
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("Given word is Palindrome");
		}
		else {
			System.out.println("Given word is not palindrome");
		}
		sc.close();

	}

}
