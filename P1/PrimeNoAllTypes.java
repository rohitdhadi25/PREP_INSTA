package org.example.ALL_PROBLEMS;

public class PrimeNoAllTypes {
	private static boolean iterativePrime(int x){
		boolean isprime = true;
		if(x<2)
		{
			isprime=false;
		}
		for(int i=2;i<x;++i) {
			if(x%i==0) {
				isprime=false;
				break;
			}
		}
		return isprime?true:false;
		
		
	}
	public static void main(String[] args) {
		System.out.println(iterativePrime(8));
		
	}
	public static void main1(String[] args) {
		

	}

}
