package com.currency;

import java.util.Arrays;
import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		
		
		System.out.println("enter the size of currency denominations ");
		Scanner input =new Scanner(System.in);
		int size=input.nextInt();
		int currDenominations[] = new int[size];
		int sortedDenominations[]= new int[size];
		System.out.println("enter the size of currency denominations ");
		for(int i=0;i<size;i++)
		{
		        currDenominations[i] = input.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = input.nextInt();
		
		CalculateMinNumberofNotes noofnotes= new CalculateMinNumberofNotes();
		sortedDenominations= noofnotes.sortArrayInDescendingOrder(currDenominations);
		//System.out.println(Arrays.toString(sortedDenominations));
		noofnotes.minNoOfNotes(sortedDenominations,amount);
		

	}

}
