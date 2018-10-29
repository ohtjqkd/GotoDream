package programmers;
//경우의 수가 너무 커져서 사용불가능한 class
public class JumpCase {
	public double jumpCase(int num) {
		JumpCase jc = new JumpCase();
		double answer = 1;
		for (int i = 1; i <= num - i; i++) {
			double way = jc.numberOfWay(num-i, i);
			double div = jc.factorial(i);
			double diver = way/div;
			System.out.println("factorial" +div);
			answer = answer + diver;
			System.out.println("answer" + answer);
		}
		return answer;
	}
	public double numberOfWay(int n, int m) {
		double result = 1;
		for (int i = n; i > n - m; i--) {
			result = result * i;
			System.out.println("way" + result);
		}
		return result;
	}
	public double factorial (int n) {
		if(n == 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		JumpCase jc1 = new JumpCase();
		System.out.println(jc1.jumpCase(33));
	}

}
