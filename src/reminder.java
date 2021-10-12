import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Was wird gebraucht?: Ausgabe eines Formatierten Strings
 * Welche anforderungen?: ausgabe Von montag bis Sonntag Datum modular angepasst,
 * Welche Eingabe?:  TODO: 1. Eingabe: Datum Montag format "dd/MM/yyyy"
 *                         2. Eingabe: Datum Sonntag format "dd/MM/yyyy"
 *                         3. Eingabe: Bekannte Abwesende format "Name/Gamertag"
 *Wie soll die Ausgabe Aussehen:  TODO: 1. Ausgabe: "Hallo zusammen hier die Wöchentliche Eintragungsliste: "
 *                                      2. Ausgabe: "Montag der: " + 1.Eingabe + newline
 *
 *
 *
 *
 * */

public class reminder {
    public static String montag;
    public static String sonntag;
    public static Array abwesend;

    public static Scanner scan() {
        return new Scanner(System.in);
    }

    public static ArrayList<String> tage(String day1, String day2){
        int i = Integer.parseInt(day1);
        ArrayList day = new ArrayList<String>();
        if (Integer.parseInt(day2) < Integer.parseInt(day1)){

        }
        else {
            while (i != Integer.parseInt(day2)){
                System.out.println(i);
                day.add(String.valueOf(i));
                i+=1;
            }
            day.add(day2);
        }

        return day;
    }

    public static String zeile1() {
        return "\"Hallo zusammen hier die Wöchentliche Eintragungsliste: \"";

    }

    public static String körper(String Eingabe1, String Eingabe2){
        ArrayList<String> b;

        String[] day1 = Eingabe1.split("/") ;
        String[] day7 = Eingabe2.split("/");
        b = tage(day1[0],day7[0]);


        return "null";


    }

    public static void main(String... args) {

        /*DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println("dd/MM/yyyy hh:mm:ss-> " + dtf5.format(LocalDateTime.now()));
        System.out.println(zeile1());*/

        System.out.println("Bitte Datum Montag Eingeben: \n");
        montag = scan().next();
        System.out.println("Bitte Datum Sonntag Eingeben: \n");
        sonntag = scan().next();
        System.out.println(körper(montag, sonntag));


    }


}
