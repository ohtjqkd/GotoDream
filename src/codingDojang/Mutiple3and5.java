package codingDojang;

public class Mutiple3and5 {
	public int muti(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Mutiple3and5 multi = new Mutiple3and5();
		System.out.print(multi.muti(300));
		
	}

}
