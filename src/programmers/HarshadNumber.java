package programmers;
public class HarshadNumber{
	public boolean isHarshad(int num){
		int ret = 0;
		String str = num + "";
		String[] cipher = str.split("");
		for(int i = 0;i < str.length(); i++) {
			ret += Integer.parseInt(cipher[i]);
		}
		if(num % ret == 0) {
			return true;
		}
		return false;
	}
  
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));
	}
}