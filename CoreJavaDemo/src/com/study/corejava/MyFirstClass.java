package com.study.corejava;

class MyFirstClass {

	String fName;
	String  lName;
	int id;
	private static MyFirstClass e2;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstClass e1 = new MyFirstClass();
		e1.fName = "David";
		e1.lName="Schwimmer";
		e1.id = 1001;
		System.out.println(e1.fName);
		e2 = new MyFirstClass();
		e2.fName = "Cortney";
		e2.lName = "Cox";
		e2 = null;
		
		try{
		System.out.println(e2.lName);
		}
		catch(Exception e){
			 System.out.println("Do not understand this");
		}
	

	}	


}


