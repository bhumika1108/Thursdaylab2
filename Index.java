package com.assignment;

public class Index {
	 
	int[] arr= {23,45,32,11,33,656,33};
	
	public int Maximum() {
	int index=0;
    int max=arr[0] ;
    for(int i=0;i<arr.length;i++) 
    {
  	     
  	      if(arr[i]>max)
  	      {
  	     	 max=arr[i];
  	     	 index=i;
  	      }	
    }
    
    return index;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Index obj=new Index();
      System.out.println("Index of greatest number is:" + obj.Maximum());
	}
}