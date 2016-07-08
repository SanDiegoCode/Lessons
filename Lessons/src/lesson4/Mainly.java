package lesson4;

import java.util.ArrayList;

public class Mainly {
	//prime factor calculator
	static int prime(int posspri) //a function that determines whether posspri is prime, returns first 
	{                             //factor
		for(int i=2; i<=posspri/2; i++)
			if(posspri % i == 0)
				return i;
		return -1;
	}
	//resursive method finding all prime factors of int big and placing them into facts
	static void primeFactorization(int big, ArrayList<Integer> facts)
	{
		int smol = prime(big);
		if(smol==-1)
			facts.add(big); //if the int is prime, it adds it to facts
		else
		{
			primeFactorization(smol, facts); //calls the function for the two numbers that multiply
			primeFactorization(big/smol, facts);//to get int big
		}
			
	}
	//prints all ints in the array
	static void printArray(ArrayList<Integer> facts)
	{
		int currentPow=1;
		for(int i=0; i<facts.size(); i++)
		{
			if(i==0)
				System.out.print(facts.get(i));
			else
			{
				if(facts.get(i)!=facts.get(i-1))
				{
					if(currentPow==1)
						System.out.println();
					else
						System.out.println("^"+currentPow);
					System.out.print(facts.get(i));
					currentPow=1;
				}
				else
					currentPow++;
			}
		}
		if(currentPow!=1)
			System.out.println("^"+currentPow);
	}
	
	static void justPrint(ArrayList<Integer> facts)
	{
		for(int i : facts)
			System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		primeFactorization(108372, factors);
		printArray(factors);
		//justPrint(factors);
	}
}
