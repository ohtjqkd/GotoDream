package codingDojang;

public class OneToTho {
	public int oTT() {
		int result = 0;
		// 10 ~ 1000까지 값을 갖는 배열 생성 후 문자열로 변경
		String[] array = new String[991];
		for(int i = 0; i <= 990; i++) {
			int temp = i + 10;
			array[i] = Integer.toString(temp);
		}
		
		for(int i = 0; i < array.length; i++) {
			String[] temp = array[i].split("");
			int tempMulti = 1;
			for(int j = 0; j < temp.length; j++) {
				if(temp[j].equals(0)) {
					break;
				}
				tempMulti = tempMulti*Integer.parseInt(temp[j]);
			}
			result += tempMulti;
		}
		return result;
	}

	public static void main(String[] args) {
		OneToTho ot = new OneToTho();
		System.out.print(ot.oTT());

	}

}
