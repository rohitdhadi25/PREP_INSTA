package org.example.ALL_PROBLEMS;

public class SumOfDigits {
	static int digitSum(int num,int sum) {
		if(num==0) return sum;
		sum=sum+num%10;
		return digitSum(num/10,sum);
	}
	static int digitSum(int num) {
		if(num==0) return 0;
		return num%10+digitSum(num/10);
	}
	static int digitSum(String s) {//concept: if i want to retreive a char value in integer type from a string then by only retrieving 
									//the specific charcter using charAt() and substract it with 48
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=s.charAt(i) - 48;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=digitSum(12345,0);
		System.out.println(sum1);
		int sum2=digitSum(12345);
		System.out.println(sum2);
		int sum3=digitSum("12345");
		System.out.println(sum3);

	}

}
