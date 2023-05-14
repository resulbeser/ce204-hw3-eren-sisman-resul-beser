package SyntaxHighlighter;

import java.awt.Color;

/**
 * @interface SyntaxHighlighterInterface
 * @brief Defines the interface for a syntax highlighter.
 *
 * The SyntaxHighlighterInterface provides methods for retrieving keyword arrays and colors
 * for syntax highlighting in various programming languages.
 */

public interface SyntaxHighlighterInterface {
	
	 /**
     * @brief Retrieves the array of variable keywords.
     *
     * This method should be implemented to return an array of variable keywords.
     *
     * @return The array of variable keywords.
     */
	
	public String[] KeywordVariables();
	
	/**
     * @brief Retrieves the array of loop keywords.
     *
     * This method should be implemented to return an array of loop keywords.
     *
     * @return The array of loop keywords.
     */
	
	public String[] KeywordLoops();
	
	/**
     * @brief Retrieves the array of identifier keywords.
     *
     * This method should be implemented to return an array of identifier keywords.
     *
     * @return The array of identifier keywords.
     */
	
	public String[] KeywordIdentifiers();
	
	  /**
     * @brief Retrieves the color for variable highlighting.
     *
     * This method should be implemented to return the color used for highlighting variables.
     *
     * @return The color for variable highlighting.
     */
	
	public Color ColorVariables();
	
	 /**
     * @brief Retrieves the color for loop highlighting.
     *
     * This method should be implemented to return the color used for highlighting loops.
     *
     * @return The color for loop highlighting.
     */
	
	public Color ColorLoops();
	
	  /**
     * @brief Retrieves the color for identifier highlighting.
     *
     * This method should be implemented to return the color used for highlighting identifiers.
     *
     * @return The color for identifier highlighting.
     */
	
	public Color ColorIdentifiers();
	
	/**
     * @brief Retrieves the color for function highlighting.
     *
     * This method should be implemented to return the color used for highlighting functions.
     *
     * @return The color for function highlighting.
     */
	
	public Color ColorFunction();
}
