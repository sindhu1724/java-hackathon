import java.util.Scanner;

public class Q34Arithmaticoperausingplus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int i = sc.nextInt(); 
        System.out.println("Enter 2nd number");
        int j = sc.nextInt(); 
        System.out.print("Sum is : ");
        System.out.println(sum(i,j));
    
        System.out.print("Subtraction is : ");
        System.out.println(sub(i,j));
	
        int result = 0;
        System.out.print("Multiplcation is : ");
        System.out.println(mul(i,j, result));
        
        System.out.print("Divison is : ");
        System.out.println(div(i,j, result));
		}

	public static int sum(int a, int b)
	{
		return a+b; 
	}
	public static int sub(int a, int b)
	{
		int temp=-1;
		int neg=0;
		for(int k=1; k<=b; k++)
		{
			 neg=neg+temp; 
		}
			
		return a+neg;
	}

	public static int mul(int a, int b, int result)
	{
		for(int k=1; k<=b; k++)
		{
			result= result+a; 
		}
		return result; 
	}

	public static int div(int a, int b, int result)
	{
		int neg=0;
		int temp=-1;
		for(int l=1; l<=b; l++)
		{
			 neg=neg+temp; 
		}
		
		int value = a;
		result = 0;
		for(int k=1; k<=a; k++)
		{
			
			value=value+neg;
			
			if (value>=0)
				result++;
			else
				break;
		}
		
		return result; 
		
	}

	
}
