package org.example.ALL_PROBLEMS;

public class SumOfNumbers {
	private static int sum(int n){
		if(n==0) {
			return n;
		}
		else
		{
			return n + sum(n-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10));

	}

}
