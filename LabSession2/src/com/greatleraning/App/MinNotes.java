package com.greatleraning.App;

import java.util.Scanner;

public class MinNotes {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		int []denominationNotes;
		int []numberOfNotes;
		int amount;
		System.out.println("Enter the size of currency denominations:");
		size=sc.nextInt();
		denominationNotes=new int[size];
		numberOfNotes=new int[size];
		System.out.println("Enter the currency denominations values:");
		for(int  i=0;i<size;i++) {
			denominationNotes[i]=sc.nextInt();
		}
		MergeSort mSort=new MergeSort();
		mSort.sort(denominationNotes, 0,denominationNotes.length-1);
		System.out.println("Enter the amount you want to pay:");
		amount=sc.nextInt();
		for(int i=0;i<denominationNotes.length;i++) {
			int n=(amount/denominationNotes[i]);
			amount=amount-(n*denominationNotes[i]);	
			numberOfNotes[i]=n;
		}
		if(amount!=0) {
			System.out.println("Unable to pay with notes.");
		}else {
			System.out.println("Your payment approach in order to give min no of notes will be:");
			for(int i=0;i<denominationNotes.length;i++) {
				if(numberOfNotes[i]!=0) {
					System.out.println(denominationNotes[i]+":"+numberOfNotes[i]);
				}
			}
		}
	}

}
