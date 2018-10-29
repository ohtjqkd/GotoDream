package programmers;

public class FindBigSquare {
	public int solution(int[][] board) {
		int answer = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j] == 1) {
					for (int j2 = i + 1; j2 < board.length; j2++) {
						if(board[j2][j] == 1) {
							for (int k = 0; k < board.length; k++) {
								for (int k2 = 0; k2 < board.length; k2++) {
									
								}
							}
						}
					}
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		FindBigSquare fbs = new FindBigSquare();
		
	}

}
