import java.util.Scanner;

public class Q13ReverseOfString {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter string to reverse: ");
      String str = sc.nextLine();
      char[] inputChar = str.toCharArray();
      int length = inputChar.length;
      for(int i=length-1;i>=0;i--)
      {
    	  System.out.print(inputChar[i]);
      }
      
      
      sc.close();
	}
	

}
