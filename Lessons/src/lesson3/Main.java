package lesson3;

public class Main {

public static void main(String[] args)
	{
		for(int liav=65; liav<65+26; liav++) //makes a string with all cap letters in order
			System.out.print((char)liav);
		int size = 10;
		for(int i=0; i<size; i++) //size is height of pyramid
		{
			for(int k=0; k<size-i; k++) //printing spaces before each row
			{
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) //printing each row of stars
				System.out.print("*");
			System.out.println();
		}
	}
}
