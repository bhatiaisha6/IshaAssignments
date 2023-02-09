package assignment.W1D2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4

		
		/*
		 * 
		 * Hint: Iterate through all numbers from 2 to n-1 (input) and 
			for every number check if it divides n (input). 
			If we find any number that divides, print prime.
			If nothing divides, then print non-prime
		 */
		
		
		int n = 14;
		
		int count = 0;
		
		for (int i = 2; i <= (n-1); i++)
			
		{
			if(n%i == 0)
			{
				count++;
			}

		}
		
		if(count==0)
			System.out.println(n+" is a Prime number");
		
		else 
			System.out.println(n+" is NOT a Prime number");
		
	}
		
	
		
	}