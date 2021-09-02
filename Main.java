package DOP;
import java.io.*;
import java.util.*;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;  
import java.awt.Container;  
import javax.swing.JButton;  
import javax.swing.JComboBox;  
import javax.swing.JFrame;  
import javax.swing.JScrollPane;  
import javax.swing.JTextArea;  
import javax.swing.JToolBar;  



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m1=new Menu();
		/*
		JFrame myframe = new JFrame("JToolBar Example");  
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        JToolBar toolbar = new JToolBar();  
        toolbar.setRollover(true);  
        JButton button = new JButton("File");  
        toolbar.add(button);  
        toolbar.addSeparator();  
        toolbar.add(new JButton("Edit"));  
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));  
        Container contentPane = myframe.getContentPane();  
        contentPane.add(toolbar, BorderLayout.NORTH);  
        JTextArea textArea = new JTextArea();  
        JScrollPane mypane = new JScrollPane(textArea);  
        contentPane.add(mypane, BorderLayout.EAST);  
        myframe.setSize(450, 250);  
        myframe.setVisible(true); 
		if(JComboBox)
		*/
		
		
		
		/*
		if(m1.clicked) {
			
		String mainLocation=m1.Mainstr;
		int [] arr=null;
			if(mainLocation!=null) {
		mainLocation=m1.Mainstr.replaceAll(" ", "");
			System.out.println(mainLocation);
		file loadedFile=new file();
		arr=loadedFile.File2arr(mainLocation);
			}
		Sorting s1=new Sorting();
		
		if(m1.bubble) {
			if(arr==null) {
				System.out.println("Please Select File");
			}
			else {
				arr=s1.bubbleSort(arr);
				for(int i:arr) {
					System.out.println(i);
				}
			}
		}
	}
	*/
			/*
			int [] arr= {4,3,2,5,7,1,1,4,7,9,8,1,1,1,10};
			Sorting s1=new Sorting();
			int [] arr2=s1.bubbleSort(arr);
			for(int i:arr2) {
				System.out.println(i);
			}
			System.out.println();
			int [] arr3=s1.selectionSort(arr);
			for(int j:arr3) {
				System.out.println(j);
			}
			
			String hello="C:\\Users\\Daves\\OneDrive\\Documents\\Practice\\Dynamic Programming\\array.txt";
			file f1=new file();
			int [] arr4=f1.File2arr(hello);
			arr4=s1.selectionSort(arr4);
			for(int i:arr4) {
				System.out.println(i);
			}
			*/
			//GUI g1=new GUI();
			
			/*
			Sorting s1=new Sorting();
			
			file f1=new file();
			int [] arr;
			
			Scanner fileIn;
			
			File file;
			int response;
			String tmp;
			JFileChooser chooser=new JFileChooser("");
			
			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			
			response=chooser.showOpenDialog(null);
			
			if(response==JFileChooser.APPROVE_OPTION) {
				file=chooser.getSelectedFile();
				
				tmp=file.getPath();
			
				arr=s1.bubbleSort(f1.File2arr(tmp));
				DataStructure d1=new DataStructure(arr[0]);
				for(int i=1;i<arr.length;i++) {
					System.out.println(arr[i]+" LOL");
					d1.Insert(arr[i]);
					
				}
				Node holder=d1.head;
				//System.out.println(holder.right.value);
				//System.out.println(holder.left.value);
				//System.out.println(holder.right.right.value);
				//System.out.println(holder.left.left.value);
				System.out.println("______");
				d1.print();
				*/
			
				
				
				
			}
			
	}


