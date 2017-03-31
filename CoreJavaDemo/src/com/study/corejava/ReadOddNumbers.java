package com.study.corejava;

public class ReadOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val;
		for (int i=0;i<10;i++){
			val = i;
			
			if ((val%2) == 0){
				System.out.println(val);
				continue;
				
			}
		}

	}

}
