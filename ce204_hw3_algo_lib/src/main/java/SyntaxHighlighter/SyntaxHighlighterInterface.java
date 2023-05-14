package SyntaxHighlighter;

import java.awt.Color;

public interface SyntaxHighlighterInterface {
	public String[] KeywordVariables();
	public String[] KeywordLoops();
	public String[] KeywordIdentifiers();
	public Color ColorVariables();
	public Color ColorLoops();
	public Color ColorIdentifiers();
	public Color ColorFunction();
}
