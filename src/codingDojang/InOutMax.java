package codingDojang;

public class InOutMax {
	public String inOutMax(int oP, int oC, int addP, int[] addC) {
		int result = 0;
		int totalPrc = oP;
		int totalCap = oC;
		int CDP = totalPrc/totalCap;
		String eachValue = "";
		for(int i = 0; i < addC.length; i++) {
			for(int j = i + 1; j < addC.length; j++) {
				if(addC[i] < addC[j]) {
					int temp = addC[i];
					addC[i] = addC[j];
					addC[j] = temp;
				}
			}
		}
		for(int i = 0; i < addC.length; i++) {
			totalPrc += addP;
			totalCap += addC[i];
			if(CDP < totalCap/totalPrc) {
				CDP = totalCap/totalPrc; 
			} else {
				break;
			}
			if(eachValue !="") {
				eachValue += ", " + addC[i];
			} else {
				eachValue += addC[i];	
			}
			result = CDP;
		}
		return "가성비 최대값: " + result + " 추가부품: " + eachValue;
	}

	public static void main(String[] args) {
		int oP = 10;
		int oC = 150;
		int addP = 3;
		int[] addC = {30, 70, 15, 40, 65};
		InOutMax iom = new InOutMax();
		System.out.println(iom.inOutMax(oP, oC, addP, addC));

	}

}
