package SyntaxHighlighter;

/**
 * @class FactorySyntaxHighlighter
 * @brief Provides a factory for creating syntax highlighters based on the selected language.
 */

public class FactorySyntaxHighlighter {

	 /**
     * @brief Creates a syntax highlighter based on the selected language.
     *
     * This method creates and returns a syntax highlighter based on the selected language.
     *
     * @param selected The selected language.
     * @return The syntax highlighter for the selected language.
     */
	
	public SyntaxHighlighterInterface switcthLanguage(String selected) {
		
		switch(selected) {
		case"cplusplus":
			return new cplusplus();
		case "csharp":
			return new csharp();
		case "java":
			return new java();
		}
		return null;
		
	}
}
