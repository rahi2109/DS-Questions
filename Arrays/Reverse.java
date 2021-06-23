package Arrays;

public class Reverse {
	static void reverse(int arr[],int size) {
		int i=0,j=size-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	static void display(int arr[],int size) {
		for(int i=0;i<size;i++)
			if(i<size-1)
				System.out.print(arr[i]+",\t");
			else
				System.out.print(arr[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,2,3,9};
		System.out.println("Before reverse :");
		display(arr,arr.length);
		reverse(arr,arr.length);
		System.out.println("\nAfter reverse :");
		display(arr,arr.length);	
		
	}

}
/*
 * Output
  Before reverse :
  1,	3,	4,	2,	3,	9
  After reverse :
  9,	3,	2,	4,	3,	1
 */
