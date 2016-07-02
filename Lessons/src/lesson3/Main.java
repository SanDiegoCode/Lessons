package lesson3;

public class Main {

public static void main(String[] args)
	{
		for(int liav=65; liav<65+26; liav++)
			System.out.print((char)liav);
		int size = 10;
		for(int i=0; i<size; i++)
		{
			for(int k=0; k<size-i; k++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
