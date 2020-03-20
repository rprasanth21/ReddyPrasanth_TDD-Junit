package com.epam.tddjunitdemo;

public class Delete_A_InFirstTwoChars {
	

	public String remove_A_FromFirstTwoChars(String string) {
		 String str="";
		if(string.length()>=2 && string.charAt(0)=='A' && string.charAt(1)=='A')
		str=string.substring(2,string.length());
		else if(string.length()>=1 && string.charAt(0)=='A')
			str=string.substring(1,string.length());
		else if(string.length()>=2 && string.charAt(1)=='A')
			str=string.charAt(0)+string.substring(2,string.length());
		else
			str=string;
		return str;
	}
}
  