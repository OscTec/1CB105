package battleships;

import java.awt.Label;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
//Set to 5 ships in 10 by 10 grid
public class Core extends Application {
	private static Methods a = new Methods();
	private static final int TILE_SIZE = 40;
	//private static final int W = 800;
	//private static final int H = 600;
	private static final int W = 400;
	private static final int H = 400;
	BorderPane Layout = new BorderPane();
	Scene scene = new Scene(Layout, 850, 400);
	private static final int Horizontal_Tiles = W / TILE_SIZE;
	private static final int Vertical_Tiles = H / TILE_SIZE;
	private int count = 0;
	private int Counter = 0;
	private int VH = 0;
	private static int turn = 1;
	protected static int humanScore = 0;
	protected static int botScore = 0;
	protected static int numShips = 5;// How many ships to pick
	protected static int totalSquares = Horizontal_Tiles * Vertical_Tiles;
	private static ArrayList<Integer> userPickedTiles = new ArrayList<Integer>();
	private static ArrayList<Integer> AiGuessed = new ArrayList<Integer>();
	protected static ArrayList<Integer> AiGuessedNhit = new ArrayList<Integer>();
	Pane root = new Pane();
	Pane bot = new Pane();
	Pane Stats = new Pane();

	private Parent HumanSquares() {
		root.setPrefSize(W, H);
		for (int V = 0; V < Vertical_Tiles; V++) {
			for (int H = 0; H < Horizontal_Tiles; H++) {
				VH++;
				userTile tile = new userTile(H, V, VH);
				root.getChildren().add(tile);
			}
		}
		return root;
	}

	private Parent BotSquares() {
		bot.setPrefSize(W, H);
		for (int V = 0; V < Vertical_Tiles; V++) {
			for (int H = 0; H < Horizontal_Tiles; H++) {
				VH++;
				botTile Square = new botTile(H, V, VH);
				bot.getChildren().add(Square);
			}
		}
		return bot;
	}

	private class userTile extends StackPane {
		private boolean isOpen = false;
		private Rectangle border = new Rectangle(TILE_SIZE - 2, TILE_SIZE - 2);
		private int xy;

		public userTile(int x, int y, int xy) {
			this.xy = xy;
			border.setStroke(Color.LIGHTGRAY);
			getChildren().addAll(border);
			setTranslateX(x * TILE_SIZE);
			setTranslateY(y * TILE_SIZE);
			setOnMouseClicked(e -> openUser());
			// if (Counter > 0) {
			// for (int count3 = 0; count3 < userPickedTiles.size(); count3++) {
			// int tester1 = (int) userPickedTiles.get(count3);
			// if (AiGuessed.get(AiGuessed.size() - 1) == tester1) {
			// AiGuessedNhit.add(userPickedTiles.get(count3));
			// userPickedTiles.remove(count3);
			// }
			// }

			for (int count2 = 0; count2 < AiGuessed.size(); count2++) {
				int tester2 = AiGuessed.get(count2);
				if (xy == tester2) {
					border.setFill(Color.BLUE);
				}
			}

			for (int count1 = 0; count1 < userPickedTiles.size(); count1++) {
				int tester1 = userPickedTiles.get(count1);
				if (xy == tester1) {
					border.setFill(Color.GREEN);
				}
			}
			for (int count1 = 0; count1 < AiGuessedNhit.size(); count1++) {
				int tester1 = AiGuessedNhit.get(count1);
				if (xy == tester1) {
					border.setFill(Color.RED);
				}
			}

			// System.out.println(userPickedTiles);
			// System.out.println(AiGuessed);
			// for (int B = 0; B < userPickedTiles.size(); B++) {
			// for (int N = 0; N < AiGuessed.size(); N++) {
			// if (userPickedTiles.get(B) == AiGuessed.get(N)) {
			// border.setFill(Color.RED);
			// }
			// }

			// }

		}

		public void openUser() {
			if (count < numShips && isOpen == false) {
				count++;
				border.setFill(Color.GREEN);
				System.out.println("You picked square " + xy);
				a.adder(xy);
				isOpen = true;
				userPickedTiles.add(xy);
			}
			if (count == numShips) {
				System.out.println("Lets start");
				rounds();
			}

		}

	}

	public void setTurn(int t) {
		Core.turn = t;
	}

	public void rounds() {
		if (humanScore < numShips && botScore < numShips) {
			if (turn == 1) {
				// System.out.println("Your turn test");
				// addToArray();
				changeColour();
				//System.out.println(botScore);
			}
			if (turn == 0) {
				// System.out.println("AIs turn");
				a.AIhitChecker();
				addToArray();
				changeColour();
				Counter++;
			}
		}
		if (humanScore == numShips) {
			System.out.println("Human Wins");
		}
		if (botScore == numShips) {
			System.out.println("Bot Wins");
		}

	}

	private class botTile extends StackPane {
		private boolean isOpen = false;
		private Rectangle border = new Rectangle(TILE_SIZE - 2, TILE_SIZE - 2);
		private int xy;

		public botTile(int x, int y, int xy) {
			ArrayList<Integer> AiNumbers = a.getList();
			this.xy = xy;
			border.setStroke(Color.LIGHTGRAY);
			getChildren().addAll(border);
			setTranslateX(x * TILE_SIZE);
			setTranslateY(y * TILE_SIZE);
			setOnMouseClicked(e -> openBot(xy));
		}

		public void openBot(int botSquare) {
			if (turn == 1) {// if humans turn to attack
				if (a.hitChecker(botSquare) == true && isOpen == false) {
					border.setFill(Color.RED);
					humanScore++;
					// System.out.println(xy);// remove in final
					isOpen = true;
				} else {
					border.setFill(Color.BLUE);// miss
					isOpen = true;
					// System.out.println(xy);
				}
			} else {
				System.out.println("Not you turn");
			}
		}
	}

	public void addToArray() {
		AiGuessed.clear();
		for (int x = 0; x < a.AiGuessed.size(); x++) {
			AiGuessed.add(a.AiGuessed.get(x));
		}
	}

	public void changeColour() {
		VH = 0;
		HumanSquares();
		Layout.setLeft(root);

	}
//	private Parent Talk() {
//		Stats.setPrefSize(W, H);
//		Label label = new Label ("Hi there");
//		Stats.getChildren().add(label);
//		return Stats;
//	}

	public void altStart() {
		HumanSquares();
		BotSquares();
		//Talk();
		Layout.setLeft(root);
		Layout.setRight(bot);
		//Layout.setBottom(Stats);

	}

	@Override
	public void start(Stage window) throws Exception {
		altStart();
		window.setScene(scene);// Puts Scene in Window
		window.setTitle("BattleShips");// Titles Window
		window.show();
	}

	public static void main(String[] args) {
		a.setter(numShips);// passes how many ships to pick
		a.botPick();// Fills bot Coords
		a.fill();// Numbers that bot will attack with
		a.AiPickedNums();// Pick bot Coords
		launch(args);
	}

}
