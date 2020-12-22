import java.util.Arrays;
import java.util.Scanner;

public class Q25BinarySearch {
	 public static void main(String args[]){
		 
		 Scanner sc = new Scanner(System.in);
		int[] arr = new int[5]; 
	       // int arr[] = {20,30,40,50,60}; 
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
	       
	        int searNum = 40;  
	        int last=arr.length-1;  
	        searchBinary(arr,0,last,searNum);     
	 }  
	 
 
	  public static void searchBinary(int arr[], int first, int last, int searNum){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < searNum ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == searNum ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   } 
	  }
		
}

