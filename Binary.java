package com.assignment;
//Decimal no to binary
public class Binary {

	public void convert(int d)
	{
		int binary[]=new int[20];
		
		System.out.print("Result after convertion: ");
		
		for(int i=0;d>0;i++) {
			binary[i]=d%2;
			d=d/2;
			System.out.print(binary[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Binary obj=new Binary();
         obj.convert(66);
	}

}
