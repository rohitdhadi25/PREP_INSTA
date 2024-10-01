package org.example.ALL_PROBLEMS;

public class PelindromicReverseNumber {
	
	static boolean reversePelindrom(int n){
		int rev=0;
		int p=n;
		while(p>0) {
			int rem=p%10;
			rev=rev*10+rem;
			p/=10;
		}
		if(n==rev) return true;
		return false;
	}
	
	static int revereseRecursivePelindrom(int n,int rev) {
		if(n==0)  return rev;
		rev=rev*10+n%10;
		return revereseRecursivePelindrom(n/10, rev);
	}
	
	static boolean reverseNumberToStringPelindrom(String str) {
		char[]ch=str.toCharArray();
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(ch[i]!=ch[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	static boolean reverseNumberToStringUsingStringBuilderPelindrom(StringBuilder str){
		String s=str.reverse().toString();
//		return str.equals(s);
		return str.equals(s) ;
	}
	
	//STACK
	
	
	public static void main1(String[] args) {
		System.out.println( reversePelindrom(12221)); //false
		System.out.print(revereseRecursivePelindrom(12221,0)==12221);
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNumberToStringPelindrom("12331"));
		System.out.println();
//		boolean s =reverseNumberToStringUsingStringBuilderPelindrom(new StringBuilder("121321"));
//		System.out.println(s);
		boolean s =reverseNumberToStringUsingStringBuilderPelindrom(new StringBuilder("-1"));
		System.out.println(s);

	}

}
