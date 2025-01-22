// Generated from OpeningHoursParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OpeningHoursParser}.
 */
public interface OpeningHoursParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OpeningHoursParser#openingHoursFile}.
	 * @param ctx the parse tree
	 */
	void enterOpeningHoursFile(OpeningHoursParser.OpeningHoursFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpeningHoursParser#openingHoursFile}.
	 * @param ctx the parse tree
	 */
	void exitOpeningHoursFile(OpeningHoursParser.OpeningHoursFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpeningHoursParser#openingHours}.
	 * @param ctx the parse tree
	 */
	void enterOpeningHours(OpeningHoursParser.OpeningHoursContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpeningHoursParser#openingHours}.
	 * @param ctx the parse tree
	 */
	void exitOpeningHours(OpeningHoursParser.OpeningHoursContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpeningHoursParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(OpeningHoursParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpeningHoursParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(OpeningHoursParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link OpeningHoursParser#dateRange}.
	 * @param ctx the parse tree
	 */
	void enterDateRange(OpeningHoursParser.DateRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OpeningHoursParser#dateRange}.
	 * @param ctx the parse tree
	 */
	void exitDateRange(OpeningHoursParser.DateRangeContext ctx);
}