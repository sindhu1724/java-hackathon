
public class Q11StringSplit {

	public static void main(String[] args) {
		String str1 = "This is java split program";
    	String[] str2 = str1.split("s",3);
    	for(String s:str2) {
            System.out.println(s);
    	}
    }
}
