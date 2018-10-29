package headfirstjava;

public class Beer {
	public static void beerSong() {
		int beerNum = 99;
		String word = "bottles";
		while(beerNum > 0) {
			if(beerNum == 1) {
				word = "bottle";
			}
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
			if(beerNum == 0) {
				System.out.println("No more bottles of beer on the wall");
			}
			;
		}
	}
	public static void poolPuzzleOne() {
		int x = 0;
		while(x < 4) {
			System.out.print("a");
			if(x < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if(x < 1) {
				System.out.print("oise");
				x = x - 1;
			}
			if(x == 1) {
				System.out.print("noys");
			}
			if(x > 1) {
				System.out.print(" oyster");
			}
			System.out.println("");
			x = x + 2;
		}
	}

	public static void main(String[] args) {
//		beerSong();
		poolPuzzleOne();
	}

}
