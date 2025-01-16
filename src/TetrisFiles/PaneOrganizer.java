package TetrisFiles;

import javafx.animation.ScaleTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class PaneOrganizer {
    private Pane root;
    private int score;
    private int highScore;
    private Button scorePanel;
    private Button highScorePanel;
    private Game game;
    private Font pixel;
    private Button resume;
    private Rectangle pauseBackground;
    private double scoreX;
    private double scoreY;
    private double highX;
    private double highY;
    public PaneOrganizer() {
        this.pixel = Font.loadFont("file:/C:/Users/porte/Desktop/Broken Console Bold.ttf", 23);
        this.pauseBackground = new Rectangle(1200, 1000);
        this.pauseBackground.setLayoutX(0);
        this.pauseBackground.setLayoutY(0);
        this.pauseBackground.setFill(Color.rgb(0, 0, 0, 0.85));
        this.root = new Pane();
        this.score = 0;
        this.highScore = 0;
        this.creatGameBoard();
        this.createResume();
        this.createScore();
        this.createButtons();
        this.game = new Game(this.root);
    }

    public Pane getRoot() {
        return root;
    }

    public void creatGameBoard() {
        Rectangle background = new Rectangle(500, 900);
        background.setFill(Color.web("#030303"));
        background.setLayoutX(50);
        background.setLayoutY(0);
        this.root.getChildren().add(background);
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 17; j++) {
                Rectangle rectangle = new Rectangle(48, 48);
                rectangle.setFill(Color.web("#000000"));
                rectangle.setLayoutX(50 * i + 1 );
                rectangle.setLayoutY(50 * j + 1);
                this.root.getChildren().add(rectangle);
            }
        }


        Rectangle background2 = new Rectangle(50, 1000);
        background2.setFill(Color.web("#4b4a4a"));
        background2.setLayoutX(0);
        background2.setLayoutY(0);
        Rectangle background3 = new Rectangle(650, 1000);
        background3.setFill(Color.web("#4b4a4a"));
        background3.setLayoutX(550);
        background3.setLayoutY(0);
        Rectangle background4 = new Rectangle(600, 100);
        background4.setFill(Color.web("#4b4a4a"));
        background4.setLayoutX(0);
        background4.setLayoutY(900);
        this.root.getChildren().addAll(background2, background3, background4);

        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 19; j++) {
                if ((i == 0 && j <= 19) || (i >= 11 && j <= 19 ) || (i > 0 && i < 11 && j >= 18 && j <= 19)) {
                    Rectangle rectangle = new Rectangle(36, 36);
                    rectangle.setFill(Color.web("#595959"));
                    rectangle.setLayoutX(50 * i + 7);
                    rectangle.setLayoutY(50 * j + 7);
                    Line line1 = new Line(50 * i, 50 * j, 50 * i + 7, 50 * j + 7);
                    line1.setStroke(Color.web("#363636"));
                    Line line2 = new Line(50 * i + 50, 50 * j + 50, 50 * i + 43, 50 * j + 57);
                    line2.setStroke(Color.web("#363636"));
                    Line line3 = new Line(50 * i, 50 * j + 50, 50 * i + 7, 50 * j + 43);
                    line3.setStroke(Color.web("#363636"));
                    Line line4 = new Line(50 * i + 50, 50 * j + 50, 50 * i + 43, 50 * j + 43);
                    line4.setStroke(Color.web("#363636"));
                    Line line5 = new Line(50 * i, 50 * j, 50 * i + 50, 50 * j);
                    line5.setStroke(Color.web("#363636"));
                    Line line6 = new Line(50 * i , 50 * j, 50 * i, 50 * j + 50);
                    line6.setStroke(Color.web("#363636"));
                    Line line7 = new Line(50 * i + 50, 50 * j, 50 * i + 50, 50 * j + 50);
                    line7.setStroke(Color.web("#363636"));
                    Line line8 = new Line(50 * i , 50 * j + 50, 50 * i + 50, 50 * j + 50);
                    line8.setStroke(Color.web("#363636"));
                    Line line9 = new Line(50 * i + 7, 50 * j + 7, 50 * i + 43, 50 * j + 7);
                    line9.setStroke(Color.web("#363636"));
                    Line line10 = new Line(50 * i + 7, 50 * j + 7, 50 * i + 7, 50 * j + 43);
                    line10.setStroke(Color.web("#363636"));
                    Line line11 = new Line(50 * i + 7, 50 * j + 43, 50 * i + 43, 50 * j + 43);
                    line11.setStroke(Color.web("#363636"));
                    Line line12 = new Line(50 * i + 43, 50 * j + 7, 50 * i + 43, 50 * j + 43);
                    line12.setStroke(Color.web("#363636"));


                    this.root.getChildren().addAll(rectangle, line1, line2, line3, line4,
                            line5, line6, line7, line8,
                            line9, line10, line11, line12);
                }
            }
        }
        Rectangle nextPieceBackground = new Rectangle(250, 250);
        nextPieceBackground.setLayoutX(750);
        nextPieceBackground.setLayoutY(500);
        nextPieceBackground.setFill(Color.web("#030303"));
        this.root.getChildren().add(nextPieceBackground);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Rectangle filling = new Rectangle (48,48);
                filling.setFill(Color.web("#000000"));
                filling.setLayoutX(50 * i + 752);
                filling.setLayoutY(50 * j + 502);
                this.root.getChildren().add(filling);
            }
        }
    }

    public void createButtons() {
        Button quit = new Button("QUIT");
        quit.setPrefSize(150, 50);
        quit.setLayoutX(750);
        quit.setLayoutY(925);
        quit.setStyle("-fx-background-color: #e77a7a; " +
                " -fx-border-width:4;" +
                " -fx-border-color: #7a3c3c;" +
                " -fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;");
        Button reset = new Button("RESET");
        reset.setPrefSize(150, 50);
        reset.setStyle("-fx-background-color: #7ba2de; " +
                "-fx-border-width: 4;" +
                " -fx-border-color: #4f699b; " +
                "-fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;");
        reset.setLayoutX(525);
        reset.setLayoutY(925);


        Button pause = new Button("PAUSE");
        pause.setPrefSize(150, 50);
        pause.setStyle("-fx-background-color: #bb9ebd; " +
                "-fx-border-width: 4;" +
                " -fx-border-color: #895a8c; " +
                "-fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;");
        pause.setLayoutX(300);
        pause.setLayoutY(925);

        ScaleTransition scaleTransition7 = new ScaleTransition(Duration.millis(55), pause);
        scaleTransition7.setByX(-0.1);
        scaleTransition7.setByY(-0.1);


        ScaleTransition reverseTransition7 = new ScaleTransition(Duration.millis(55), pause);
        reverseTransition7.setByX(0.1);
        reverseTransition7.setByY(0.1);
        reverseTransition7.play();

        ScaleTransition scaleTransition8 = new ScaleTransition(Duration.millis(1), pause);
        scaleTransition8.setByX(-0.14);
        scaleTransition8.setByY(-0.14);


        ScaleTransition reverseTransition8 = new ScaleTransition(Duration.millis(1), pause);
        reverseTransition8.setByX(0.14);
        reverseTransition8.setByY(0.14);
        reverseTransition8.play();

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(55), quit);
        scaleTransition.setByX(-0.1);
        scaleTransition.setByY(-0.1);


        ScaleTransition reverseTransition = new ScaleTransition(Duration.millis(55), quit);
        reverseTransition.setByX(0.1);
        reverseTransition.setByY(0.1);
        reverseTransition.play();

        ScaleTransition scaleTransition3 = new ScaleTransition(Duration.millis(1), quit);
        scaleTransition3.setByX(-0.14);
        scaleTransition3.setByY(-0.14);


        ScaleTransition reverseTransition3 = new ScaleTransition(Duration.millis(1), quit);
        reverseTransition3.setByX(0.14);
        reverseTransition3.setByY(0.14);
        reverseTransition3.play();



        ScaleTransition scaleTransition2 = new ScaleTransition(Duration.millis(55), reset);
        scaleTransition2.setByX(-0.1);
        scaleTransition2.setByY(-0.1);


        ScaleTransition reverseTransition2 = new ScaleTransition(Duration.millis(55), reset);
        reverseTransition2.setByX(0.1);
        reverseTransition2.setByY(0.1);
        reverseTransition2.play();

        ScaleTransition scaleTransition4 = new ScaleTransition(Duration.millis(1), reset);
        scaleTransition4.setByX(-0.14);
        scaleTransition4.setByY(-0.14);


        ScaleTransition reverseTransition4 = new ScaleTransition(Duration.millis(1), reset);
        reverseTransition4.setByX(0.14);
        reverseTransition4.setByY(0.14);
        reverseTransition4.play();


        ScaleTransition scaleTransition11 = new ScaleTransition(Duration.millis(1), this.resume);
        scaleTransition11.setByX(-0.14);
        scaleTransition11.setByY(-0.14);


        ScaleTransition reverseTransition11 = new ScaleTransition(Duration.millis(1), this.resume);
        reverseTransition11.setByX(0.14);
        reverseTransition11.setByY(0.14);
        reverseTransition11.play();



        quit.setOnAction(e -> {
            quit.setDisable(true);
            scaleTransition.play();
            scaleTransition.setOnFinished(event -> {
                reverseTransition.play();
                reverseTransition.setOnFinished(exitEvent -> {
                    System.exit(0);
                });
            });
            quit.setDisable(false);
        });

        reset.setOnAction(e -> {
            reset.setDisable(true);
            scaleTransition2.play();
            scaleTransition2.setOnFinished(event -> {
            reverseTransition2.play();
            });
            reset.setDisable(false);
        });

        double quitX = 750;
        double quitY = 925;
        this.resume.setOnAction(e -> {
            this.resume.setDisable(true);
            quit.setLayoutX(quitX);
            quit.setLayoutY(quitY);
            this.scorePanel.setLayoutX(scoreX);
            this.scorePanel.setLayoutY(scoreY);
            this.highScorePanel.setLayoutX(highX);
            this.highScorePanel.setLayoutY(highY);
            pause.setDisable(false);
            reset.setDisable(false);
            this.root.getChildren().removeAll(this.resume, this.pauseBackground);
        });

        pause.setOnAction(e -> {
            reset.setDisable(true);
            scaleTransition7.play();
            scaleTransition7.setOnFinished(event -> {
                reverseTransition7.play();
                reverseTransition7.setOnFinished(event1 -> {
                    this.root.getChildren().addAll(this.pauseBackground, this.resume);
                    quit.toFront();
                    this.resume.setDisable(false);
                    quit.setLayoutX(650);
                    quit.setLayoutY(475);
                    this.scorePanel.toFront();
                    this.highScorePanel.toFront();
                    this.scorePanel.setLayoutX(335);
                    this.scorePanel.setLayoutY(200);
                    this.highScorePanel.setLayoutX(335);
                    this.highScorePanel.setLayoutY(300);
                });
            });
        });



        quit.setOnMouseEntered(mouseEvent -> {quit.setStyle("-fx-background-color: #2a2a2a; " +
                " -fx-border-width:4;" +
                " -fx-border-color: #7a3c3c;" +
                " -fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;"); reverseTransition3.play();});

        reset.setOnMouseEntered(mouseEvent -> {reset.setStyle("-fx-background-color: #2a2a2a; " +
                "-fx-border-width: 4;" +
                " -fx-border-color: #4f699b; " +
                "-fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;"); reverseTransition4.play();});

        quit.setOnMouseExited(mouseEvent -> {quit.setStyle("-fx-background-color: #e77a7a; " +
                " -fx-border-width:4;" +
                " -fx-border-color: #7a3c3c;" +
                " -fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;"); scaleTransition3.play();});

        reset.setOnMouseExited(mouseEvent -> {reset.setStyle("-fx-background-color: #7ba2de; " +
                "-fx-border-width: 4;" +
                " -fx-border-color: #4f699b; " +
                "-fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;"); scaleTransition4.play();});


        pause.setOnMouseEntered(mouseEvent -> {pause.setStyle("-fx-background-color: #2a2a2a; " +
                " -fx-border-width:4;" +
                " -fx-border-color: #895a8c;" +
                " -fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;"); reverseTransition8.play();});

        pause.setOnMouseExited(mouseEvent -> {pause.setStyle("-fx-background-color: #bb9ebd; " +
                "-fx-border-width: 4;" +
                " -fx-border-color: #895a8c; " +
                "-fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;"); scaleTransition8.play();});

        this.resume.setOnMouseEntered(mouseEvent -> {this.resume.setStyle("-fx-background-color: #2a2a2a; " +
                " -fx-border-width:4;" +
                " -fx-border-color: #515988;" +
                " -fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;"); reverseTransition11.play();});

        this.resume.setOnMouseExited(mouseEvent -> {this.resume.setStyle("-fx-background-color: #9aa0c3; " +
                "-fx-border-width: 4;" +
                " -fx-border-color: #515988; " +
                "-fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;");; scaleTransition11.play();});

        quit.setFocusTraversable(false);
        reset.setFocusTraversable(false);
        pause.setFocusTraversable(false);

        this.root.getChildren().addAll(quit, reset, pause);
    }

    public void createResume() {
        this.resume = new Button("RESUME");
        this.resume.setPrefSize(150, 50);
        this.resume.setLayoutX(400);
        this.resume.setLayoutY(475);

        this.resume.setStyle("-fx-background-color: #9aa0c3; " +
                "-fx-border-width: 4;" +
                " -fx-border-color: #515988; " +
                "-fx-text-fill: white;" +
                " -fx-font-size: 25px;" +
                "-fx-background-insets: 1px;" +
                "-fx-border-radius: 16;" +
                "-fx-font-family: '" + this.pixel.getFamily() + "';" +
                "-fx-background-radius: 16;");

        this.resume.setFocusTraversable(false);
        this.resume.setDisable(true);
    }

    public void createScore() {
        this.scorePanel = new Button("SCORE: " + this.score);
        this.scorePanel.setAlignment(Pos.CENTER);
        this.scorePanel.setLayoutX(610);
        this.scorePanel.setLayoutY(59);
        this.scoreX = 610;
        this.scoreY = 59;
        this.scorePanel.setPrefSize(530, 72);
        this.scorePanel.setStyle("-fx-font-family: '" + this.pixel.getFamily() +
                "'; -fx-font-size: 35px;" +
                "-fx-border-width: 5;" +
                "-fx-text-fill: white;"
        + "-fx-background-insets: 1px;"
        + "-fx-border-radius: 16;"
        + "-fx-background-radius: 16;"
        + "-fx-border-color: #4a7641;" +
                "-fx-background-color: #86b582");



        this.highScorePanel = new Button("HIGH SCORE: " + this.highScore);
        this.highScorePanel.setAlignment(Pos.CENTER);
        this.highScorePanel.setLayoutX(610);
        this.highScorePanel.setLayoutY(159);
        this.highX = 610;
        this.highY = 159;
        this.highScorePanel.setPrefSize(530, 72);
        this.highScorePanel.setStyle("-fx-font-family: '" + this.pixel.getFamily() +
                "'; -fx-font-size: 35px;" +
                "-fx-border-width: 5;" +
                "-fx-text-fill: white;"
                + "-fx-background-insets: 1px;"
                + "-fx-border-radius: 16;"
                + "-fx-background-radius: 16;"
                + "-fx-border-color: #c5a100;" +
                "-fx-background-color: #e1cb69");


        Button nextPiecePanel = new Button("NEXT PIECE");
        nextPiecePanel.setAlignment(Pos.CENTER);
        nextPiecePanel.setLayoutX(710);
        nextPiecePanel.setLayoutY(409);
        nextPiecePanel.setPrefSize(330, 72);
        nextPiecePanel.setStyle("-fx-font-family: '" + this.pixel.getFamily() +
                "'; -fx-font-size: 35px;" +
                "-fx-border-width: 5;" +
                "-fx-text-fill: white;"
                + "-fx-background-insets: 1px;"
                + "-fx-border-radius: 16;"
                + "-fx-background-radius: 16;"
                + "-fx-border-color: #a25331;" +
                "-fx-background-color: #bf8369");
        this.root.getChildren().addAll(scorePanel, highScorePanel, nextPiecePanel);
    }
}
