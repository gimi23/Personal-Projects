package TetrisFiles;

import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;


public class Game {
    private Pane root;
    private Rectangle[][] gameBoard;
    private Piece current;
    public Game(Pane root) {
        this.root = root;
        this.setKeyPress();
        this.gameBoard = new Rectangle[10][18];
        this.gameStart();
    }

    public void gameStart() {
        this.current = new Piece(this.root);
    }

    public void setKeyPress() {
        this.root.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case J:
                    this.moveCurrentPiece(0);
                    break;

                case K:
                    this.moveCurrentPiece(1);
                    break;

                case L:
                    this.moveCurrentPiece(2);
                    break;
            }
        });
    }

    public void moveCurrentPiece(int i) {
        switch (i) {
            case 0:
                this.current.moveLeft();
                break;

            case 1:
                this.current.moveDown();
                break;

            case 2:
                this.current.moveRight();
                break;
        }
    }
}
