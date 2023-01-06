//IT21049354
//Athauda A.M.I.R.B
//Foundations of Algorithms - Assigment Question 2

package Question02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		
		String strA;
		String strB;
		
		Scanner s = new Scanner(System.in);
		
		//getting the string value for A from the user
		System.out.println("Input String A: ");
		strA = s.next();
		
		//getting the string value for B from the user
		System.out.println("\nInput String B: ");
		strB = s.next();
		
		//displaying the output
		System.out.println("\nMinimum No of Operations: "+ swap(strA,strB));
		
	}
	
	private static int swap(String a,String b)
	{
		//this will get the swap count at the end
		int count = 0;
		
		//if the length of the binary strings are different, it cannot be swap
		//so first check length of the both strings are equal or not
		if(a.length() != b.length())
		{
			return -1;
		}
		
		//if the length of the strings are equal
	
		for(int i=0; i < a.length(); i++)
		{
			//this will check the char value at the given index number(i) is not equal to the char value at the given index number(i) in b string
			if(a.charAt(i) != b.charAt(i))
			{
				//first this will check if there are more indexes to check with the length of the string a
				//then it will check the current index of a is equal to the next index of b
				//and then it will check the next index of a is equal to the current index of b
				if(i+1 < a.length() && a.charAt(i) == b.charAt(i+1) && a.charAt(i+1) == b.charAt(i))
				{
					//if all the above conditions are true, then string can be swapped
					count = count+1;
					
					//checking the next pair in the string
					i = i+2;
				}
				else
				{
					//exit if string cannot be swapped
					return -1;
				}
				
			}
			
		}
		return count;

	}

}
