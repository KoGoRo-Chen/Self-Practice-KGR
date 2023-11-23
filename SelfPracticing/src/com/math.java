package com;

public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =IDK(10);
		System.out.println("=" + m);			
		}
	public int IDK (int n) {
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
			if(i < n) {
				System.out.print(i + "+");
			}else {
				System.out.print(i);
			}
		}
		System.out.println();
		return sum;
	}
}
