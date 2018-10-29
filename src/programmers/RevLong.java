package programmers;

public class RevLong {
	  public void solution(long n) {
	      int[] answer = new int[(int) Math.log10(n)+1];
	      for(int i = 0; i <= (int) Math.log10(n); i++){
	          answer[i] = (int) ((n % Math.pow(10,i+1)) / Math.pow(10,i));
	          System.out.println(n);
	          n -= n % Math.pow(10, i+1);
	      }
	  }
	public static void main(String[] args) {
		RevLong rv = new RevLong();
		rv.solution(12345);
	}

}
