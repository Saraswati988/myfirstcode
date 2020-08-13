package com.pack.str;

class Reverse{
String str;
String rev=""; 
String str2;
String Reverse(String str) {
	char ch[]=str.toCharArray(); 
	
	  for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i]; 
	  }
	return rev;
}
	
 }

public class ReverseString {
	public static void main(String[] args) {
		 Reverse reverse=new  Reverse();
		String revs = reverse.Reverse("saraswati");
		System.out.println(revs);
		
	
		
		}
	}
