// Generated from OpeningHoursParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OpeningHoursParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OpeningHoursParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OpeningHoursParser#openingHoursFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningHoursFile(OpeningHoursParser.OpeningHoursFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpeningHoursParser#openingHours}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeningHours(OpeningHoursParser.OpeningHoursContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpeningHoursParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(OpeningHoursParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link OpeningHoursParser#dateRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateRange(OpeningHoursParser.DateRangeContext ctx);
}