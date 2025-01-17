package TetrisFiles;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


public class Piece {
    private Pane root;
    private Rectangle[] current;
    private double centerX;
    private double centerY;
    private Block[] members;
    public Piece(Pane root) {
        this.members = new Block[4];
        this.root = root;
        this.randomPiece();
        this.centerX = 0;
        this.centerY = 0;
    }

    public void randomPiece() {
        int a = (int) (Math.random() * 6);
        Block block1;
        Block block2;
        Block block3;
        Block block4;
        switch (a) {
            case 0:
                block1 = new Block(250, 0, 0, this.root);
                this.members[0] = block1;
                block2 = new Block(250, 50, 0, this.root);
                this.members[1] = block2;
                block3 = new Block(250, 100, 0, this.root);
                this.members[2] = block3;
                block4 = new Block(300, 100, 0, this.root);
                this.members[3] = block4;
                break;

            case 1:
                block1 = new Block(250, 0, 1, this.root);
                this.members[0] = block1;
                block2 = new Block(200, 0, 1, this.root);
                this.members[1] = block2;
                block3 = new Block(300, 0, 1, this.root);
                this.members[2] = block3;
                block4 = new Block(250, 50, 1, this.root);
                this.members[3] = block4;
                break;

            case 2:
                block1 = new Block(250, 0, 2, this.root);
                this.members[0] = block1;
                block2 = new Block(200, 50, 2, this.root);
                this.members[1] = block2;
                block3 = new Block(300, 0, 2, this.root);
                this.members[2] = block3;
                block4 = new Block(250, 50, 2, this.root);
                this.members[3] = block4;
                break;

            case 3:
                block1 = new Block(250, 0, 3, this.root);
                this.members[0] = block1;
                block2 = new Block(250, 50, 3, this.root);
                this.members[1] = block2;
                block3 = new Block(200, 0, 3, this.root);
                this.members[2] = block3;
                block4 = new Block(300, 50, 3, this.root);
                this.members[3] = block4;
                break;

            case 4:
                block1 = new Block(250, 0, 4, this.root);
                this.members[0] = block1;
                block2 = new Block(300, 50, 4, this.root);
                this.members[1] = block2;
                block3 = new Block(300, 0, 4, this.root);
                this.members[2] = block3;
                block4 = new Block(250, 50, 4, this.root);
                this.members[3] = block4;
                break;

            case 5:
                block1 = new Block(250, 0, 5, this.root);
                this.members[0] = block1;
                block2 = new Block(250, 50, 5, this.root);
                this.members[1] = block2;
                block3 = new Block(250, 100, 5, this.root);
                this.members[2] = block3;
                block4 = new Block(250, 150, 5, this.root);
                this.members[3] = block4;
                break;

            case 6:
                block1 = new Block(300, 0, 6, this.root);
                this.members[0] = block1;
                block2 = new Block(300, 50, 6, this.root);
                this.members[1] = block2;
                block3 = new Block(300, 100, 6, this.root);
                this.members[2] = block3;
                block4 = new Block(250, 100, 6, this.root);
                this.members[3] = block4;
                break;
        }
    }

    public void moveLeft() {
        int count = 0;
        for (Block member : this.members) {
            if (member.cannotMoveLeft()) {
                count++;
            }
        }
        if (count == 0) {
            for (Block member : this.members) {
                member.moveLeft();
            }
        }
    }

    public void moveRight() {
        int count = 0;
        for (Block member : this.members) {
            if (member.cannotMoveRight()) {
                count++;
            }
        }
        if (count == 0) {
            for (Block member : this.members) {
                member.moveRight();
            }
        }
    }

    public void moveDown() {
        int count = 0;
        for (Block member : this.members) {
            if (member.cannotMoveDown()) {
                count++;
            }
        }
        if (count == 0) {
            for (Block member : this.members) {
                member.moveDown();
            }
        }
    }
}
