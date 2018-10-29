package practice;

public class Factorial {
	public int factorial (int n) {
		if(n == 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.print(f.factorial(5));
	}

}
