package programmers;

import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str){
	int inte = 0;
	for(int i = 0; i < str.length(); i++){
      for(int j = 1; j < str.length(); j++){
        if(str.codePointAt(i) < str.codePointAt(j)){
        }
      }
    }
		return str;
	}

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}
