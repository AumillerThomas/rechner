import java.util.Scanner;

public class hello {
    // Die Namen erklären nicht wirklich wofür die Variablen genutzt werden
    static boolean run;
    static boolean run2;
    static boolean it;

    public static void setIt(boolean it) {
        hello.it = it;
    }

    public static void setRun(boolean run) {
        hello.run = run;
    }

    public static void setRun2(boolean run2) {
        hello.run2 = run2;
    }
    
    public static void setAllRunners(boolean running) {
        setIt(running); setRun(running), SetRun2(running);
    }

    public static double add(double a, double b) {
        return (double) a + b;
    }

    public static double sub(double a, double b) {
        return (double) a - b;
    }

    public static double multi(double a, double b) {
        return (double) a * b;
    }

    public static double div(double a, double b) {
        return (double) a / b;
    }

    public static Scanner scan() {
        return new Scanner(System.in);
    }

    public static void rechner() {
        System.out.println("Erste zahl Eingeben: ");
        String eingabe1 = scan().next();
        System.out.println("Zweite zahl Eingeben: ");
        String eingabe2 = scan().next();
        System.out.println("Rechenart Eingeben");
        String eingabe3 = scan().next();
        /*Wenn der Taschenrechner die Ausgabe nicht weiter braucht sonder lediglich in der Konsole anzeigt
        dann benötigen wir auch keine extra variable (spart Speicher, weniger Code, kompakter, schlechter lesbar)*/
        switch (eingabe3) {
            case "+" -> {
                System.out.println("Ergebnis ist: " + add((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
            }
            case "-" -> {
                System.out.println("Ergebnis ist: " + sub((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
            }
            case "*" -> {
                System.out.println("Ergebnis ist: " + multi((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
            }
            case "/" -> {
                System.out.println("Ergebnis ist: " + div((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
            }
            default -> System.out.println("Falsche eingabe");
        }
        System.out.println("Drücken Sie 1 um weiterzumachen \n Drücken Sie 0 um zu beenden");
        // Hier hast du ja extra eine Methode dafür gemacht um run2 zu setzen. Also verwende einfach die :)
        setRun2(!scan().next().equals("0"));
    }

    public static void schleife() {
        /*Bisher ist es so das it immer true ist wenn run true ist. Daher kann man die beiden zusammenfassen wenn weiterer Code nicht
        die Bedeutung der beiden Variablen verändert (Daher ist die Bennenung recht wichtig)*/
        while (it) {
            while (run) {
                System.out.println("Bitte Modus Wählen! \n0: Beenden \n1: Taschenrechner \n2: WIP");
                String eingabe = scan().next();
                switch (eingabe) {
                    case "0" -> {
                        System.out.println("Servus Auf Wiedersehen");
                        setAllRunners(false);
                    }
                    case "1" -> {
                        while (run2) {
                            hello.rechner();
                        }
                    }
                    case "2" -> {
                        // TODO: Zu ergänzende weitere Funktion
                    }
                }
            }
            // Der Aufruf von der Methode schleife() sollte eigentlich egal sein weil du das lauf der Methode bereits über while-Schleifen garantierst.
            schleife();
        }
    }

    public static void main(String... args) {
        setAllRunners(true);
        hello.schleife();
    }
}
