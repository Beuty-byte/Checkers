package checkers;

import java.util.HashMap;
import java.util.Map;

public class GameField {
    private Map<String, CoordinatePoint> pointsOnTheField = new HashMap<>();

    public GameField(){
        generateField();
    }

    public Map<String, CoordinatePoint> getPointsOnTheField() {
        return pointsOnTheField;
    }

    private void generateField(){
        pointsOnTheField.put("A1", new CoordinatePoint());
        pointsOnTheField.put("A2",new CoordinatePoint());
        pointsOnTheField.put("A3",new CoordinatePoint());
    }

}
