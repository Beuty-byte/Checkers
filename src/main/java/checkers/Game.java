package checkers;

public class Game {

    private GameField gameField;
    private Checker[] checkersBlack;
    private Checker[] checkersWhite;

    public void setGameField(GameField gameField) {
        this.gameField = gameField;
    }

    public void setCheckersBlack(Checker[] checkersBlack) {
        this.checkersBlack = checkersBlack;
    }

    public void setCheckersWhite(Checker[] checkersWhite) {
        this.checkersWhite = checkersWhite;
    }

    public Game(GameField gameField) {
        this.gameField = gameField;
        for (int i = 0; i < 12; i++) {
            checkersBlack[i] = new Checker("Black");
            checkersWhite[i] = new Checker("White");
        }
        putCheckersOnTheField(gameField, checkersBlack,checkersWhite);
    }

    private void putCheckersOnTheField(GameField gameField, Checker[] checkersBlack, Checker[] checkersWhite){

    }


}
