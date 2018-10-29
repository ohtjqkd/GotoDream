package programmers;

public class NLCM {
	public long nlcm(int[] arg) {
		long total = 1;
		int gcl = 0;
		for (int i = 0; i < arg.length-1; i++) {
			for (int j = i+1; j < arg.length; j++) {
				if(arg[i] < arg[j]) {
					int temp = arg[i];
					arg[i] = arg[j];
					arg[j] = temp;
				}
			}
		}
		for (int i = 0; i < arg.length; i++) {
			total = total * arg[i];
		}
		for(int i = arg[0]; i > 1; i--) {
			boolean bool = false;
			if(arg[0] % i ==0) {
				for(int j = 1; j < arg.length; j ++) {
					if(arg[j] % i!=0) {
						break;
					} else {
						bool = true;
					}
				}
			}
			if(bool = true) {
				gcl = i;
			}
		}
		int div = 1;
		for(int i = 0; i < arg.length-1; i++) {
			div = div * gcl;
		}
		return total/div;
	}
	
	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] arg = {30, 8, 65, 39, 20, 1, 23, 83, 65, 94};
		System.out.println(c.nlcm(arg));
		System.out.println();

	}

}
