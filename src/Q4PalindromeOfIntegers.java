import java.util.Arrays;
import java.util.Scanner;
public class Q4PalindromeOfIntegers {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[5];
			System.out.println("enter numbers: ");
			arr[0]=sc.nextInt();
			arr[1]=sc.nextInt();
			arr[2]=sc.nextInt();
			arr[3]=sc.nextInt();
			arr[4]=sc.nextInt();
			sc.close();

			// Store array length in integer j
			int j = 5; 
			boolean flag=true; 
			for (int i=0; i<j/2; i++)
			{
				if (arr[i] != arr[j-i-1])
				{
					flag = false;
					break;
				}
				
			}
				if (flag)
				{
					 System.out.println("Entered Array is Polindrome");
				}
								else 
				{
					 System.out.println("Entered Array is not Polindrome");
				}
				
	}

}
