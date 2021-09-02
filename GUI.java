package DOP;
import java.io.*;
//import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GUI extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	String path;
	
	public GUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button =new JButton("Select File");
		button.addActionListener(this);
		this.add(button);
		
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			
			JFileChooser fileChooser=new JFileChooser();
			
			int response = fileChooser.showOpenDialog(null); //select files to open
			if(response==JFileChooser.APPROVE_OPTION) {
				
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				
				this.path=file.getPath();
				
			}
			
		}
	}
	
	
/*
	File file;
	Scanner fileIn;
	int response;
	JFileChooser chooser =new JFileChooser(".");
	
	chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	
	response=chooser.showOpenDialog(null);
	
	if(response==JFileChooser.APPROVE_OPTION) {
		file=chooser.getSelectedFile();
	}
	*/
}
