package com;

public class Test {

	public static void main(String[] args) {
		int num = 9;
		int newnum= add10(num);
		System.out.println("in main, num =" + newnum);
		}
	public static int add10(int num) {
		num = num+10;
		return num;
	}
}
