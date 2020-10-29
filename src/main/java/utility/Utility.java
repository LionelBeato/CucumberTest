package utility;

import java.util.List;
import java.util.OptionalDouble;

public class Utility {

    public static String isItFriday(String day){
        return day.equals("Friday") ? "TGIF" : "Nope";
    }

    public static String statusOfIceCaps(Integer amountOfPunts){
        return amountOfPunts >= 60 ? "fine" : "melting";
    }

    public int add(int a, int b){
        return a + b;
    }

    public static Double averageCalculator(List<Integer> scores){
        Double average = scores.stream()
                                .mapToInt(i -> i)
                                .average()
                                .getAsDouble();
        return average;
    }

}
