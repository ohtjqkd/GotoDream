package programmers;

public class Comb1and2 {
	public int solution(int n) {
	      int answer = 0;
	      int beforeN = 1;
	      int nextN = 2;
	      switch(n) {
	          case 1:
	              return beforeN;
	          case 2:
	              return nextN;
	      }
	      for(int i = 2; i < n; i++){
	          answer = beforeN + nextN;
	          beforeN = nextN;
	          nextN = answer;
	      }
	      
	      return answer;
	}
	public static void main(String[] args) {
		Comb1and2 c12 = new Comb1and2();
		for (int i = 0; i < 100; i++) {
			System.out.println(c12.solution(i));
			
		}
	}

}
