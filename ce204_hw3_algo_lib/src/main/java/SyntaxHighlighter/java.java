package SyntaxHighlighter;

import java.awt.Color;


/**
 * @class java
 * @brief Provides syntax highlighting rules specific to the Java language.
 */

public class java implements SyntaxHighlighterInterface {

	  /**
     * @brief Retrieves the array of variable keywords in Java.
     *
     * This method returns an array containing the variable keywords used in Java.
     *
     * @return The array of Java variable keywords.
     */
	
	@Override
	public String[] KeywordVariables() {
		String[] JAVA_KeywordVariables = { "boolean", "byte", "char", "short", "int", "long", "float", "double",
				"String", "Array", "Object", "Class", "void", "final" };
		return JAVA_KeywordVariables;
	}

	   /**
     * @brief Retrieves the array of loop keywords in Java.
     *
     * This method returns an array containing the loop keywords used in Java.
     *
     * @return The array of Java loop keywords.
     */
	
	@Override
	public String[] KeywordLoops() {
		String[] JAVA_KeywordLoops = { "for", "while", "do","while", "enhanced","each", "if", "else", "try", "catch",
				"case", "break" };
		return JAVA_KeywordLoops;
	}

	/**
     * @brief Retrieves the array of identifier keywords in Java.
     *
     * This method returns an array containing the identifier keywords used in Java.
     *
     * @return The array of Java identifier keywords.
     */
	
	@Override
	public String[] KeywordIdentifiers() {
		String[] JAVA_KeywordIdentifiers = { "package", "import", "public", "class", "extends", "private", "void",
				"new", "null", "static", "true", "return", "throws", "super", "false" };
		return JAVA_KeywordIdentifiers;
	}

	 /**
     * @brief Retrieves the color for variable highlighting in Java.
     *
     * This method returns the color used for highlighting variables in Java.
     *
     * @return The color for variable highlighting in Java.
     */
	
	@Override
	public Color ColorVariables() {
		Color JAVA_ColorVariables = Color.ORANGE;
		return JAVA_ColorVariables;
	}

	  /**
     * @brief Retrieves the color for loop highlighting in Java.
     *
     * This method returns the color used for highlighting loops in Java.
     *
     * @return The color for loop highlighting in Java.
     */
	
	@Override
	public Color ColorLoops() {
		Color JAVA_ColorLoops = Color.RED;
		return JAVA_ColorLoops;
	}

	 /**
     * @brief Retrieves the color for identifier highlighting in Java.
     *
     * This method returns the color used for highlighting identifiers in Java.
     *
     * @return The color for identifier highlighting in Java.
     */
	
	@Override
	public Color ColorIdentifiers() {
		Color JAVA_ColorLoops = Color.cyan;
		return JAVA_ColorLoops;
	}

	/**
     * @brief Retrieves the color for function highlighting in Java.
     *
     * This method returns the color used for highlighting functions in Java.
     *
     * @return The color for function highlighting in Java.
     */
	
	@Override
	public Color ColorFunction() {
		Color JAVA_ColorFunction = Color.ORANGE;
		return JAVA_ColorFunction;
	}

}
