import java.util.Scanner;

public class Q17CountNumbersAndUpperLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		int upperCount = 0;
		int lowerCount = 0;
		int number = 0;
		char[] inputChar = str.toCharArray();
		int length = inputChar.length;
		for(int i=0;i<length;i++) {
			if(inputChar[i]>='A'&& inputChar[i]<='Z') {
				upperCount++;
			}
			else if(inputChar[i]>='a'&& inputChar[i]<='z') {
				lowerCount++;
			}
			else if(inputChar[i]>='0' && inputChar[i]<='9') {
				number++;
			}
		}
		System.out.println("Total number of UpperCase will be: "+upperCount);
		System.out.println("Total number of LowerCase will be: "+lowerCount);
		System.out.println("Total of numbers will be: "+number);
		sc.close();
	}

}
