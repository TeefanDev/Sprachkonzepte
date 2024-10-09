# Sprachkonzepte Übung WS24/25

Bericht über die Bearbeitung der Aufgaben.

## Aufgabe 1

### Aufgabenstellung

Sie sollen das Vokabular eines Textes mit ANTLR4 Lexer-Regeln beschreiben und eine Anwendung erstellen, die einen entsprechenden Text einliest und als Tokenfolge wieder ausgibt (siehe ExprTokenizer.java aus der Vorlesung).

Zwei Texte stehen zur Auswahl (natürlich dürfen Sie auch beide bearbeiten): Informationen aus der Abfahrtstafel Konstanz der Deutschen Bahn in abfahrten-kn.txt oder Angaben zu den Öffnungszeiten der Mainau-Gastronomie in mainau-gastronomie.txt. Die beiden Texte finden Sie auf der Moodle-Seite.

Den Text abfahrten-kn.txt habe ich aus der Webseite https://www.bahn.de/buchung/abfahrten-ankuenfte für den Bahnhof Konstanz extrahiert. Sie können gerne weitere Abfahrten ergänzen.

Den Text mainau-gastronomie.txt habe ich aus der Webseite https://www.mainau.de/de/oeffnungszeiten extrahiert. Sie können sich gerne weitere gastronomische Angebote ausdenken.

Welche Vokabular-Kategorien von Folie 2-4 kommen im Text vor? Bedenken Sie dazu, dass ja nicht nur der eine vorgegebene Text erfolgreich zerlegt werden soll, sondern auch andere Beispieltexte der gleichen Art.

### Lösung Code

```
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class TokenPrinter {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("input.txt");

            OpeningTimesLexer lexer = new OpeningTimesLexer(input);

            TokenStream tokens = new CommonTokenStream(lexer);

            Token token;
            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                String tokenType = lexer.getVocabulary().getSymbolicName(token.getType());
                String tokenText = token.getText();
                System.out.println("Token Type: " + tokenType + ", Token Text: " + tokenText);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Erklärung

So hats geklappt

### Ausführung Befehle

java -jar antlr-4.x-complete.jar OpeningTimesLexer.g4

javac -cp .:antlr-4.x-complete.jar TokenPrinter.java

java -cp .:antlr-4.x-complete.jar TokenPrinter

### Ausgabe des Programms

``````
Token Type: ID, Token Text: Restaurant
Token Type: ID, Token Text: Schwedenschenke
Token Type: DATE, Token Text: 15. März
Token Type: KW_BIS, Token Text: bis
Token Type: DATE, Token Text: 20. Oktober
Token Type: KW_MITTWOCH, Token Text: Mittwoch
...
``````

## Aufgabe 2

## Aufgabe 3

## Aufgabe 4

## Aufgabe 5

## Aufgabe 6

## Aufgabe 7

Bearbeitet von Stefan Ptacek
