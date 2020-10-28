package utility;

public class Utility {

    public static String isItFriday(String day){
        return day.equals("Friday") ? "TGIF" : "Nope";
    }

    public static String statusOfIceCaps(Integer amountOfPunts){
        return amountOfPunts >= 60 ? "fine" : "melting";
    }

}
