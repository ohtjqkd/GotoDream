package gugudan;

public class InputValue {
	private int input1;
	private int input2;
	public void set() {
		this.input1 = 1;
		this.input2 = 1;
	}
	public void set(int input1, int input2) {
		this.input1 = input1;
		this.input2 = input2;
	}
	public void set(String[] str) {
		input1 = Integer.parseInt(str[0]);
		input2 = Integer.parseInt(str[1]);
	}
	public int getInput1()	{
		return input1;
	}
	public int getInput2() {
		return input2;
	}
	
}