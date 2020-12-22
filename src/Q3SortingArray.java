import java.util.Arrays;
import java.util.Scanner;

public class Q3SortingArray {

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
		Arrays.sort(arr);
		for(int number: arr) {
			System.out.print(number+",");
			
		}

}

}
