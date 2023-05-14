package SyntaxHighlighter;

import java.awt.Color;

public class java implements SyntaxHighlighterInterface {

	@Override
	public String[] KeywordVariables() {
		String[] JAVA_KeywordVariables = { "boolean", "byte", "char", "short", "int", "long", "float", "double",
				"String", "Array", "Object", "Class", "void", "final" };
		return JAVA_KeywordVariables;
	}

	@Override
	public String[] KeywordLoops() {
		String[] JAVA_KeywordLoops = { "for", "while", "do","while", "enhanced","each", "if", "else", "try", "catch",
				"case", "break" };
		return JAVA_KeywordLoops;
	}

	@Override
	public String[] KeywordIdentifiers() {
		String[] JAVA_KeywordIdentifiers = { "package", "import", "public", "class", "extends", "private", "void",
				"new", "null", "static", "true", "return", "throws", "super", "false" };
		return JAVA_KeywordIdentifiers;
	}

	@Override
	public Color ColorVariables() {
		Color JAVA_ColorVariables = Color.ORANGE;
		return JAVA_ColorVariables;
	}

	@Override
	public Color ColorLoops() {
		Color JAVA_ColorLoops = Color.RED;
		return JAVA_ColorLoops;
	}

	@Override
	public Color ColorIdentifiers() {
		Color JAVA_ColorLoops = Color.cyan;
		return JAVA_ColorLoops;
	}

	@Override
	public Color ColorFunction() {
		Color JAVA_ColorFunction = Color.ORANGE;
		return JAVA_ColorFunction;
	}

}
