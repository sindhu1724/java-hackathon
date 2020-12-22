import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public class Q15UniqueString {
		
		   public static void main(String[] args) {
		      String str = "Guitar Guitar is instrument and Piano is instrument";
		      String[] strArray = str.split("\\s+");
		      Arrays.sort(strArray);
		      int count = 1;
		      System.out.println("After Sorting:");
				for (int i=0; i<strArray.length; i++)
				{
					System.out.print(strArray[i] + " ");
				}
			
				System.out.println( " ");
		      for(int i = 1; i < strArray.length ; i++ ) {
		   
		      if (strArray[i].equals(strArray[i-1])) 
		      {
		    	  count++;
		      }
		    	  
		      else
		      {
		    	  if (count ==1)
		    	  {
		    		  System.out.println(strArray[i-1] + " unique string");
		    	  }
		    	  count = 1; 
     		      }
		    	  
		        }
			  if (count ==1)
	    	  {
	    		  System.out.println(strArray[strArray.length-1] + " unique string");
	    	  }
	    
	 	}

}
