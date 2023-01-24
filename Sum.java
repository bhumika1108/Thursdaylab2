package com.assignment;
import java.util.Scanner;

public class Sum 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  digit,sum1=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
	    num= sc.nextInt();
	    
		 while(num>0)
		 {
			 digit= num%10;
			 sum1=digit+sum1;
			 num=num/10;
		 }
		Sum obj= new Sum();
	    System.out.println( "Sum of digits: "+ sum1);
		
	}
}
