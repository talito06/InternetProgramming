package project_1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MySecondJFrame extends JFrame implements ActionListener {

	/*private JButton jb1, jb2, jb3;

	public MySecondJFrame() {
		setLayout(new GridLayout(1, 3));
		DrawJPanel JP1= new DrawJPanel();
		add(JP1);
		
		jb1 = new JButton("BLUE");
		 jb2 = new JButton("YELLOW");
		 jb3 = new JButton("WHITE");

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		 jb3.addActionListener(this);

		add(jb1);
		add(jb2);
		add(jb3);
	}
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		String btnFace = e.getActionCommand(); // get the String on the face

		switch (btnFace) {

		case "BLUE":
			setBackground(Color.BLUE);
			break;
		case "YELLOW":
			setBackground(Color.YELLOW);
			break;
		case "WHITE":
			setBackground(Color.WHITE);
			break;
		default:

			// setBackground(Color.WHITE);
			// break;

		}

	}

}
