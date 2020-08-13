package com.pack.str;

public class Str_Dgt {
	
	public static void main(String[] args) {
		String str="0123456789";
		char[] arr = str.toCharArray();
		int count=0, flag=0;
		int l=str.length();
		
		for(int i=0;i<1;i++) {
			if(arr[i]>='0' && arr[i]<='9')
			{
				count++;
				flag=1;
			}
		}
		
		if(count==1)
System.out.println("all are only digits in array");
		if(count==10)
			System.out.println("10 digits in a string");
		else if(flag==1)
		System.out.println("few digits in string");
		else {
			System.out.println("dsjdajgrjwrgqjrjqrq");
		}
	}
	

}
