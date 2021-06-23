package matrix;

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {
	static List<Integer> spiral(int arr[][]){
		List<Integer> list=new ArrayList<>();
		int left=0,right=arr[0].length-1,top=0,down=arr.length-1;
		while(left<=right&& top<=down) {
			for(int i=left;i<=right;i++)
				list.add(arr[left][i]);
			top++;
			if(list.size()==arr.length*arr[0].length)
				break;
			for(int i=top;i<=down;i++)
				list.add(arr[i][right]);
			right--;
			
			for(int i=right;i>=left;i--)
				list.add(arr[down][i]);
			down--;
			for(int i=down;i>=top;i--)
				list.add(arr[i][left]);
			left++;
		}
		
		return list;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{6, 6, 2, 28, 2},{12, 26, 3, 28, 7},{22, 25, 3, 4, 23}};
		System.out.println("Given marix are  : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
			
		}
		System.out.println("\n spiral order : ");
		System.out.println(spiral(arr));

	}

}
