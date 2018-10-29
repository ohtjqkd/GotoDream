package codingDojang;

public class Oiler {
	public int oiler(int num) {
		int sum = 0;
		int sqrsum = 0;
		for(int i = 1; i <= num; i++) {
			sqrsum += i*i;
			sum += i;
		}
		int sumsqr = sum * sum;	
		return sumsqr - sqrsum;
	}
	public static void main(String[] args) {
		Oiler oil = new Oiler();
		System.out.print(oil.oiler(100));

	}

}
