package com.pratian.DemoMaven.main;

public class StringConcatenator {

	public String concatenate(String str1, String str2) throws InvalidInputException{
		// TODO Auto-generated method stub
		if(str1 == null && str2==null)
			throw new InvalidInputException();
		else if(str1==null)
			return str2;
		else if(str2==null)
			return str1;
		else 
		return str1+str2;
		//return "";
	}

}
