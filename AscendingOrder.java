package com.pack.str;


	
	
	public class  AscendingOrder 
	{
	    public static void main(String[] args) 
	    { 
	    	int[] arr= {1,2,4,5,6};
	    	int temp=0;
	      
	        for (int i = 0; i < 5; i++) 
	        {
	           
	        for (int j = 0; j < 5; j++) 
	        {
	           
	            
	                if (arr[i] > arr[j]) 
	                {
	                    temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	      for(int i=0; i<5; i++) {
	    	  System.out.print(arr[i]+", ");
	      }
	    }
	}


