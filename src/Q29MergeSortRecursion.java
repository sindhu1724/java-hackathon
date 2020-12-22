import java.util.Scanner;

public class Q29MergeSortRecursion {

	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter N ( how many numbers to be sorted)");
		int n = sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter "+n+ " numbers:");
			for (int i=0 ; i<n; i++)
		 	     {
				     int  number = sc.nextInt();
		 		     arr[i]=number;
		 	     }
		 
		 System.out.println("arr before  sorting \n");
		 	for(int i = 0; i < arr.length; i++)
		 		System.out.print( arr[i]+"  ");
		 System.out.println();
	 
	  mergeSort(arr,0, arr.length-1);
	  System.out.print("After Merge sorting \n");
		 
	  	for(int i = 0; i < arr.length; i++)
		     System.out.print(arr[i]+"  ");
		System.out.println();
	 }
		 
    public static void mergeSort(int arr[],int low, int high)
      {
	   if (low < high) 
	   {
		  int middle = (low + high) / 2;          
		  mergeSort(arr, low, middle);
		  mergeSort(arr, middle + 1, high);
		  merge(arr, low,middle,high);
       }
      }
		 
		private static void merge(int arr[], int low, int middle, int high)
     	{
		  int Imiddle= middle;
		  int Istart = middle + 1;
	      int l=low;
		  while ((l <= Imiddle) && (Istart <= high))
		      {
		      if (arr[low] < arr[Istart]) {
		            low++;
		         } else {
		 
		              int temp = arr[Istart];
		     
		              for (int j = Istart-1; j >= low; j--) {
		     
		              arr[j+1] = arr[j];
		          }
		 
		      arr[low] = temp;
		      low++;
		      Imiddle++;
		      Istart++;
		       }
		    }
	}

}