import java.util.Arrays;
import java.util.Scanner;

public class Q5UniqueNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers: ");
		int[] iArray = new int[6];
		iArray[0] = sc.nextInt();
		iArray[1] = sc.nextInt();
		iArray[2] = sc.nextInt();
		iArray[3] = sc.nextInt();
		iArray[4] = sc.nextInt();
		iArray[5] = sc.nextInt();
		int length = iArray.length;
		Arrays.sort(iArray);
		sc.close();
        for(int i : iArray) {
        	System.out.print(i +",");
        }
        System.out.println(" ");
        int count = 1;
		for(int i=1;i<length;i++) {
		
			if (iArray[i] == iArray[i-1])
			{
				count++;
			}
			else
			{
				if (count == 1) {
				System.out.println(iArray[i-1] + " is Unique number");
				}
				else
				{
					System.out.println(iArray[i-1] + " is repeated " + count + " times.");
				}
				count = 1;
			}
				
		}
		
		if (count == 1) 
		    {
			System.out.println(iArray[length-1] + " is Unique number");
			}
			else
			{
				System.out.println(iArray[length-1] + " is repeated " + count + " times.");
			}

	}
}
