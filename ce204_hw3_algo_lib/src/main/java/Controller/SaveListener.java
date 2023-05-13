package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import Model.Model;
import View.Editor;


public class SaveListener implements ActionListener {
	
	private Editor view;
	private Model model;

	
	public SaveListener(Editor view, Model model) {
		this.view = view;
		this.model = model;
		
		view.addSaveListener(this);

	}

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
            Editor.isSaved = true;
            
        } catch (IOException ex) {}
	}
}