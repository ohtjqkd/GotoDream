package gugudan;

public class GugudanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GugudanInput ggdIn = new GugudanInput();
		InputValue iv = new InputValue();
		GugudanOutput ggdOut = new GugudanOutput();
		iv.set(ggdIn.input());
		ggdOut.ggdOutput(iv.getInput1(),iv.getInput2());
	}
}
