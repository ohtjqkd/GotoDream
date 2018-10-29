package programmers;
public class NextBigNumber{
	public String transBin(int n) {
		String bin = "";
        int transN = n;
        while(transN > 0) {
        	String temp = transN % 2 + "";
        	bin = temp + bin;
        	transN = Math.floorDiv(transN, 2);
        }
        return bin;
	}
	public int findOne(String n) {
		String str = "";
		int cnt = 0;
		str = String.valueOf(n).toString();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') {
				cnt++;
			}
		}
		return cnt;
	}
    public int nextBigNumber(int n) {
    	int result = 0;
    	NextBigNumber s1 = new NextBigNumber();
    	NextBigNumber s2 = new NextBigNumber();
        boolean flag = false;
        int start = n;
        int first = s1.findOne(transBin(start));
        int x = 1;
        while(flag == false) {
        	int bool = s2.findOne(transBin(start + x));
        	if(bool == first) {
        		return start + x;
        	}
        	x++;
        }
        return result;
    }
//    public int nextBigNumber2(int n) {
//            int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
//			System.out.println(postPattern);
//            return n + postPattern | smallPattern;
//    }
    public static void main(String[] args)    {
        NextBigNumber test = new NextBigNumber();
        int n = -78;
        System.out.println(test.nextBigNumber(n) + "의 이진수" + test.transBin(test.nextBigNumber(n)));
//        System.out.println(test.nextBigNumber2(n));
        String a = Integer.toBinaryString(-78);
        String b = Integer.toBinaryString(78);
        System.out.println(a);
        System.out.println(b);
        System.out.println(78&-78);
        
    }
}