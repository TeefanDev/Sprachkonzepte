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

In dieser Aufgabe haben wir einen Lexer mithilfe von ANTLR4 erstellt, um die Öffnungszeiten von Restaurants aus einem Text in einzelne Token zu zerlegen. Zuerst haben wir eine Grammatikdatei (.g4) geschrieben, die festlegt, wie verschiedene Textbestandteile wie Schlüsselwörter, Datumsangaben, Uhrzeiten und Trennzeichen erkannt werden. Die Grammatik beschreibt die Regeln, um Bezeichner, Literale und Operatoren zu unterscheiden. Anschließend haben wir den Lexer in Java generiert und eine Anwendung erstellt, die den Lexer verwendet, um den Text zu verarbeiten. Der Lexer liest den Text ein und zerlegt ihn in Token, die dann in einer bestimmten Reihenfolge ausgegeben werden. Jeder Teil des Textes, wie Wochentage, Zeiträume und Sonderangaben, wird dabei als spezifischer Token klassifiziert. Zum Beispiel werden Datumsangaben als Zahlenliterale erkannt, während Wörter wie „täglich“ oder „Ruhetag“ als Schlüsselwörter eingeordnet werden. Die Ausgabe der Anwendung zeigt die Tokenfolge, die den Text strukturiert darstellt. Damit haben wir erreicht, dass auch ähnliche Texte automatisch analysiert werden können. Diese Methode hilft, die Struktur und Bedeutung von Zeitplänen aus Texten zu extrahieren.

### Ausführung Befehle

java -jar ../antlr-4.13.2-complete.jar OpeningTimesLexer.g4

javac -cp ".;..\antlr-4.13.2-complete.jar;" .\TokenPrinter.java .\OpeningTimesLexer.java

java -cp ".;..\antlr-4.13.2-complete.jar;" .\TokenPrinter.java .\OpeningTimesLexer.java 

### Ausgabe des Programms

``````
Token Type: NUMBER, Token Text: 09
Token Type: COLON, Token Text: :
Token Type: NUMBER, Token Text: 45
Token Type: ID, Token Text: Bus
Token Type: NUMBER, Token Text: 700
Token Type: ID, Token Text: nach
Token Type: ID, Token Text: Bahnhof
Token Type: COMMA, Token Text: ,
Token Type: ID, Token Text: Ravensburg
Token Type: ID, Token Text: Mo
Token Type: MINUS, Token Text: -
Token Type: ID, Token Text: Mi
Token Type: ID, Token Text: nicht
Token Type: NUMBER, Token Text: 20
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Mai
Token Type: NUMBER, Token Text: 09
Token Type: COLON, Token Text: :
Token Type: NUMBER, Token Text: 46
Token Type: ID, Token Text: Bus
Token Type: NUMBER, Token Text: 1
Token Type: ID, Token Text: nach
Token Type: ID, Token Text: Staad
line 5:22 token recognition error at: '/'
Token Type: ID, Token Text: Autof
line 5:28 token recognition error at: 'ä'
Token Type: ID, Token Text: hre
Token Type: COMMA, Token Text: ,
Token Type: ID, Token Text: Konstanz
Token Type: ID, Token Text: Mo
Token Type: MINUS, Token Text: -
Token Type: ID, Token Text: Fr
Token Type: ID, Token Text: nicht
Token Type: NUMBER, Token Text: 9
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 20
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 30
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Mai
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 3
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Okt
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 1
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Nov
Token Type: NUMBER, Token Text: 09
Token Type: COLON, Token Text: :
Token Type: NUMBER, Token Text: 48
Token Type: ID, Token Text: Bus
Token Type: NUMBER, Token Text: 9
Token Type: ID, Token Text: nach
Token Type: ID, Token Text: Universit
line 9:26 token recognition error at: 'ä'
Token Type: ID, Token Text: t
Token Type: COMMA, Token Text: ,
Token Type: ID, Token Text: Konstanz
Token Type: ID, Token Text: nicht
Token Type: ID, Token Text: t
line 10:7 token recognition error at: 'ä'
Token Type: ID, Token Text: glich
Token Type: NUMBER, Token Text: 27
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Mai
Token Type: KW_BIS, Token Text: bis
Token Type: NUMBER, Token Text: 18
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Okt
Token Type: NUMBER, Token Text: 2024
Token Type: ID, Token Text: Mo
Token Type: MINUS, Token Text: -
Token Type: ID, Token Text: Mi
Token Type: COMMA, Token Text: ,
Token Type: ID, Token Text: Fr
line 11:36 token recognition error at: ';'
Token Type: ID, Token Text: nicht
Token Type: NUMBER, Token Text: 3
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Jun
Token Type: KW_BIS, Token Text: bis
Token Type: NUMBER, Token Text: 19
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Jul
Token Type: NUMBER, Token Text: 2024
line 11:67 token recognition error at: ';'
Token Type: ID, Token Text: auch
Token Type: NUMBER, Token Text: 25
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Jul
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 1
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 8
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 15
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 22
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 29
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Aug
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 5
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 12
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 19
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 26
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Sep
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 10
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 17
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Okt
Token Type: NUMBER, Token Text: 10
Token Type: COLON, Token Text: :
Token Type: NUMBER, Token Text: 00
Token Type: ID, Token Text: KAT
Token Type: ID, Token Text: nach
Token Type: ID, Token Text: Friedrichshafen
Token Type: ID, Token Text: Hafen
line 13:37 token recognition error at: '('
Token Type: ID, Token Text: Schiff
line 13:44 token recognition error at: ')'
Token Type: ID, Token Text: t
line 14:1 token recognition error at: 'ä'
Token Type: ID, Token Text: glich
Token Type: NUMBER, Token Text: 10
Token Type: COLON, Token Text: :
Token Type: NUMBER, Token Text: 39
Token Type: ID, Token Text: RE
Token Type: NUMBER, Token Text: 4720
Token Type: ID, Token Text: nach
Token Type: ID, Token Text: Karlsruhe
Token Type: ID, Token Text: Hbf
Token Type: ID, Token Text: t
line 17:1 token recognition error at: 'ä'
Token Type: ID, Token Text: glich
Token Type: ID, Token Text: nicht
Token Type: NUMBER, Token Text: 11
Token Type: DOT, Token Text: .
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 12
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Mai
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 1
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Jun
Token Type: KW_BIS, Token Text: bis
Token Type: NUMBER, Token Text: 12
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Jul
Token Type: NUMBER, Token Text: 2024
Token Type: COMMA, Token Text: ,
Token Type: NUMBER, Token Text: 10
Token Type: DOT, Token Text: .
Token Type: KW_BIS, Token Text: bis
Token Type: NUMBER, Token Text: 30
Token Type: DOT, Token Text: .
Token Type: ID, Token Text: Aug
Token Type: NUMBER, Token Text: 2024
``````

## Aufgabe 2

## Aufgabe 3

## Aufgabe 4

## Aufgabe 5

## Aufgabe 6

## Aufgabe 7

Bearbeitet von Stefan Ptacek
