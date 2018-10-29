package codingDojang;

public class ToC {
	public int totalHour(int n) {
		int result = 0;

		for(int i = 0;i <= 2; i ++) {
			if(i == 2&& n == 2) {
				result += 3600*4;
				break;
			}
			if(i == n) {
				result += 36000;
			}
			for(int j = 0;j <= 9; j++) {
				if(i == 2 && j >= 4) {
					break;
				}else if(j == n) {
					result += 3600;
					break;
				}
				for(int k = 0; k <= 5; k++) {
					if(k == n) {
						result += 600;
						break;
					}
					for(int l = 0; l <= 9; l++) {
						if(l == n) {
							result += 60;
							break;
						}
						
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ToC three = new ToC();
		System.out.print(three.totalHour(5));
	}
}
