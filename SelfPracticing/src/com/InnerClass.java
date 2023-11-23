package com;

public class InnerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Circle {
	private double radius;
	private Color clr;
	
	public Circle(double r, String c) {
		radius = r;
		clr = new Color(c);
		System.out.println("Circle()建構子被呼叫了");
	}
	public void show() {
		System.out.println(radius +","+ clr.color);
	}
	
	private class Color {
		private String color;
		Color(String c){
			color = c;
			System.out.println("Color()建構子被呼叫了");
		}
	}
}

