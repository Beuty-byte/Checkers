package checkers;

public class GeneralController {
    public void startGame(Game game, UserInput userInput, GameController gameController){
        while (true){
            String input = userInput.requestUserInput();
            if (input != null){
                gameController.movementOnTheField(input,game);
            }else if (gameController.checkersEnded(game)){
                break;
            }else  {
                continue;
            }
        }
    }
}
