import java.util.Scanner;

public class Q9StringToUppercase {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Plese enter String to convert into Uppercase: ");
	        String s = sc.nextLine();
	        String sUpper = s.toUpperCase();
	        System.out.println(sUpper);
		}

	}

