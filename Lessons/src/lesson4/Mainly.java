package lesson4;

import java.util.ArrayList;

public class Mainly {
	
	static int prime(int posspri)
	{
		for(int i=2; i<=posspri/2; i++)
			if(posspri % i == 0)
				return i;
		return -1;
	}
	
	static void primeFactorization(int big, ArrayList<Integer> facts)
	{
		int smol = prime(big);
		if(smol==-1)
			facts.add(big);
		else
		{
			primeFactorization(smol, facts);
			primeFactorization(big/smol, facts);
		}
			
	}
	
	static void printArray(ArrayList<Integer> facts)
	{
		for(int i : facts)
			System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		primeFactorization(1089, factors);
		printArray(factors);
	}
}
