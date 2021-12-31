package com.greatleraning.App;

import java.util.Scanner;

public class PayMoneyDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		int []transactionArray;
		int targetAchieved;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		size=sc.nextInt();
		transactionArray=new int[size];
		for(int i=0;i<transactionArray.length;i++) {
			System.out.println("Enter Value at "+(i+1)+"th place of array:");
			transactionArray[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved:");
		size=sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value of target:");
			targetAchieved=targetAchievedAt(sc.nextInt(),transactionArray);
			if((targetAchieved+1)>0) {
				System.out.println("Target achieved after "+(targetAchieved+1)+" transactions\n");
			}else {
				System.out.println("Given target is not achieved.\n");
			}
			//
		}
	}

	private static int targetAchievedAt(int nextInt, int[] transactionArray) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int j=0;j<transactionArray.length;j++) {
			sum=sum+transactionArray[j];
			if(sum>=nextInt) {
				return j;
			}
		}
		return -1;
	}
}
