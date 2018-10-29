package programmers;

public class WaterMelon {
	public String watermelon(int n){
    String result = "";
    StringBuffer sb = new StringBuffer();
    for(int i = 1 ; i <= n; i++){
      if(i%2 == 1){
        sb.append("수");
      } else {
    	sb.append("박");
      }
    }
    result = sb.toString();
	return result;
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}