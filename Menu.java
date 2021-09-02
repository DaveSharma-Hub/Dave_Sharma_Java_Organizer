package DOP;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.net.URISyntaxException;
import javax.tools.*;
import java.util.Arrays;
import java.awt.BorderLayout;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Menu implements ActionListener {
	
	String Mainstr;
	boolean bubble=false;
	boolean selection=false;
	boolean quick=false;
	int []arrayAll=new int[0];
	boolean clicked=false;
	Sorting manySort=new Sorting();
	file manyFile=new file();
	binary b1;
	
	JFrame f;       
	JMenu edit,help;  
	JMenuBar mb;
	JMenuItem cut,copy,paste,selectAll,font;    
	JTextArea ta;  
	
	JFrame frame;
	JMenuBar menuBar;
	JMenu menu,menu2,menu3;
	JMenu subMenu;
	
	JMenuItem menuItem1,menuItem2,menuItem3;
	JMenuItem menuItemE1,menuItemE2,menuItemE3;
	JMenuItem menuItemD1,menuItemD2;
	JMenuItem menuDisplay,saveNotepad,compile;
	JCheckBoxMenuItem checkItem1, checkItem2;

	
	
	public Menu() {
		//menuBar=new JMenuBar();
		
		
		f=new JFrame();    
		cut=new JMenuItem("cut");    
		copy=new JMenuItem("copy");    
		paste=new JMenuItem("paste");    
		selectAll=new JMenuItem("selectAll"); 
		font=new JMenuItem("font");
		cut.addActionListener(this);    
		copy.addActionListener(this);    
		paste.addActionListener(this);    
		selectAll.addActionListener(this); 
		font.addActionListener(this);
		mb=new JMenuBar();    
		//file=new JMenu("File");  
		menu=new JMenu("File");
		mb.add(menu);
		edit=new JMenu("Edit");    
		help=new JMenu("Help");     
		edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);edit.add(font);  
		mb.add(edit);mb.add(help);    
		ta=new JTextArea();    
		ta.setBounds(5,5,690,690); 
		ta.setFont(new Font("sans-Serif", Font.ROMAN_BASELINE, 16));
		f.add(mb);f.add(ta);    
		f.setJMenuBar(mb);  
		f.setLayout(null);    
		f.setSize(700,700);    
		f.setVisible(true);  
		
		
		/*
		  ta.setEditable(true);
		 final JTextField jtf = new JTextField(20);
        jtf.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                ta.setText(jtf.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                ta.setText(jtf.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
            //Plain text components don't fire these events.
            }
        });

        frame.getContentPane().add(jtf, BorderLayout.WEST);
        //frame.getContentPane().add(ta, BorderLayout.EAST);	
		*/
		
		menu2=new JMenu("Sorting Methods");
		mb.add(menu2);
		
		menu3=new JMenu("Data Structures");
		mb.add(menu3);
		
		ImageIcon i1=new ImageIcon("C:\\Users\\Daves\\eclipse-workspace\\Organization\\src\\DOP\\file.png");
		Image image=i1.getImage();
		Image newimg=image.getScaledInstance(65,65,java.awt.Image.SCALE_SMOOTH);
		i1=new ImageIcon(newimg);
		
		ImageIcon i2=new ImageIcon("C:\\Users\\Daves\\eclipse-workspace\\Organization\\src\\DOP\\save.jpg");
		Image image2=i2.getImage();
		Image newimg2=image2.getScaledInstance(65,65,java.awt.Image.SCALE_SMOOTH);
		i2=new ImageIcon(newimg2);
		
		ImageIcon i3=new ImageIcon("C:\\Users\\Daves\\eclipse-workspace\\Organization\\src\\DOP\\Options.png");
		Image image3=i3.getImage();
		Image newimg3=image3.getScaledInstance(65,65,java.awt.Image.SCALE_SMOOTH);
		i3=new ImageIcon(newimg3);
		
		ImageIcon i4=new ImageIcon("C:\\Users\\Daves\\eclipse-workspace\\Organization\\src\\DOP\\print.png");
		Image image4=i4.getImage();
		Image newimg4=image4.getScaledInstance(65,65,java.awt.Image.SCALE_SMOOTH);
		i4=new ImageIcon(newimg4);
		
		menuItem1 =new JMenuItem("Load File",i1);
		menuItem1.addActionListener(this);
		menu.add(menuItem1);
		
		menuItem2 =new JMenuItem("Save File",i2);
		menuItem2.addActionListener(this);
		menu.add(menuItem2);
		
		menuItem3 =new JMenuItem("Options",i3);
		menuItem3.addActionListener(this);
		menu.add(menuItem3);
		
		menuDisplay=new JMenuItem("Display Array",i4);
		menuDisplay.addActionListener(this);
		menu.add(menuDisplay);
		
		subMenu =new JMenu("submenu");
		menu.add(subMenu);
		
		checkItem1 =new JCheckBoxMenuItem(".txt File");
		checkItem1.addActionListener(this);
		subMenu.add(checkItem1);
		
		checkItem2=new JCheckBoxMenuItem("other");
		checkItem2.addActionListener(this);
		subMenu.add(checkItem2);
		
		menuItemE1=new JMenuItem("Bubble Sort");
		menuItemE1.addActionListener(this);
		menu2.add(menuItemE1);
		
		menuItemE2=new JMenuItem("Selection Sort");
		menuItemE2.addActionListener(this);
		menu2.add(menuItemE2);
		
		menuItemE3=new JMenuItem("Quick Sort");
		menuItemE3.addActionListener(this);
		menu2.add(menuItemE3);
		
		menuItemD1=new JMenuItem("Binary Tree");
		menuItemD1.addActionListener(this);
		menu3.add(menuItemD1);
		
		
		
		saveNotepad=new JMenuItem("Save Written Notepad");
		saveNotepad.addActionListener(this);
		edit.add(saveNotepad);
		
		compile=new JMenuItem("Compile");
		compile.addActionListener(this);
		edit.add(compile);
		/*
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(700,700);
		//frame.setJMenuBar(mb);
		*/
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cut)    
			ta.cut();    
			if(e.getSource()==paste)    
			ta.paste();    
			if(e.getSource()==copy)    
			ta.copy();    
			if(e.getSource()==selectAll)    
			ta.selectAll();    
			if(e.getSource()==font) {
				String[] options = {"Sans-Serif", "TimesRoman", "Algerian", "Courier"};
		        //Integer[] options = {1, 3, 5, 7, 9, 11};
		        //Double[] options = {3.141, 1.618};
		        //Character[] options = {'a', 'b', 'c', 'd'};
		        int x = JOptionPane.showOptionDialog(null, "Choose your font",
		                "Click a button",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		        //System.out.println(x);
		      
		        String[] options1 = {"16", "10", "20", "30"};
		        int y = JOptionPane.showOptionDialog(null, "Choose your font size",
		                "Click a button",
		                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options1, options1[0]);
		        	int value=16;
		        	System.out.println(y);
		        	if(y==0) {
		        		value=16;
		        	}
		        	else if(y==1) {
		        		value=10;
		        	}
		        	else if(y==2) {
		        		value=20;
		        	}
		        	else if(y==3) {
		        		value=30;
		        	}
		        ta.setFont(new Font(options[x], Font.ROMAN_BASELINE,value));
		        new Message("Font set to: "+options[x]+"size: "+options1[y]);
			//ta.getSelectedText().setFont(new Font(options[x], Font.ROMAN_BASELINE,value));
			}
		if(e.getSource()==saveNotepad) {
			//file userFile=new file();
			//new Message("Select all code then copy and paste");
			
			int response;
			String tmp;
			JFileChooser chooser=new JFileChooser("");
			
			
			response=chooser.showSaveDialog(null);
			
			if(response==JFileChooser.APPROVE_OPTION) {
				
				File f1=new File(chooser.getSelectedFile().getAbsolutePath());
				
				tmp=f1.getPath();
				try {
				BufferedWriter writer=new BufferedWriter(new FileWriter(tmp));
				//userFile.arr2File(arrayAll, tmp);
					for (String line : ta.getText().split("\\n")) {
					writer.write(line);
					writer.write("\n");
					}
					
					new Message("Filed has been saved");
					writer.close();
				}catch(IOException e1) {
					new Message("Filed has not been saved, try again");
					e1.printStackTrace();
				}
				
				System.out.println(tmp);
			}	
		}
		if(e.getSource()==compile) {
			/*
			if(Mainstr==null) {
				new Message("Upload File");
			}
			
			else {
				*/
			    new Message("Open file path");
			    String holder="";
			    clicked=true;
				File file;
				int response;
				String tmp;
				JFileChooser chooser=new JFileChooser("");
				
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				
				response=chooser.showOpenDialog(null);
				
				if(response==JFileChooser.APPROVE_OPTION) {
					file=chooser.getSelectedFile();
					
					tmp=file.getPath();
					holder=tmp;
					file f1=new file();
					new Message("File has been opened");
					System.out.println(tmp);
				}
				
				Runtime rt = Runtime.getRuntime();
			    try {
			    	//String tmp=C://
			        rt.exec(new String[]{"cmd.exe","/c","start"});
			       // rt.exec("cd\\"+Mainstr);
			        
			    } catch (IOException e1) {
			        // TODO Auto-generated catch block
			        e1.printStackTrace();
			    }
			    
			    String tmp1="cd \\";
			    tmp1+=holder;
			    tmp1+="&& dir";
			    
			    ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", tmp1);//"cd \\ +Mainstr && dir");
			        builder.redirectErrorStream(true);
			        Process p=null;
					try {
						p = builder.start();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			        String line="";
			        while (true) {
			            try {
							line = r.readLine();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			            if (line == null) { break; }
			            System.out.println(line);
			        }
				
				
				
				/*
				JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			      DiagnosticCollector< JavaFileObject > ds = new
			         DiagnosticCollector<>();
			      try( StandardJavaFileManager mgr =compiler.getStandardFileManager( ds, null, null ) ) {
			         File f1 =new File( Menu.class.getResource(Mainstr).toURI());
			         Iterable<? extends JavaFileObject> sources =mgr.getJavaFileObjectsFromFiles( Arrays.asList( f1 ) );
			         JavaCompiler.CompilationTask task = compiler.getTask( null, mgr, ds, null, null, sources );
			         task.call();
			      } catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			      for( Diagnostic < ? extends JavaFileObject >d: ds.getDiagnostics() ) {
			         System.out.format("Line: %d, %s in %s", d.getLineNumber(), d.getMessage( null ),d.getSource().getName() );
			      }
				
			}
			*/
		}
			
			
		if(e.getSource()==menuDisplay) {
			if(arrayAll==null) {
				new Message("Please upload file");
			}
			else {
				String s1="";
				for(int i=0;i<arrayAll.length;i++) {
					s1+=String.valueOf(arrayAll[i])+" ";
				}
				new Message(s1);
			}
			
		}
		if(e.getSource()==menuItem1) {
			clicked=true;
			File file;
			int response;
			String tmp;
			JFileChooser chooser=new JFileChooser("");
			
			chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			
			response=chooser.showOpenDialog(null);
			
			if(response==JFileChooser.APPROVE_OPTION) {
				file=chooser.getSelectedFile();
				
				tmp=file.getPath();
				Mainstr=tmp;
				file f1=new file();
				if(e.getSource()==checkItem1) {
				arrayAll=f1.File2arr(tmp);
				}
				new Message("File has been opened");
				System.out.println(tmp);
			}
		}
		if(e.getSource()==menuItem2) {
			clicked=true;
			file userFile=new file();
			
			int response;
			String tmp;
			JFileChooser chooser=new JFileChooser("");
			
			
			response=chooser.showSaveDialog(null);
			
			if(response==JFileChooser.APPROVE_OPTION) {
				

				File f1=new File(chooser.getSelectedFile().getAbsolutePath());
				
				tmp=f1.getPath();
				userFile.arr2File(arrayAll, tmp);
				new Message("Filed has been saved");
				System.out.println(tmp);
			}
			
		}
		if(e.getSource()==menuItemE1) {
			this.bubble=true;
			if(this.Mainstr==null) {
				System.out.println("Please Upload as File through Load function");
				new Message("Please Upload as File through Load function");
			}
			else {
				arrayAll=manySort.bubbleSort(manyFile.File2arr(Mainstr));
					if(arrayAll!=null) {	
						for(int i:arrayAll) {
							System.out.println(i);
						}
					}
				}
			clicked=true;
		}
		if(e.getSource()==menuItemE2) {
			
			//this.bubble=true;
			if(this.Mainstr==null) {
				System.out.println("Please Upload as File through Load function");
				new Message("Please Upload as File through Load function");
			}
			else {
				arrayAll=manySort.selectionSort(manyFile.File2arr(Mainstr));
					if(arrayAll!=null) {	
						for(int i:arrayAll) {
							System.out.println(i);
						}
					}
				}
			clicked=true;
		}
		if(e.getSource()==menuItemE3) {
			
			//this.bubble=true;
			if(this.Mainstr==null) {
				System.out.println("Please Upload as File through Load function");
				new Message("Please Upload as File through Load function");
			}
			else {
				arrayAll=manySort.quickSorting(manyFile.File2arr(Mainstr));
					if(arrayAll!=null) {	
						for(int i:arrayAll) {
							System.out.println(i);
						}
					}
				}
			clicked=true;
		}
		if(e.getSource()==menuItemD1) {
			if(this.Mainstr==null) {
				System.out.println("Please Upload as File through Load function");
				new Message("Please Upload as File through Load function");
			}
			else {
				arrayAll=manyFile.File2arr(Mainstr);
				b1=new binary(arrayAll[0]);
				for(int i=1;i<arrayAll.length;i++) {
					b1.Binary(arrayAll[i]);
				}
				Node tmp=b1.head;
				new Message("Binary Sorting completed");
			}
		}
		
		
	}
	
	
}
