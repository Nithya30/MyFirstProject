package com.study.corejava;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo m1 = new MethodDemo();
		int a,b;
		a=5;
		b=2;
		int c = m1.add(a,b);
		System.out.println("Added value:" +c);
		int d = m1.sub(a,b);
		System.out.println("substracted value:" +d);
	}
	int add (int x,int y){
		return x+y;
		
	}
	int sub (int x,int y){
		
			int z = x-y;
			return z ;
	
}
}



