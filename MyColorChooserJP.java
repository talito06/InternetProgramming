package project_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyColorChooserJP  extends JPanel implements ActionListener{
	
	  /// these class is to the colors appears
	
	 static JButton jbColor;
	 
	 static Color mColor;  /// to i can change the colors on my shapes
	 // i did getter and setters to  i  can call it from my 
	 
	public MyColorChooserJP () {
		
		 
		  jbColor = new JButton ("colors options");
		  jbColor.addActionListener(this);
		  add(jbColor);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Color bgColor = JColorChooser.showDialog(this, "pick a color", Color.RED);
		mColor=bgColor;
		setBackground(bgColor);
		
	}




	public static Color getmColor() {
		return mColor;
	}




	public static void setJbColor(JButton jbColor) {
		MyColorChooserJP.jbColor = jbColor;
	}
}
