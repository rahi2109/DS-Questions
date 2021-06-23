package Arrays;

public class LargestContigousSum {
	static int largestContigousSum(int arr[],int size) {
		int max_sum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
			if(max_sum<sum)
				max_sum=sum;
			if(sum<0)
				sum=0;
		}
		return max_sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,-2,-3,-4};
		
		System.out.println("Maximum contigous sum is : "+largestContigousSum(arr,arr.length) );
		
	}

}
/*
 * output: 
   Maximum contigous sum is : -1
 */
