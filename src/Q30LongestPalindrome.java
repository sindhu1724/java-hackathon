 
public class Q30LongestPalindrome {

	public static void main(String[] args) {
        String str = "Malayalam"; 
        System.out.println("Length is: " + longestPalindrome(str)); 
	}
	static int longestPalindrome(String str) 
    { 
        int maxLength = 1; 
        int start = 0; 
        int len = str.length(); 
        int low, high; 
  
        for (int i = 1; i < len; ++i) { 
            low = i - 1; 
            high = i; 
            while (low >= 0 && high < len 
                   && str.charAt(low) 
                          == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
  
            low = i - 1; 
            high = i + 1; 
            while (low >= 0 && high < len 
                   && str.charAt(low) 
                          == str.charAt(high)) { 
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
        } 
  
        System.out.print("Longest palindrome substring is: "); 
        System.out.println(str.substring(start, start+maxLength));
              return maxLength; 
    } 	
}