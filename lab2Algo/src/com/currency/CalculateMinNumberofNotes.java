package com.currency;

import java.util.Arrays;
import java.util.Collections;

public class CalculateMinNumberofNotes {
	
	
	public int[] sortArrayInDescendingOrder(int arr[])
	{
	        int temp=0;
	       int n= arr.length;
	       for (int i = 0; i < arr.length; i++) {     
	           for (int j = i+1; j < arr.length; j++) {     
	              if(arr[i] < arr[j]) {    
	                  temp = arr[i];    
	                  arr[i] = arr[j];    
	                  arr[j] = temp;    
	              }     
	           }     
	       }
		return arr;
		 
	}
	
	public void minNoOfNotes(int[] arr,int amt)
	{
		int noteCount[]=new int [arr.length];
		try { 
		for(int i =0;i< arr.length;i++)
		{
			if(amt>=arr[i])
			{
				noteCount[i]=amt/arr[i];
				amt=amt-noteCount[i]*arr[i];
				
			}
		}
		if(amt>0)
		{
			System.out.println("exact amount cannot be given with highest denominations");
		}
		else {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0;i<arr.length;i++)
			{
				if(noteCount[i] != 0)
				{
					System.out.println(arr[i] +":" +noteCount[i]);
				}
			}
		}
		} catch(Exception e)
		{
			System.out.println("Denominations cannot have value zero. Enter valid denomination");
		}
		
		
		
		
		
		
	}

}
