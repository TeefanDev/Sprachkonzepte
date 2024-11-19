parser grammar OpeningHoursParser;

options { tokenVocab=OpeningHoursLexer; }

openingHoursFile: (openingHours NEWLINE?)+ EOF ;

openingHours: location (dateRange openingRule+)+ ;
location: IDENTIFIER+ ;
dateRange: DATE BIS DATE ;
openingRule: (DAY BIS DAY TIME BIS TIME UHR)
           | (DAY TIME BIS TIME UHR)
           | (DAY RUHETAG) ;