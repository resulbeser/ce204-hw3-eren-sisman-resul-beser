package SyntaxHighlighter;

import java.awt.Color;

public class csharp implements SyntaxHighlighterInterface {
	
	/**
     * @brief Retrieves the C# keyword variables.
     *
     * This method returns an array of C# keyword variables.
     *
     * @return The C# keyword variables.
     */
	
	@Override
	public String[] KeywordVariables() {
		String[] CSHARP_KeywordVariables = { "bool", "byte", "sbyte", "char", "decimal", "double", "float", "int",
				"uint", "long", "ulong", "short", "ushort", "object", "string", "dynamic", "var" };
		return CSHARP_KeywordVariables;
	}

	  /**
     * @brief Retrieves the C# keyword loops.
     *
     * This method returns an array of C# keyword loops.
     *
     * @return The C# keyword loops.
     */
	
	@Override
	public String[] KeywordLoops() {
		String[] CSHARP_KeywordLoops = { "for", "while", "do","while", "foreach", "if", "else", "try", "catch", "case", "break" };
		return CSHARP_KeywordLoops;
	}
	
	/**
     * @brief Retrieves the C# keyword identifiers.
     *
     * This method returns an array of C# keyword identifiers.
     *
     * @return The C# keyword identifiers.
     */
	
	@Override
	public String[] KeywordIdentifiers() {
		String[] CSHARP_KeywordIdentifiers = { "define", "include", "setup","ready", "size_t","public", "if", "else", "try", "catch", "case", "break","true","false", "class", "void", "public" };
		return CSHARP_KeywordIdentifiers;
	}
	
	/**
     * @brief Retrieves the color for C# variables.
     *
     * This method returns the color used for C# variables in syntax highlighting.
     *
     * @return The color for C# variables.
     */
	
	@Override
	public Color ColorVariables() {
		Color CSHARP_ColorVariables = Color.RED;
		return CSHARP_ColorVariables;
	}
	
	/**
     * @brief Retrieves the color for C# loops.
     *
     * This method returns the color used for C# loops in syntax highlighting.
     *
     * @return The color for C# loops.
     */
	
	@Override
	public Color ColorLoops() {
		Color JAVA_ColorLoops = Color.RED;
		return JAVA_ColorLoops;
	}
	
	 /**
     * @brief Retrieves the color for C# identifiers.
     *
     * This method returns the color used for C# identifiers in syntax highlighting.
     *
     * @return The color for C# identifiers.
     */
	
	@Override
	public Color ColorIdentifiers() {
		Color CSHARP_ColorLoops = Color.cyan;
		return CSHARP_ColorLoops;
	}
	
   /**
     * @brief Retrieves the color for C# functions.
     *
     * This method returns the color used for C# functions in syntax highlighting.
     *
     * @return The color for C# functions.
     */
	
	@Override
	public Color ColorFunction() {
		Color CSHARP_ColorFunction = Color.ORANGE;
		return CSHARP_ColorFunction;
	}
}
