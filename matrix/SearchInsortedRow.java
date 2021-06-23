package matrix;

public class SearchInsortedRow {
	static boolean search(int arr[][],int target) {
		
		int r=arr.length;
		int c=arr[0].length;
		for(int i=0;i<r;i++) {
			if(target == arr[i][c-1])
				return true;
			if(arr[i][c-1]>target)
				for(int j=0;j<c-1;j++)
					if(arr[i][j]==target)
						return true;
		}
		
		return false;
	}
	public static void main(String ar[]) {
		int arr[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int target=13;
		
		if(search(arr,target))
			System.out.println(target + " is present");
		else
			System.out.println(target+" is not present");
	}

}
