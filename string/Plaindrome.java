package string;

public class Plaindrome {
	static boolean palin(String s) {
		boolean palin=true;
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				palin=false;
				break;
			}
			i++;
			j--;
		}
		return palin;
	}
	public static void main(String []args) {
		String s= "abca";
		if(palin(s))
			System.out.println(s+" is palindrome");
		else
			System.out.println(s+" is not palindrome");
		
	}

}
