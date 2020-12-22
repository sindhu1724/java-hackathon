import java.util.Scanner;

public class Q8StringToLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese enter String to convert into Lowercase: ");
        String s = sc.nextLine();
        String sLower = s.toLowerCase();
        System.out.println(sLower);
	}

}
