package com.averageCalculator;

import java.util.Scanner;

import com.findAverage.*;

public class AverageAgeTest {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		CalculateAverage avg=new CalculateAverage();
	    System.out.println("Enter total no.of employees:");
	    int n=sc.nextInt();	    
	    if(n<2)
	    {
	    	System.out.println("Please enter a valid employee count");
	    	return;
	    }
	    int arr[]=new int[n];
	    
	    System.out.println("Enter the age for "+n+" employees:");
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]<=28 || arr[i]>=40)
	        {
	        	System.out.println("Invalid age encountered!");
	        	return;
	        }
	    }
	     
	    
	    double s=avg.calculateAverage(arr);
	    
	    System.out.printf("The average age is %.2f",s);
	}
}
