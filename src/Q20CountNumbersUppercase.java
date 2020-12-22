import java.util.Arrays;

public class Q20CountNumbersUppercase {

	public static void main(String[] args) {
			String str = "This is Java Hack5876758athon Test";
			
		    char[] strArray = str.toLowerCase().toCharArray();
			System.out.println(strArray);
			Arrays.sort(strArray);
			System.out.println(strArray);
			int count = 1;
			int length = strArray.length;		
			for(int i =1; i<length;i++) {
				if(strArray[i]==strArray[i-1]) {
					count++;
				}
				else {
					if(strArray[i-1]==' ')
					{
						System.out.println("Space repeated: " +count+ "times");
					    count=1;
					}
					else {
						System.out.println(strArray[i-1]  +"repeated" + count + "times");
						count=1;
					}
				}
			}
			System.out.println(strArray[length-1]  + "repeated" +count+ "times");

	}

}
