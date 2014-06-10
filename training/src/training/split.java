package training;

import java.util.Scanner;
public class split
{   
	public static void main(String args[])    
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string: "); 
		String str=s.nextLine(); 
		char[] carr=str.toCharArray(); 
		System.out.println("Converted To Charecters :"); 
		for(int i=0;i<carr.length;i++) 
		{    
			System.out.println(carr[i]); 
			}   
		}
	}
