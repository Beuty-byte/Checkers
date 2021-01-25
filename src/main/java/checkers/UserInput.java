package checkers;

import java.util.Scanner;

public class UserInput {

    public String requestUserInput(){
        Scanner scanner = new Scanner(System.in);
        String inputCoordinate = scanner.nextLine();
        if(validateInputCoordinate(inputCoordinate)){
            return inputCoordinate;
        }
        return null;
    }

    private boolean validateInputCoordinate(String inputCoordinate){
        if(inputCoordinate.matches("")){
            return true;
        }
        return false;
    }
}
