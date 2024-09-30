package org.example.ALL_PROBLEMS;

public class ReverseNumber {
	static void iterReverse(int num) {
		int rem;int rev;
		rem=rev=0;
		while(num>0) {
			rev=rev*10+num%10;;
			num/=10;
		}
		System.out.println(rev);
	}
	static void recursiveReverse(int num) {
		if(num==0) return ;
		int rem=num%10;
		System.out.print(rem);
		recursiveReverse(num/10);
		
	}
	static void recursiveReverse2(int num) {
		boolean negOrPos= num<0? true:false;
		if(negOrPos) num=num*(-1);
		myReverse(num);
		
	}
	//HELPER METHOD
	private static void myReverse(int num) {
		if(num==0) return ; 
		int rem=num%10;
		System.out.print(rem);
		myReverse(num/10);
		
	}
	public static void main(String[] args) {
		iterReverse(1234);
		recursiveReverse(1234);
		System.out.println();
		recursiveReverse2(-1234);

	}

}
