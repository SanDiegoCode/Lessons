package lesson2;



public class Main {

	public static void main(String[] args) {
		int number = 5; //declares five variables: three primitive, two strings
		String word = "hi";
		String anotherword = "hi";
		boolean trueorfalse = false;
		char letter = 'A';
		if(word==anotherword) //comparing references
			System.out.println("this shouldn't print");
		else if(word.equals(anotherword)) //comparing what is stored
			System.out.println("this SHOULD print");
		number = number * 13; //number = 65
		if(number==letter) //'A' = 65, so letter == number
			System.out.println("Will THIS print?");
		if(number/10==6.5)
			letter = 'f';
		else if(number/10==6) //truncates 
			letter = 't';
		System.out.print(letter);
		word = word + letter; 
		word = word + anotherword;
		if(word.substring(1, 3).equals("it"))
			System.out.println("Nailed it");
		double decimal = 3.14;
	}

}
