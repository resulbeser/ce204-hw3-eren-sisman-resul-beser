package SyntaxHighlighter;

public class FactorySyntaxHighlighter {

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
