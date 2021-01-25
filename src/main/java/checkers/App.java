package checkers;


public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game(new GameField());
        UserInput userInput = new UserInput();
        GameController gameController = new GameController();
        GeneralController generalController = new GeneralController();
        generalController.startGame(game,userInput,gameController);
    }
}
