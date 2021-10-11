import java.util.Scanner;

public class hello {
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

    public static double add(double a, double b) {
        double back;
        back = a + b;
        return back;
    }

    public static double sub(double a, double b) {
        double back;
        back = a - b;
        return back;
    }

    public static double multi(double a, double b) {
        double back;
        back = a * b;
        return back;
    }

    public static double div(double a, double b) {
        double back;
        back = a / b;
        return back;
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
        switch (eingabe3) {
            case "+" -> {
                double ergebnis = add((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
                System.out.println("Ergebnis ist: " + ergebnis);
            }
            case "-" -> {
                double ergebnis = sub((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
                System.out.println("Ergebnis ist: " + ergebnis);
            }
            case "*" -> {
                double ergebnis = multi((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
                System.out.println("Ergebnis ist: " + ergebnis);
            }
            case "/" -> {
                double ergebnis = div((Double.parseDouble(eingabe1)), (Double.parseDouble(eingabe2)));
                System.out.println("Ergebnis ist: " + ergebnis);

            }
            default -> System.out.println("Falsche eingabe");
        }
        System.out.println("Weiter 1 ende 0");
        String eingabe4 = scan().next();
        run2 = !eingabe4.equals("0");
    }

    public static void schleife() {
        while (it) {
            while (run) {
                System.out.println("Bitte Modus Wählen!");
                System.out.println("0: Beenden");
                System.out.println("1: Taschenrechner");
                System.out.println("2: WIP ");
                String eingabe = scan().next();
                switch (eingabe) {
                    case "1" -> {
                        while (run2) {
                            hello.rechner();
                        }
                    }
                    case "0" -> {
                        System.out.println("Servus Auf Wiedersehen");
                        setIt(false);
                        setRun(false);
                        setRun2(false);
                    }
                    case "2" -> {
                        // TODO: Zu ergänzende weitere Funktion
                    }
                }
            }
            schleife();
        }
    }

    public static void main(String... args) {
        run = true;
        run2 = true;
        it = true;
        hello.schleife();
    }
}
