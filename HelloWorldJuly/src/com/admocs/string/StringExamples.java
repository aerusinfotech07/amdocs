package com.admocs.string;

public class StringExamples {

	public static void main(String[] args) {
		String str="Hello"; //Literal Way to declare String
		String strNew=new String("Hello World");
		String strAnother="Hello World"; //Literal Way to declare String
		String strNewAnother=new String("Hello World");
		String strAnother2="Hello World"; //Literal Way to declare String
		String str3=strNew;
		
		String strUpper="WORLD";
		strUpper=null;
		String strConcat=str.toUpperCase().concat(" ").concat("WORLD");
		
		
		
		String fruits="Apple,mangoes,banana ";
		String fruitsArray[]=fruits.split(",");
		System.out.println(fruitsArray);
		
		
		
		
		
	}

}
