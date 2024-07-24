package labia2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class FlowLayoutDemo{
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			JFrame frame = new JFrame("Example");
			
			frame.setLayout(new FlowLayout());
			frame.setSize(500,500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel label = new JLabel("Press any button");
			
			JButton Alpha = new JButton("Alpha");
			JButton Beta = new JButton("Beta");
			
			Alpha.addActionListener(ae -> label.setText("Alpha was Pressed"));
			Beta.addActionListener(ae -> label.setText("Beta was Pressed"));
			
			frame.add(Alpha);
			frame.add(Beta);
			frame.add(label);
			
			frame.setVisible(true);
		});
	}
}
