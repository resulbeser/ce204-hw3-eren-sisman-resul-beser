package SyntaxHighlighter;

import java.awt.Color;

public class cplusplus implements SyntaxHighlighterInterface {
	
	/**
     * @brief Retrieves the C++ keyword variables.
     *
     * This method returns an array of C++ keyword variables.
     *
     * @return The C++ keyword variables.
     */
	
	@Override
	public String[] KeywordVariables() {
		String[] CPP_KeywordVariables = { "bool", "char", "int", "float", "double", "void", "wchar_t", "short", "long","unsigned","size_t" };
		return CPP_KeywordVariables;
	}

	  /**
     * @brief Retrieves the C++ keyword loops.
     *
     * This method returns an array of C++ keyword loops.
     *
     * @return The C++ keyword loops.
     */
	
	@Override
	public String[] KeywordLoops() {
		String[] CPP_KeywordLoops = { "for", "while", "do","while", "enhanced","each", "if", "else", "try", "catch", "case", "break" };
		return CPP_KeywordLoops;
	}

	 /**
     * @brief Retrieves the C++ keyword identifiers.
     *
     * This method returns an array of C++ keyword identifiers.
     *
     * @return The C++ keyword identifiers.
     */
	
	@Override
	public String[] KeywordIdentifiers() {
		String[] CPP_KeywordIdentifiers = { "define", "include", "setup","ready", "size_t","public", "if", "else", "try", "catch", "case", "break","true","false" };
		return CPP_KeywordIdentifiers;
	}

	 /**
     * @brief Retrieves the color for C++ variables.
     *
     * This method returns the color used for C++ variables in syntax highlighting.
     *
     * @return The color for C++ variables.
     */
	
	@Override
	public Color ColorVariables() {
		Color CPP_ColorVariables = Color.green;
		return CPP_ColorVariables;
	}

	 /**
     * @brief Retrieves the color for C++ loops.
     *
     * This method returns the color used for C++ loops in syntax highlighting.
     *
     * @return The color for C++ loops.
     */
	
	@Override
	public Color ColorLoops() {
		Color CPP_ColorLoops = Color.RED;
		return CPP_ColorLoops;
	}

	/**
     * @brief Retrieves the color for C++ identifiers.
     *
     * This method returns the color used for C++ identifiers in syntax highlighting.
     *
     * @return The color for C++ identifiers.
     */
	
	@Override
	public Color ColorIdentifiers() {
		Color CPP_ColorIdentifiers = Color.MAGENTA;
		return CPP_ColorIdentifiers;
	}
	
	 /**
     * @brief Retrieves the color for C++ functions.
     *
     * This method returns the color used for C++ functions in syntax highlighting.
     *
     * @return The color for C++ functions.
     */
	
	@Override
	public Color ColorFunction() {
		Color CPP_ColorFunction = Color.ORANGE;
		return CPP_ColorFunction;
	}
}
