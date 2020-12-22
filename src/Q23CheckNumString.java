import java.util.Scanner;

public class Q23CheckNumString {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			if(isNumber(str))
			{
				System.out.println(str + " is Integer");
			}
			
			else
			{
			if (str.equals("true") ||  str.equals("false"))
				{
					System.out.println(str + " is Boolean");
			     }
			else
			{
				System.out.println(str + " is String");
						
			}
			}
			
			
}

	static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }

}
