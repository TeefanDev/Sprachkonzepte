lexer grammar OpeningHoursLexer;

// Kommentare und Zwischenräume
WS: [ \t\r\n]+ -> skip;  // Zwischenräume überspringen
COMMENT: '//' ~[\r\n]* -> skip;

// Literale für Datums- und Zeitangaben
DATE: [0-9]+ '.' [0-9]+ '.';  // z. B. 1. März, 30. September
TIME: [0-9]+ ':' [0-9]+;  // z. B. 09:00, 17:00

// Schlüsselwörter und besondere Begriffe
KW_BIS: 'bis';
KW_RUHETAG: 'Ruhetag';
KW_UHR: 'Uhr';

// Wochentage und andere Wörter
DAY: 'Montag' | 'Dienstag' | 'Mittwoch' | 'Donnerstag' | 'Freitag' | 'Samstag' | 'Sonntag';
IDENTIFIER: [a-zA-Z\u00E4\u00F6\u00FC\u00C4\u00D6\u00DC\u00DF]+([ \t][a-zA-Z\u00E4\u00F6\u00FC\u00C4\u00D6\u00DC\u00DF]+)*;  // Bezeichner für Orte z. B. "Restaurant Café"

// Trennzeichen
SEPARATOR: ',' ;
DOT: '.';
COLON: ':';
