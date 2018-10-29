package headfirstjava;

import java.util.ArrayList;

public class DotComBust {
	GameHelper helper = new GameHelper();
	ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	int numOfGuesses = 0;
	
	public void setUpGame() {
		DotCom dc1 = new DotCom();
		dc1.setName("wework.com");
		DotCom dc2 = new DotCom();
		dc2.setName("qtrak.com");
		DotCom dc3 = new DotCom();
		dc3.setName("tyler.com");
		dotComsList.add(dc1);
		dotComsList.add(dc2);
		dotComsList.add(dc3);
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}
	public void startPlaying() {
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
	public void checkUserGuess(String userGuess) {
		numOfGuesses++;
		String result = "miss";
		for (DotCom dotComToTest : dotComsList) {
			result = dotComToTest.checkYourself(userGuess);
			if(result.equals("hit")) {
				break;
			}
			if(result.equals("kill")) {
				dotComsList.remove(dotComToTest);//this로도 test해보자!
				break;
			}
		}
		System.out.println(result);
	}
	public void finishGame() {
		System.out.println("Game Over");
		if(numOfGuesses <= 18) {
			System.out.println("Conglaturation. You got good score.");
		} else {
			System.out.println("Come on! Do your best!!");
		}
	}
	public static void main(String[] args) {
		DotComBust db = new DotComBust();
		db.setUpGame();
		db.startPlaying();
	}


}
