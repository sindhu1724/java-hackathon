
public class Q62ReverseFirst3Num {

	public static void main(String[] args) {
		int arr[] = {3,2,4,7,0,3,1,5,8,4};
		int l=3;
		int len=arr.length;
		reverse(arr,l, len);
		for(int a=0; a<len; a++)
		{
		System.out.print(arr[a] + " ");
		}
	}

	public static void reverse(int arr[],int l,int len)
	{
		for (int i=0; i<len; i=i+3)
		{
		int left = i;
		int right = Math.min(i+l-1, len-1);
		int temp;	
		while(left<right)
		{
			temp = arr[left];
			arr[left]=arr[right];
			arr[right] = temp;
			left=left+1;
			right=right-1;
		}
			
		}
		
	}
	
}
