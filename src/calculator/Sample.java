package calculator;
import java.util.Scanner;
public class Sample {
	public static void main(String[] args) {
		int result;
		int inputInt;
		String inputSymbol;
		Scanner sc = new Scanner(System.in);
		result = sc.nextInt();
		while (sc.hasNext()) {
			String symbol = sc.next();
			if("quit".equals(symbol)) break;
			inputInt = sc.nextInt();
			if("+".equals(symbol)) {
				result += inputInt; 
			} else if("-".equals(symbol)) {
				result -= inputInt;
			} else if("*".equals(symbol)) {
				result *= inputInt;
			} else if("/".equals(symbol)) {
				result = (int) (result / inputInt);
			} else {
				System.out.println("�����ȣ ����");
			}
		}
		sc.close();
		System.out.println("��� ��: " + result);

	}

}
