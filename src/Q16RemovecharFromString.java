
public class Q16RemovecharFromString {

	public static void main(String[] args) {
		charRemove("program","r");
      }
	public static void charRemove(String s,String str) {
	    
        String str1 = s.replace(str,"");
         System.out.println(str1);

}
}

