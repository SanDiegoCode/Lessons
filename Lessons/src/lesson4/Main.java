package lesson4;

public class Main {
	
	static double cylinderVol(int rad, int height) {
		return Math.PI * rad * rad * height;
	}
	//precondition: one>two
	static int lcm(int one, int two) {
		
		for(int i=one; i<=one*two; i+=one)
			if(i % one == 0 && i % two == 0)
				return i;
		return one*two;
	}
	
	static String properForm(int nume, int deno) {
		int units = nume / deno;
		int left = nume % deno;
		return units+" + "+simplifyFrac(left,deno);
	}
	
	static String simplifyFrac(int nume, int deno) {
		if(deno%nume==0)
			return 1+"/"+deno/nume;
		for(int i=nume/2; i>=1; i--)
			if(deno%i==0 && nume%i==0)
				return nume/i+"/"+deno/i;
		return nume+"/"+deno;
	}
	
	public static void main(String[] args) {
		System.out.println(lcm(8,6));
		System.out.print(properForm(42,24));
	}
}
