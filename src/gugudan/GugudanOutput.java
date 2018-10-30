package gugudan;

public class GugudanOutput {
	public void ggdOutput(int x, int y) {
		Gugudan ggd = new Gugudan();
		for (int i = 1; i <= y; i++) {
			System.out.println(ggd.ggdCalculator(x, i));
		}
	}
}
