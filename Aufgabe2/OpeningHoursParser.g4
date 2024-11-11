parser grammar OpeningHoursParser;

options { tokenVocab=OpeningHoursLexer; }

openingHours: location (dateRange openingRule+)+ ;
location: IDENTIFIER+ ;
dateRange: DATE KW_BIS DATE ;
openingRule: (DAY KW_BIS DAY TIME KW_BIS TIME KW_UHR) 
           | (DAY TIME KW_BIS TIME KW_UHR)
           | (DAY KW_RUHETAG) ;
