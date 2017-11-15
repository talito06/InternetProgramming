package project_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;


public class GUI_Demo extends JFrame {
	
	DrawJPanel jpFun;	

private DrawJPanel jpWriteAndDraw;


	public GUI_Demo(){
	 JPanel jp = new JPanel();
		
     jp.setLayout(new BorderLayout());
   //  JPanel westPanel = new JPanel();
 //	westPanel.setLayout(new GridLayout(2,1));
 	
 	// North JColorChooser
 //	JColorChooser jpNorthColorChooser = new JColorChooser();
 	
 	// center WritingAndDrawing
 //	jpWriteAndDraw = new DrawJPanel();
 	
 	// East & West controls
 	//South also add your JPanel with components
 	// Checkboxes jpCB = new Checkboxes();
 	// RadioButtons jpRB = new RadioButtons();
 	
 	// jp.add( jpWriteAndDraw, BorderLayout.NORTH);
 	// jp.add(jpWriteAndDraw, BorderLayout.CENTER);
 	 
 	// westPanel.add(jpCB); // checkbox panel
 	// westPanel.add(jpRB); // radio button panel
 	// jp.add(westPanel, BorderLayout.WEST);
		  	
	//	JPanel westPanel = new JPanel();
	//	westPanel.setLayout(new GridLayout(1,1)); // adding the Checkbox class
		

	    
	    // instance of the class ..calling the slider class
		
 	 /*  JSlider sliderControl = new JSlider();
		sliderControl= new JSlider(JSlider.HORIZONTAL,0,30,0);
		
		sliderControl.setMajorTickSpacing(10);
		sliderControl.setMinorTickSpacing(1);
		sliderControl.setPaintLabels(true);
		sliderControl.setPaintTicks(true);
	
	  westPanel.add(sliderControl);
	 
		*/
		
		
		
	CenterJP jp4 = new CenterJP();
	//JPanel  panel4 = new JPanel ();
	
	
	/// FOR THE PICK A COLOR LOCATION
	jpFun = new DrawJPanel();

	jp.add(jpFun,  BorderLayout.CENTER);
	 MyColorChooserJP color = new MyColorChooserJP();
 	MyColorChooserJP jpColorInHere = new 	MyColorChooserJP();
	jp.add(jpColorInHere, BorderLayout.NORTH);
	add(jp);
	
//	
	
	//can add other custom JPanel to jp in the north, south, east,west region
		//DrawJPanel jp3 = new DrawJPanel(); // instance of class calling it 
	//	jp3.add(jpFun, BorderLayout.CENTER);
     	//MySecondJP jp2 = new MySecondJP();
     	// MyhwJP   jp1 = new  MyhwJP();
     	
   //g     jp.add(jp3);  /// adding the class
     	 jp.add(jp4);
     //	 jp.add(jp1);
     	
     	
     	add(jp);
     	
     	setSize(700, 700);
     	setVisible(true);
     	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		System.out.println("My first cmp342 project");
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			
			 GUI_Demo gui = new  GUI_Demo();
		}

	});
		System.out.println("Done with this gui now ");
	}
	}


