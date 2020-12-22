import java.util.Scanner;

public class Q10SubSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string: ");
		String str = sc.next();
		CharSequence cstr = str.subSequence(3,6);
		System.out.println("subsequence is: "+cstr);
		sc.close();
	}

}
