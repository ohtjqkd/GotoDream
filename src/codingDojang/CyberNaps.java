package codingDojang;

public class CyberNaps {
	public String findKim(String str) {
		String[] strK = str.split(",");
		int countK = 0;
		int countL = 0;
		for(int i = 0; i < strK.length;i++) {
			String init = strK[i].substring(0, 1);
			if(init.equals("김")) {
				countK += 1;
			} else if(init.equals("이")) {
				countL += 1;
			}
		}
		String result = "김씨: " + countK + " 이씨: " + countL;
		return result;
	}
	public int findFname(String str, String name) {
		int result = 0;
		String[] tStr = str.split(",");
		for(int i = 0; i < tStr.length; i++) {
			if(tStr[i].equals(name)) {
				result += 1;
			}
		}
		return result;
	}
	public String delDup(String str) {
		String[] dup = str.split(",");
		String result = dup[0];
		for(int i = 1; i < dup.length; i++) {
			boolean flag = true;
			for(int j = 1; j <= i; j++){
				if(dup[i].equals(dup[i-j])) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				result = result.concat("," + dup[i]);
			}
		}
		return result;
	}
	public String sortName(String str) {
		
		String[] sort = str.split(",");
		for(int i = 0; i < sort.length - 1; i++) {
			for(int j = i + 1; j < sort.length; j++) {
				if(sort[i].compareTo(sort[j]) > 0) {
					String temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			
			}
		}
		String result = sort[0];
		for(int i = 1; i < sort.length; i++) {
			result = result.concat("," + sort[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		String str = new String("이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌");
		CyberNaps fK = new CyberNaps();
		CyberNaps fJY = new CyberNaps();
		CyberNaps del = new CyberNaps();
		CyberNaps sort = new CyberNaps();
		System.out.println(fK.findKim(str));
		System.out.println(fJY.findFname(str,"이재영"));
		System.out.println(del.delDup(str));
		System.out.println(sort.sortName(del.delDup(str)));
	}

}
