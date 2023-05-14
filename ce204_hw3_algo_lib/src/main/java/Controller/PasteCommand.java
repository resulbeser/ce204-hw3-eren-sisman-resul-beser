package Controller;

import View.Editor;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
/**
 * @class PasteCommand
 * @brief Represents a command for pasting text in the editor.
 */
public class PasteCommand extends Command {
	 /**
     * @brief Constructs a new PasteCommand object with the specified editor.
     * 
     * @param editor The editor in which the command operates.
     */
    public PasteCommand(Editor editor) {
        super(editor);
    }
    /**
     * @brief Executes the paste command.
     * 
     * This method pastes the text from the clipboard into the editor's text field
     * at the current caret position.
     * 
     * @retval true The paste command modifies the editor's state.
     * @retval false The paste command does not modify the editor's state if the clipboard is empty.
     */
    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();

        StyledDocument doc = editor.textField.getStyledDocument();
        int caretPosition = editor.textField.getCaretPosition();

        try {
            doc.insertString(caretPosition, editor.clipboard, null);
            return true;
        } catch (BadLocationException e) {
            e.printStackTrace();
            return false;
        }
    }
}
