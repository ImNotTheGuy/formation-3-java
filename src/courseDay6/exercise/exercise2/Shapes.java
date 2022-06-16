package courseDay6.exercise.exercise2;

import java.util.HashMap;
import java.util.Map;

public class Shapes {

    int numberOfSides;
    HashMap<Integer, Double> lengthOfSides = new HashMap<>();

    public void setLengthOfSides(double[] sides){
        for (int i = 0; i < this.lengthOfSides.size(); i++) {
            for (int j = 0; j < sides.length; j++) {
                this.lengthOfSides.put(i, sides[j]);
            }
        }
    }

    public double perimeter(){
        double sumLength = 0.;
        for (Map.Entry<Integer, Double> entry: lengthOfSides.entrySet()) {
            sumLength += entry.getValue();
        }
        return sumLength;

    }

}
