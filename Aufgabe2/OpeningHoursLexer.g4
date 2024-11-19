lexer grammar OpeningHoursLexer;

// Kommentare und Zwischenräume
NEWLINE: ('\r'? '\n')+ -> skip ;
WS: [ \t\r\n]+ -> skip;  // Zwischenräume überspringen
COMMENT: '//' ~[\r\n]* -> skip;

// Literale für Datums- und Zeitangaben
DATE: ([1-9] | [12][0-9] | '3'[01]) '.' ([1-9] | '1'[012]) '.';  // z. B. 1.3., 30.9.
TIME: ('0'? [0-9] | '1'[0-9] | '2'[0-3]) ':' ([0-5][0-9]);  // z. B. 09:00, 17:00

// Schlüsselwörter und besondere Begriffe
BIS: 'bis';
RUHETAG: 'Ruhetag';
UHR: 'Uhr';

// Wochentage und andere Wörter
DAY: 'Montag' | 'Dienstag' | 'Mittwoch' | 'Donnerstag' | 'Freitag' | 'Samstag' | 'Sonntag';
IDENTIFIER: [a-zA-ZäüößéèÄÜÖÉÈ]+;  // Bezeichner für Orte z. B. "Restaurant"

InvalidChar: . ; // Fehlerbehandlung für unbekannte Zeichen