package TetrisFiles;

import javafx.scene.layout.Pane;


public class Game {
    private Pane root;
    private Block[][] gameBoard;
    private Piece current;
    public Game(Pane root) {
        this.root = root;
        this.setKeyPress();
        this.gameBoard = new Block[10][18];
        this.gameStart();
    }

    public void gameStart() {
        this.current = new Piece(this.root, this);
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

                case Z:
                    this.speedDown();
                    break;

                case Q:
                    this.moveCurrentPiece(3);
                    break;

                case W:
                    this.moveCurrentPiece(4);
                    break;
            }
        });
    }

    public void speedDown() {
        while (this.current.canMove()) {
            this.current.moveDown();
        }
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

            case 3:
                this.current.rotateLeft();
                break;

            case 4:
                this.current.rotateRight();
                break;
        }
    }

    public void moveCurrentDown() {
        if (this.current.canMove()) {
            this.current.moveDown();
        }

        else {
            this.current.setLocation();
            this.current = new Piece(this.root, this);
        }
    }

    public void setAvailability(Block block, int x, int y) {
        this.gameBoard[x][y] = block;
    }

    public void setNullity(int x, int y) {
        this.gameBoard[x][y] = null;
    }

    public boolean isAvailable(int x, int y) {
        return this.gameBoard[x][y] == null;
    }
}
