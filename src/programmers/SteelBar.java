package programmers;
import java.util.Stack;
public class SteelBar {
	public int solution(String arrangement) {
//Stack solution
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                st.push(i);
            } else if (arrangement.charAt(i) == ')') {
                if (st.peek() + 1 == i) {
                    st.pop();
                    answer += st.size();
                } else {
                    st.pop();
                    answer += 1;
                }
            }
        }
        return answer;
//Good solution
		/*
		class Solution {
		    public int solution(String s) {
		        int q = 0;
		        int sticks = 0;
		        for (int i = 0; i < s.length(); i++) {
		            char c = s.charAt(i);

		            if (c == '(') {
		                q++;
		            } else if (s.charAt(i - 1) == '('){ // is laser
		                sticks += (--q);
		            } else {
		                q--;
		                sticks += 1;
		            }
		        }
		        System.out.println("");
		        return sticks;
		    }
		}*/

// my solution
		/*
		String[] tmp = arrangement.split("");
		int answer = 0;
		int stack = 0;
		for (int i = 0; i < tmp.length-1; i++) {
			if(tmp[i].equals("(")&&tmp[i+1].equals("(")) {
				stack++;
			} else if(tmp[i].equals("(")&&tmp[i+1].equals(")")){
				answer += stack;
			} else if(tmp[i].equals(")")&&tmp[i+1].equals(")")) {
				answer++;
				stack--;
			}
		}
		return answer;
		*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SteelBar sb = new SteelBar();
		System.out.println(sb.solution("()(((()())(())()))(())"));
	}

}
