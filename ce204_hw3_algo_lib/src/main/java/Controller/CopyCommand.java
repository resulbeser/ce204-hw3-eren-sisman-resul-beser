package Controller;

import View.Editor;


/**
 * @class CopyCommand
 * @brief Represents a command for copying text in the editor.
 */
public class CopyCommand extends Command {
	 /**
     * @brief Constructs a new CopyCommand object with the specified editor.
     * 
     * @param editor The editor in which the command operates.
     */
	    public CopyCommand(Editor editor) {
	        super(editor);
	    }
	    /**
	     * @brief Executes the copy command.
	     * 
	     * This method copies the selected text in the editor to the clipboard.
	     * 
	     * @retval false The copy command does not modify the editor's state.
	     */
	    @Override
	    public boolean execute() {
	        editor.clipboard = editor.textField.getSelectedText();
	        return false;
	    }
}