 
public class Q27QuickSort {

	public static void main(String[] args) {
		 int arr[] = {20, 6, 30, 42, 1, 24, 36, 48}; 
	        int length = arr.length; 
	        sort(arr, 0, length-1); 
	        System.out.println("sorted array by Quick sort"); 
	        for (int i=0; i<length; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
	}
	
	public static void sort(int arr[], int start, int end) 
    { 
        if (start < end) 
        { 
            int mid = middle(arr, start, end); 
            sort(arr, start, mid-1); 
            sort(arr, mid+1, end); 
        } 
    } 
 
	 public static int middle(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); 
	        for (int j=low; j<high; j++) 
	        { 
	             if (arr[j] < pivot) 
	            { 
	                i++; 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	        return i+1; 
	    }  
}