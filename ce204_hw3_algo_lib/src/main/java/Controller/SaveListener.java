package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Model.Model;
import View.Editor;

/**
 * @class SaveListener
 * @brief The SaveListener class handles the save functionality for the editor.
 */

public class SaveListener implements ActionListener {
	
	private Editor view;
	private Model model;

	/**
	 * @brief Constructs a SaveListener object with the specified Editor view and Model.
	 * 
	 * @param view The Editor view.
	 * @param model The Model.
	 */
	
	public SaveListener(Editor view, Model model) {
		this.view = view;
		this.model = model;
		
		view.addSaveListener(this);
		textChangeListener();
		windowCloseListener();
	}
	
	/**
	 * @brief Handles the save action performed by the user.
	 * 
	 * This method is called when the user clicks the save button in the Editor view.
	 * It prompts the user to choose a file to save the text content and performs the save operation.
	 * If the save operation is successful, a success message is displayed to the user.
	 * 
	 * @param e The action event.
	 */
	
	public void actionPerformed(ActionEvent e) {
		File fileToWrite = null;
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showSaveDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION)
            fileToWrite = fc.getSelectedFile();
        try {
            PrintWriter out = new PrintWriter(new FileWriter(fileToWrite));
            out.println(view.getTextPane().getText());
            JOptionPane.showMessageDialog(null, "File is saved successfully...");	                   
            out.close();
            view.isSaved = true;
            
        } catch (IOException ex) {}
	}
	
	/**
	 * @brief Adds a text change listener to the Editor view.
	 * 
	 * This method adds a document listener to the text field in the Editor view.
	 * It listens for any changes in the text field and sets the "isSaved" flag to false,
	 * indicating that changes have been made and not yet saved.
	 */
	
	public void  textChangeListener()
	{
		 view.textField.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
	           
	            public void insertUpdate(DocumentEvent e) {
	                view.isSaved = false;
	            }

	           
	            public void removeUpdate(DocumentEvent e) {
	                view.isSaved = false;
	            }

	           
	            public void changedUpdate(DocumentEvent e) {}
	        });
		
	}
	
	/**
	 * @brief Adds a window close listener to the Editor view.
	 * 
	 * This method adds a window listener to the Editor view's window.
	 * It listens for the window closing event and checks if changes have been made.
	 * If changes have been made, it prompts the user to save the changes before closing the application.
	 */
	
		public void windowCloseListener()
		{
			 view.window.addWindowListener(new WindowAdapter() {
		            @Override
		            public void windowClosing(WindowEvent e) {
		            	if (!view.isSaved) {
		            	    int option = JOptionPane.showConfirmDialog(view.window, "Do you want to save changes before exiting?", "Exit", JOptionPane.YES_NO_OPTION);
		            	    if (option == JOptionPane.YES_OPTION) {
		            	        SaveListener saveListener = new SaveListener(view, model);
		            	        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Save");
		            	        saveListener.actionPerformed(event);
		            	    } else if (option == JOptionPane.NO_OPTION) {
		            	        System.exit(0);
		            	    }
		            	} else {
		            	    System.exit(0);
		            	}
		            }
		        });
		}
}