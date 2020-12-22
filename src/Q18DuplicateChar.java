import java.util.Scanner;

public class Q18DuplicateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		char[] inputChar = str.toCharArray();
		int length = inputChar.length;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
			   if(inputChar[i]==inputChar[j]) {
				System.out.println("Duplicate Char is: "+inputChar[i]);
			}
			
		}
	}
		sc.close();

}
}
