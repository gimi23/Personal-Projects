package TetrisFiles;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;


public class Game {
    private Pane root;
    private Rectangle[][] gameBoard;
    private Piece current;
    public Game(Pane root) {
        this.root = root;
        this.gameBoard = new Rectangle[10][17];
        this.gameStart();
    }

    public void gameStart() {
        this.current = new Piece(this.root);
    }
}
