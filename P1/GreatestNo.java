package org.example.ALL_PROBLEMS;
public class GreatestNo {
	private static int greatest(int a,int b,int c){
		int temp= a>b? a:b;
		return temp>c?temp:c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(greatest(5,3,1));
		
	}

}
