import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui implements ActionListener {
  int count=0;
  private JLabel label;
  private JFrame frame;
  private JPanel panel;
  
   
	
	public Gui() {
		// TODO Auto-generated constructor stub
		JFrame frame=new JFrame();
		  panel=new JPanel();
		JButton button=new JButton("Click Here");
		button.addActionListener(this);
	    label=new JLabel("Number of clicks: 0");
		
		panel.setBorder(BorderFactory.createEmptyBorder(30 ,30, 10, 10));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My GUI");
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gui();

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of clicks "+ count);
		
	}

}