package com.punam.java.demo;

public class SplitString 
{
	public static void main(String[] args) 
	{
		String s1="Java,Selenium,TestNG,Maven";
		String a[]=s1.split(",");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	

}
