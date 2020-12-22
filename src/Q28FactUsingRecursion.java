import java.util.Scanner;

public class Q28FactUsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for factorial");
		int i = sc.nextInt();
		System.out.println(factorial(i));
	}
	
	public static int factorial(int num)
	 {
		if (num==1)
			return 1;
		else		
		 return (num * factorial(num-1)); 
	 }
	
}
