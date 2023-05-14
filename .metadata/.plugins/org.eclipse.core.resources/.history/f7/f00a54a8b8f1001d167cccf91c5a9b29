package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument.DefaultDocumentEvent;
import javax.swing.undo.UndoableEdit;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;

import Controller.Command;
import Controller.CommandHistory;
import Controller.CopyCommand;
import Controller.CutCommand;
import Controller.PasteCommand;
import Controller.SaveListener;

public class Editor  {
	
	
	JFrame window;
	public	JTextArea textField;
	JMenuBar menuBar;
	JMenu menuFile, menuEdit;
	JComboBox comboBox;
	JMenuItem saveMenu, copyMenu, cutMenu, pasteMenu, undoMenu, redoMenu,freeMenu,javaMenu,cSharpMenu,cppMenu;	
	JButton undoButton, redoButton;
	JLabel lblNewLabel;
	private JFileChooser fileChooser;
	public String clipboard;

    private CommandHistory history = new CommandHistory();
    Editor editor = this;

    public static boolean isSaved = true;
    
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
	//	new Editor ();
	//	}

	/**
	 * Create the frame.
	 */
	public Editor() {
		
       // controller = new Controller(this);
		
		createWindow();
		createTextArea();
		createMenuBar();
		build_FileMenu();
		KeyShortcuts();

		textundo();
		
		
		window.setVisible(true);
		
	}

	//SaveListener saveListener = new SaveListener();
	public void createWindow() {
		window = new JFrame("Notepad");
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		 window.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	            	if (!isSaved) {
	            	    int option = JOptionPane.showConfirmDialog(window, "Do you want to save changes before exiting?", "Exit", JOptionPane.YES_NO_OPTION);
	            	    if (option == JOptionPane.YES_OPTION) {
	            	        SaveListener saveListener = new SaveListener(editor, null);
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
	
	public void createTextArea() {
		
		textField = new JTextArea();

		 textField.getDocument().addDocumentListener((DocumentListener) new DocumentListener() {
	           
	            public void insertUpdate(DocumentEvent e) {
	                isSaved = false;
	            }

	           
	            public void removeUpdate(DocumentEvent e) {
	                isSaved = false;
	            }

	           
	            public void changedUpdate(DocumentEvent e) {}
	        });
		
		JScrollPane scrollPane = new JScrollPane(textField, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		window.getContentPane().add(scrollPane);  
	}


	public void createMenuBar() {
		
		menuBar = new JMenuBar();
		window.setJMenuBar(menuBar);

		
		
		menuFile = new JMenu("File");
		menuBar.add(menuFile);
				
		saveMenu = new JMenuItem("Save");
		menuFile.add(saveMenu);
		saveMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		//saveMenu.addActionListener(controller);
		
		menuEdit = new JMenu("Edit");
		menuBar.add(menuEdit);
		
		copyMenu = new JMenuItem("Copy");
		menuEdit.add(copyMenu);
		copyMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		copyMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
            	executeCommand(new CopyCommand(editor));
            }
        });



	    

		pasteMenu = new JMenuItem("Paste");
		menuEdit.add(pasteMenu);
		pasteMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		pasteMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
            	executeCommand(new PasteCommand(editor));
            }
        });
		


		
		cutMenu = new JMenuItem("Cut");
		menuEdit.add(cutMenu);
		cutMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		cutMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
            	executeCommand(new CutCommand(editor));
            }
        });
		
		undoButton = new JButton("Undo");
		menuBar.add(undoButton);
		undoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
            	undo();
            }
        });

		
		redoButton = new JButton("Redo");
		menuBar.add(redoButton);
		redoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            
            	redo();
            }
        });
        
		//default selected language
        System.out.println("Java selected");
        
        JComboBox comboBox = new JComboBox();
        menuBar.add(comboBox);
        
        comboBox.addItem("Language:    Java");
        comboBox.addItem("Language:    C#");
        comboBox.addItem("Language:    C++");
        
        comboBox.addActionListener(new ActionListener()
        { public void actionPerformed(ActionEvent e)
        { JComboBox cb = (JComboBox)e.getSource();
        String selectedItem = (String)cb.getSelectedItem();
        
        // if selected language is C++, convert to C++ color. 
        if (selectedItem.equals("Language:    C++")) 
        { System.out.println("C++ selected"); } 
        else if (selectedItem.equals("Language:    C#")) 
        { System.out.println("C# selected"); } 
        else { System.out.println("Java selected"); } } });
		
        
        
		lblNewLabel = new JLabel("                                                                                                                                                ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		menuBar.add(lblNewLabel);
		
	}

	private void executeCommand(Command command) {

		if (command.execute()) {
            history.push(command);
        }
    }

	private void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            if (command != null) {
                command.undo();
            }
        } else {
            String currentText = textField.getText();
            if (textBeforeEdit != null && !currentText.equals(textBeforeEdit.toString())) {
                textField.setText(textBeforeEdit.toString());
            } else {
                int length = currentText.length();
                if (length > 0) {
                    textField.setText(currentText.substring(0, length - 1));
                }
            }
        }
    }

    private void redo() {
        if (history.isEmpty()) return;
        Command command = history.redo();
        if (command != null) {
            command.execute();
        }
    }

    
    private StringBuilder textBeforeEdit;
    private void textundo()
    {    textField.getDocument().addUndoableEditListener(e -> {
        UndoableEdit edit = e.getEdit();
        if (edit instanceof DefaultDocumentEvent) {
            DefaultDocumentEvent documentEvent = (DefaultDocumentEvent) edit;
            if (documentEvent.getType() == DocumentEvent.EventType.CHANGE) {
                textBeforeEdit = new StringBuilder(textField.getText());
            }
        }
    });
    
    
    }
    
    
    

    
    private void KeyShortcuts()
    {

		textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_C) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
                	executeCommand(new CopyCommand(editor));
                }
            }
        });
    	
		
		textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_V) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
                	executeCommand(new PasteCommand(editor));
                }
            }
        });
    	
		
		textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_X) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
                	executeCommand(new CutCommand(editor));
                }
            }
        });
		
    
		textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Z) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
                	undo();
                }
            }
        });
    
		textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_Y) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
                redo();
                }
            }
        });
		
		textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if ((e.getKeyCode() == KeyEvent.VK_S) && ((e.getModifiersEx() & KeyEvent.CTRL_DOWN_MASK) != 0)) {
                redo();
                }
            }
        });
    
    }
    
    
    
    
    
    

    public JMenuItem saveFile_MenuItem = new JMenuItem("Save File");
    
    private void build_FileMenu() {
    
    	menuFile.add(saveFile_MenuItem);
    	
    	

    }
    
    
    public void addSaveListener(ActionListener save) {
        saveFile_MenuItem.addActionListener(save);
        
    }
    public JTextArea getTextPane() {
    	return this.textField; 
    }
    


    


    
    
   
    
    
    
    
    
    
    

}
