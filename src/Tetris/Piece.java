package Tetris;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Piece {
    private Pane root;
    private Rectangle[] current;
    private double centerX;
    private double centerY;
    public Piece(Pane root) {
        this.root = root;
        this.current = new Rectangle[8];
        this.randomPiece();
        this.centerX = 0;
        this.centerY = 0;
    }

    public void randomPiece() {
        int a = (int) (Math.random() * 0);
        switch (a) {
            case 0:
                this.createPiece(0);
                break;

            case 1:
                this.createPiece(1);
                break;

            case 2:
                this.createPiece(2);
                break;

            case 3:
                this.createPiece(3);
                break;

            case 4:
                this.createPiece(4);
                break;

            case 5:
                this.createPiece(5);
                break;

            case 6:
                this.createPiece(6);
                break;
        }


    }

    public void createPiece(int a){
        switch (a) {
            case 0:
                break;

            case 1:

            case 2:

            case 3:

            case 4:

            case 5:


            case 6:

        }
    }

    public void createLPiece() {

    }

    public void createTPiece(){

    }

    public void createSPiece() {

    }

    public void createZPiece() {

    }

    public void createSquarePiece() {

    }

    public void createLinePiece() {

    }

    public void createOtherLPiece() {

    }
}
