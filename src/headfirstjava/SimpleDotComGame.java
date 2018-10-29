package headfirstjava;
import java.util.*;

public class SimpleDotComGame {
	int[] locationCells;
	int numOfHits;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for (int i = 0; i < locationCells.length; i++) {
			if (guess == locationCells[i]) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		int numOfGuesses = 0;
		Scanner sc = new Scanner(System.in);
		SimpleDotComGame sd = new SimpleDotComGame();
		int startPoint = (int) (Math.random()*5);
		int[] target = {startPoint, startPoint+1, startPoint+2};
		sd.setLocationCells(target);
		boolean flag = true;
		while(flag) {
			System.out.print("enter a number ");
			String input = sc.next();
			numOfGuesses++;
			if(sd.checkYourself(input)=="kill") {
				break;
			}
		}
		sc.close();
		System.out.println(numOfGuesses);
	}

}
