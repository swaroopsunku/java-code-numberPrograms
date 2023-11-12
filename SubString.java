package demo;

import java.util.Scanner;

public class SubString 
{
	public static void main(String[] args) 
	{
		System.out.println("ENter the String");
		String s=new Scanner(System.in).nextLine();
		for (int i = 0; i <s.length(); i++) 
		{
			String s1="";
			for (int j = i; j <s.length(); j++)
			{
				s1+=s.charAt(j);
				if (check(s1)&&s1.length()>1) 
				{
					System.out.println(s1);
				}
			}
		}		
	}
	public static boolean check(String s) 
	{
		String s1="";
		for (int i = 0; i <s.length(); i++)
		{
			s1=s.charAt(i)+s1;
		}
		if (s1.equalsIgnoreCase(s)) 
		{
			return true;
		}
		return false;
	}
	
}
