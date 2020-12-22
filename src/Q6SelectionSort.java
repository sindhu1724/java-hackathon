
public class Q6SelectionSort {

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		int length = arr.length;
		System.out.println("Before Sorting:");
		for (int i=0; i<length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	
		
		selectionSort(arr,length);
		System.out.println("");
		System.out.println("After Sorting:");
		for (int i=0; i<length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

	public static void selectionSort(int arr[],int length)
	{
		for (int i=0;i<length;i++) 
		{
			for (int j=i+1; j<length; j++)
			{
				if (arr[i] > arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i] = temp;
				}
			}
		}
			
		
		
	}
	
}
