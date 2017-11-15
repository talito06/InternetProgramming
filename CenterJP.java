package project_1;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import day5.Checkboxes;
import day5.RadioButtons;
import day5.WritingAndDrawing;




public class CenterJP extends JPanel   implements KeyListener, MouseListener, ActionListener,MouseMotionListener, ChangeListener{
	
     public int  control =0;

	 private Font font;
	 private FontMetrics fm;
	  
	private JButton jb1;
     
     
     /// just added
     protected int lastX;
 	protected int lastY;
 	protected boolean mouseIsPressed;
 	protected Color lineColor;
 	protected int diameter;
 	protected String shapeType;
 	protected boolean shapeOn;
 	/// variables for the slider
 	protected int sliderNumber = 0;
    protected JSlider sliderControl;
    // for the characters in top of the if statements to work
     int x = 0;
     int y = 0;
   JButton jbColor;  ///  variable for the colors
    
    JButton jb;
    
    JSlider south;  // to the slider appears on the south
    
    
	  public  CenterJP(){
		  super();
		//setBackground(Color.RED
		 font = new Font("serif" , Font.BOLD, 25);//default size;
	    
		 fm = getFontMetrics(font);// want to be able to measure my 0string to draw
		 addKeyListener(this);  
	 
		  
		  
	
	
	JButton JB = new JButton("circle"); // adding the button circle`
	 add(JB);
	 JB.addActionListener(this);
	 
	 
	JButton JB2 = new JButton("rectangular");  // adding the button rectangular
	add(JB2);
	JB2.addActionListener(this);
	
	JButton JB3 = new JButton("square");    //  the same adding button
	add(JB3);
    JB3.addActionListener(this);
    
    
	JButton JB4 = new JButton ("Line");   //  the same adding button
	add(JB4);
	JB4.addActionListener(this);
	
/*	JButton JB5 = new JButton ("type");     //  the same adding button 
 * 
 */
	
	// to add the panel for the colors
//  	jbColor = new JButton("Colors Options");
//	jbColor.addActionListener(this);
	
 //  add(jbColor);
   
	/// JUST ADDED 
	
	
	 
    
	jb = new JButton("reset");   //  Adding the reset button
    add(jb,BorderLayout.SOUTH);
	jb.addActionListener(this);
	
	
        /// the slider codes
	
	sliderControl = new JSlider();
	sliderControl= new JSlider(JSlider.VERTICAL,0,30,0);
	
	sliderControl.setMajorTickSpacing(10);
	sliderControl.setMinorTickSpacing(1);
	sliderControl.setPaintLabels(true);
	sliderControl.setPaintTicks(true);
	
	sliderControl.addChangeListener(this);
	 
//	westPanel.add(sliderControl);
	
	add(sliderControl, BorderLayout.NORTH);  /// adding the reset 
	


	   lastX =0;
		lastY = 0;
		diameter = 30;
		shapeOn = false;
		addMouseListener(this);
		addMouseMotionListener(this);
	
		setBackground(Color.BLUE);  /// setting the color to the JFrame
		mouseIsPressed = false;
		// lineColor = Color.black;
	 
 //  addMouseListener(this);
//	this.setBackground(Color.blue);
//	JLabel JL1 = new JLabel("North Panel");
	//add(jb1);

	}
		private void drawCircle(Graphics g) {
			/// new
			g.fillOval(lastX - diameter/2,  lastY - diameter/2,  diameter,  diameter);
			
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if(control==1){  // if control ==1 draw a circle
		
		int diameter = 50;
		Graphics g = getGraphics();
		 g.setColor(MyColorChooserJP.getmColor());    /// to change the shape colors
		
		g.fillOval(x - diameter/2,  y- diameter/2,  diameter,diameter);
		g.dispose();
		
	}
		if(control==2){  //// if button == 2  draw a rectangular
			 x = e.getX();
			 y = e.getY();
			Graphics a = getGraphics();
			 a.setColor(MyColorChooserJP.getmColor());   // to change the shape colors.. also 
			 // calling my mycolorchoorjp class and a variable called getmcolor.
			a.fillRect(x, y, 70, 100);
			a.dispose();
			
		}
		if(control==3){      /// if the button == 3 do a square
		
			
			Graphics b = getGraphics();
			
			 b.setColor(MyColorChooserJP.getmColor());  //// added today. to change the shape colors

			b.fillRect(x, y, 40, 40);
			b.dispose();
		}
		if(control ==4){  // to control button line
			
			if(shapeOn) { // use the variable to determine if we'll draw a shape
				Graphics g = getGraphics();
				//shape type use logic to decide which shape
				
				//remenbergraphics2d for the shape color
				drawCircle(g);
				
				g.dispose();
			}
		}
	

			}

	


	@Override
	public void mouseEntered(MouseEvent e) {
		requestFocus(); // request the focus on the jpanel when the mouse enters
		record(e.getX(), e.getY());
		
	}
	  

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {

		mouseIsPressed = true;
		record(e.getX(), e.getY());
		if(control==4){
			mouseIsPressed = true;   //// to put control button lines
			record(e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseIsPressed = false; /// these code is to do the characters 
		 x = e.getX();
		 y = e.getY();
		if(control==4){
		mouseIsPressed = false;  // the mouse is release 
		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		g.drawLine(lastX,  lastY,  x,  y);
		
		record(x,y);
		g.dispose();
		
		System.out.println("Released AT:  "+x+" , "+y);
		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String face = e.getActionCommand(); // these  take out information from the buttons ( take their names  and their goals)
		
		
		/// to the reset button to work
		
	  	if(face.equalsIgnoreCase("reset")) {
	  		repaint();  // a method that java has
	  			
	}
	
		
		

			
		if (face.equalsIgnoreCase("circle")){
		//lineColor = JColorChooser.showDialog(this, "pick a color", Color.PINK);
			// if i put it here i can control the color of the circle shape pressing circle.
			control=1;
		}
			if (face.equalsIgnoreCase("rectangular")){
			///lineColor = JColorChooser.showDialog(this, "pick a color", Color.PINK);
				// if i put it here i can control the color of the rectagular shape pressing rectangular
				
				control=2;
			
		}
			if (face.equalsIgnoreCase("square")){
				///lineColor = JColorChooser.showDialog(this, "pick a color", Color.PINK);
				// if i put it here i can control the color of the rectagular shape pressing rectangular
				control=3;
			}
			if (face.equalsIgnoreCase("line")){
				///lineColor = JColorChooser.showDialog(this, "pick a color", Color.PINK);
				// if i put it here i can control the color of the rectagular shape pressing rectangular
				control=4;} /// to control the button line
	}	
	
	 //  if (face.equalsIgnoreCase("type")){
	//   control=5;} }

	 protected void record(int x, int y){
   	  lastX = x;
   	  lastY = y;
	 }

	@Override
	public void mouseDragged(MouseEvent e) {
		if(control==4) {  // this is to make sure that the button line don't appears without
			// pressing it.
		mouseIsPressed = true;
		int x = e.getX();
		int y = e.getY();
		Graphics g = getGraphics();
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(MyColorChooserJP.getmColor());
		//slider 
		g2d.setStroke(new BasicStroke(sliderNumber));
		
		g2d.drawLine(lastX, lastY, x, y);
	//	g.drawLine(10, 10, 100, 100);
		record(x,y);
		g.dispose();
		System.out.println("DRAGGED AT: "+x+", "+y);
		
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}
	@Override
	public void stateChanged(ChangeEvent e) {  // the slider method
		JSlider source = (JSlider) e.getSource();
			sliderNumber = (int)source.getValue();
			{
				
				
				
			}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) { // these method is to write characters
		
		String s = String.valueOf(e.getKeyChar());
		
		if(!mouseIsPressed){
			Graphics gPlain = getGraphics();
			Graphics2D g = (Graphics2D)gPlain;
			g.setColor(MyColorChooserJP.mColor);// calling the variable mcolor from the mycolorchooser
			
			
		//	font = new Font(font.getFontName(), font.getStyle(),sliderNumber*35);
			fm = getFontMetrics(font);
		
			
			System.out.println(fm.getDescent());
			g.setFont(font);
			lastX += fm. stringWidth(s)+10;  // i added the 10 to measure the space between the charectes
			//increase x by width to move next char over
			g.drawString(s, lastX,  lastY );
			// going to write all the chars we type on top of each other
			g.dispose();
		}
		System.out.println("IN key typed "+ s);
		
	}
		
	}
	


