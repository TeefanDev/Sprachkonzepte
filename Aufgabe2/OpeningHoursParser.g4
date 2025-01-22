parser grammar OpeningHoursParser;

options { tokenVocab=OpeningHoursLexer; }

openingHoursFile: (openingHours NEWLINE?)+ EOF ;

openingHours: location (dateRange)+ ;
location: IDENTIFIER+ ;
dateRange: DATE BIS DATE DAY BIS DAY TIME BIS TIME UHR ;
