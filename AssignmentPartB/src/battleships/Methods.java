package battleships;

import java.util.ArrayList;
import java.util.Collections;

public class Methods {
	ArrayList<Integer> UsersCoords = new ArrayList<Integer>();// This is for tests only														
	ArrayList<Integer> AiLeftToGuess = new ArrayList<Integer>();// Guessing user's ships															
	ArrayList<Integer> AiNumbers = new ArrayList<Integer>();// AI ships Coords
	ArrayList<Integer> AiNumberLeftToPick = new ArrayList<Integer>();// AI options to pick from their ship Coords
	ArrayList<Integer> AiGuessed = new ArrayList<Integer>();
	int test = 1;
	int AIscore = 0;
	int Humanscore = 0;
	int place;
	int numShips;
	// private int AIGuessedCurrent;
	private static Core b = new Core();

	public void adder(int add) {
		UsersCoords.add(add);
	}

	public void fill() {// This provide the numbers for the AI to guess the
						// users ships
		for (int x = 1; x <= 100; x++) {
			AiLeftToGuess.add(x);
			// AiNumberLeftToPickV2.add(x);
		}
		Collections.shuffle(AiLeftToGuess);
		//System.out.println(AiLeftToGuess);
	}

	public void setter(int pass) {
		numShips = pass;
	}

	public void botPick() {// Fills array for the possible AI ships coords
		//for (int x = 301; x <= 600; x++) {
		for (int x = 101; x <= 200; x++) {
			AiNumberLeftToPick.add(x);
		}
		Collections.shuffle(AiNumberLeftToPick);
	}

	public void AiPickedNums() {
		for (int x = 0; x < numShips; x++) {
			int y = AiNumberLeftToPick.get(0);
			AiNumbers.add(y);
			AiNumberLeftToPick.remove(0);
		}
		//System.out.println(AiNumbers);// This needs to be removed as it is only
										// for testing reasons
	}

	public ArrayList<Integer> getList() {
		return AiNumbers;
	}

	public ArrayList<Integer> getAiGuessed() {
		return AiGuessed;
	}

	public Boolean hitChecker(int userTarget) {// User hitting AI ships
		int hitMiss = 0;
		for (int x = 0; x < AiNumbers.size(); x++) {
			if (userTarget == AiNumbers.get(x)) {
				hitMiss++;
			}
		}
		if (hitMiss > 0) {
			// System.out.println("You hit em");//Switch back on later
			b.setTurn(0);
			b.rounds();
			return true;
		} else {
			// System.out.println("You missed them");//Switch back on later
			b.setTurn(0);
			b.rounds();
			return false;
		}

	}

	public void AIhitChecker() {// AI Hitting user
		int hitMiss = 0;
		for (int x = 0; x < numShips; x++) {
			//System.out.println("AI guess: " + AiLeftToGuess.get(0));
			//System.out.println("USer coord: " + UsersCoords.get(x));
			int User = UsersCoords.get(x);
			int Ai = AiLeftToGuess.get(0);
			//if (AiLeftToGuess.get(0) == UsersCoords.get(x)) {
			if (User == Ai) {
				hitMiss++;
				Core.AiGuessedNhit.add(AiLeftToGuess.get(0));
				Core.botScore++;
			}
		}
		if (hitMiss > 0) {
			System.out.println("They hit you");
			AIscore++;
			b.setTurn(1);
			b.rounds();

		} else {
			System.out.println("They missed");
			b.setTurn(1);
			b.rounds();

		}
		AiGuessed.add(AiLeftToGuess.get(0));
		AiLeftToGuess.remove(0);

	}

	// public Boolean AIhitCheckerV2() {//User hitting AI ships
	// int hitMiss = 0;
	// for (int x = 0; x < numShips; x++) {
	// if (AiLeftToGuess.get(0) == UsersCoords.get(x)) {
	// hitMiss++;
	// }
	// }
	// if (hitMiss > 0) {
	// System.out.println("They hit you");
	// AIscore++;
	// b.setTurn(1);
	// b.rounds();
	// return true;
	//
	// } else {
	// System.out.println("The bastards missed");
	// b.setTurn(1);
	// b.rounds();
	// return false;
	// }
	//
	// }

	// public void pickedV3(ArrayList picked) {//AI hitting user ships
	// for (int AIGuessedCurrent = 0; AIGuessedCurrent < numShips;
	// AIGuessedCurrent++) {
	// int x = AiLeftToGuess.get(0);
	// int y = UsersCoords.get(AIGuessedCurrent);
	// AiGuessed.add(5);
	// //int x = 0;
	// //int y = 0;
	// //if (AiLeftToGuess.get(0) == picked.get(0)) {
	// if (x == y) {
	// System.out.println("AI hit you");
	// AIscore++;
	// //System.out.println(AIscore);
	// //AIGuessedCurrent = place;
	// //b.setTurn(1);
	// //b.rounds();
	// } else {
	// System.out.print("Miss ");
	// //b.setTurn(1);
	// //b.rounds();
	// }
	// }
	// //AiLeftToGuess.remove(AIGuessedCurrent);
	// AiGuessed.add(AiLeftToGuess.get(0));
	// AiLeftToGuess.remove(0);
	//
	// }

	// public void fillV2(int totalSquares) {
	// for (int x = 0; x < totalSquares; x++) {
	// AiLeftToGuess.add(x);
	// AiNumberLeftToPick.add(x);
	// }
	// Collections.shuffle(AiLeftToGuess);
	// Collections.shuffle(AiNumberLeftToPick);
	// System.out.println(AiLeftToGuess);
	// }

	// public void userGuessv2(int apple) {
	// for (int x = 0; x < 5; x++) {
	// if (apple == AiNumbers.get(x)) {
	// System.out.println("You hit Ai");
	// AiNumbers.remove(x);
	// Humanscore++;
	// x = place;
	// }
	// }
	// }

	// public void userPick() {
	// int user;
	// Scanner sc = new Scanner(System.in);
	// for (int z = 1; z <= place; z++) {
	// System.out.println("Enter you number");
	// user = sc.nextInt();
	// testArray.add(user);
	// }
	// }

	// public int passer() {
	// return place;
	// }

	// public boolean aiCheck() {
	// if (place == AIscore) {
	// System.out.println("AI wins!");
	// return true;
	// } else {
	// return false;
	// }
	// }

	// public boolean humanCheck() {
	// if (place == Humanscore) {
	// System.out.println("You win!");
	// return true;
	// } else {
	// return false;
	// }
	// }

	// public void test() {
	// System.out.println("Testing 1 2 3");
	// }

	// public void userPickV2() {
	// int user;
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Enter you number");
	// user = sc.nextInt();
	// for (int z = 0; z <= 5; z++) {
	// if (user == AiNumbers.get(z)) {
	// System.out.println("Hit");
	// } else {
	// System.out.print("miss");
	// }
	// }
	//
	// }

}