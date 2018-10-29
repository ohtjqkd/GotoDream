package codingDojang;

public class AnyPung {
	public int pung (int[][] def) {
	int result = 0;
	int[][] pungpung = new int[5][5];
	for(int i = 0; i < pungpung.length; i++) {
		for(int j = 0; j < pungpung[0].length; j++) {
			result = i + j;
		}
	}

	return result;
}
	

	


	public static void main(String[] args) {
		AnyPung ap = new AnyPung();
		int[][] def = {{5,4,3,2,1},{4,3,2,1,0},{4,2,6,7,8},{1,4,6,3,6},{1,7,9,5,4}};
		System.out.println(ap.pung(def));
	}
}

