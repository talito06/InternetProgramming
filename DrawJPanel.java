package project_1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DrawJPanel extends CenterJP implements KeyListener {
	
	// these class is not been used i have theses methods on my center class
	 private Font font;
	 private FontMetrics fm;
	 private int fontSize = 50;
	  
	private JButton jb1;
	
	
	
	public DrawJPanel(){  /// 
		  super();
		//setBackground(Color.RED
		 font = new Font("serif" , Font.BOLD, fontSize);//default size;
		 font.getSize();
		 
		 fm = getFontMetrics(font);// want to be able to measure my string to draw
		 addKeyListener(this);  
	 
		
	//	jb1 = new JButton("BLUE");
		//jb2 = new JButton("RED");
		//jb3 = new JButton("GREEN");
		
		//jb1.setPreferredSize(new Dimension(50,50));

	//	jb1.addActionListener(this);
		//jb2.addActionListener(this);
		//jb3.addActionListener(this);

	//	add(jb1);
		//add(jb2);
		//add(jb3);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	
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
	public void keyTyped(KeyEvent e) {
		
		String s = String.valueOf(e.getKeyChar());
		if(!mouseIsPressed){
			Graphics g = getGraphics();
			Graphics2D h = (Graphics2D)g;
			h.setFont(new Font(font.getFamily(), font.getStyle(), fontSize));
			//h.draws
			g.setColor(Color.RED);
			lastX += fm.stringWidth(s);//increase x by width to move next char over
			g.drawString(s, lastX, lastY);
			// going to write all the chars we type on top of each other
			g.dispose();
		}
		System.out.println("IN key typed "+ s);
		
	}

			
		

		}

		
	


