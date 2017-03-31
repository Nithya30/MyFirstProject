package com.study.corejava;

class MyFirstClass {

	String fName;
	String  lName;
	int id;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstClass e1 = new MyFirstClass();
		e1.fName = "David";
		e1.lName="Schwimmer";
		e1.id = 1001;

		MyFirstClass e2 = null;
		System.out.println(e1.fName);
		try{
		System.out.println(e2.lName);
		}
		catch(Exception e){
			 System.out.println("Do not understand this");
		}
	

	}	


}


