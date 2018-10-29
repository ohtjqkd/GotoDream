package programmers;

public class Airport {
	public int optiAirport(int n, int[][] city) {
		int location = 0;
		int[] arg = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arg[i] = arg[i] + Math.abs((city[i][0]-city[j][0]))*city[j][1];
			}
			System.out.println(arg[i]);
		}
		location = Airport.maxNum(arg,n);
		System.out.println(location);
		return location;
	}
	public static int maxNum(int[] arg, int n) {
		
		int maxN;
		
		if(arg[n] >= arg[n-1]) {
			maxN = arg[n];
		} else {
			maxN = arg[n-1];
		}
		if(n<3) return maxN;
		return Math.max(maxN, maxNum(arg, n-1));
	}
	public static void main(String[] args) {
		Airport test = new Airport();
        int tn = 3;
        int [][]tcity = {{1,5},{2,2},{3,3}};
        System.out.println(test.optiAirport(tn,tcity));

	}

}
