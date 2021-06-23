package string;

public class ReverseString {
	static StringBuffer reverse(StringBuffer st) {
		int i=0,j=st.length()-1;
		while(i<j) {
			char temp=st.charAt(i);
			st.replace(i, i+1, st.substring(j, j+1));
			st.replace(j, j+1, Character.toString(temp));
			i++;
			j--;
		}
		return st;
	}
	public static void main(String ar[]) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("Debug : "+reverse(sb));
		
	}

}
