package Package3;

public class Main3 {

    public static void main(String[] args) {
        String name = "Riccardo Duxenneuner";

        int alter = 26;

        System.out.println(name);
        System.out.println(alter);

        // Aufgabe 4:
        //Erstellung Variable vom Typ String und verkürzung auf fhKufsteinTirol
        // Durch Zuweisung von final kann die Variable nicht mehr geändert werden; Umbenneung auf FH_KUFSTEIN_TIROL

        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol";

        //Aufgabe 5
        // fi + autocomplete; Strg + autocomplete + eine Bezeichnung hinzufügen, mehrmals Enter drücken und dann ein ; hinzufügen, STRG-ALT L drücken, und Ereignisse beobachten

        final String bezeichnung;


        //Aufgabe 6
        //einen Statz auf der Konsole ausgeben \\ gibt zb.: einen \ aus.
        System.out.println("JavaverwendetfürStrings \"doppelteAnführungszeichen \"undeinzelneAnführungszeichen" +
                "wie \'c' um einzelne Zeichen zu definieren");

        // Beliebige Ausgbe einens \
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");

        // Verwendung von \\b , \\n, \\t
        System.out.println("Ich verwende den \b Backspace, die Newline \n und den \tTabulator");

        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt\n" +
                "die bestehende Zeile.\f ist in der Konsole nicht bemerkbar,da es einen Seitenumbruch\n" +
                "erzwingt.");



    }

}
