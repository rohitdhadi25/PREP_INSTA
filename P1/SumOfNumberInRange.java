package org.example.ALL_PROBLEMS;

public class SumOfNumberInRange {
	private static int sumInRange(int sum,int s,int e){
		if(s>e) {  //5----6
			return sum;
		}
		return s+sumInRange(sum,s+1,e); //5+sum(0,6,6);
	}
	public static void main(String[] args) {
		System.out.println(sumInRange(0,5,6));
		

	}

}
