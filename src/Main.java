//run MineSweeper
public class Main {

	public static void main(String[] args) {
		//reset wins and looses to 0
		KeepScore.init();
		//start a new game with easy version
		new MineSweeper("easy");
	}

}
