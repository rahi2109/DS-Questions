package Arrays;

import java.util.Set;
import java.util.TreeSet;

public class UnionOfSortedArrays {
	static Set<Integer> union(int arr1[],int arr2[],int size1,int size2) {
		Set<Integer>set =new TreeSet<>();
		for(int i=0;i<size1;i++)
			set.add(arr1[i]);
		for(int i=0;i<size2;i++)
			set.add(arr2[i]);
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3};
		Set<Integer> set=union(arr1,arr2,arr1.length,arr2.length);
		for(int i :set)
			System.out.print(i+"\t");
		System.out.println("\nSize of union is : "+ set.size());
	}

}
/*
 *Output
  1	2	3	4	5	
Size of union is : 5
 
*/