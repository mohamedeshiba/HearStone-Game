package view;

import java.awt.* ; 
import javax.swing.* ; 
import java.awt.event.*; 
public class FirsWindow implements ActionListener{
	public FirsWindow(){	JFrame mywindow = new JFrame(); 
	mywindow.setSize(400,500); 
	mywindow.setVisible(true);
	JLabel mylabel = new JLabel("This is my window");  
		mywindow.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0); 
			}
			
				
		});
		mywindow.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				System.out.println(e.getX()+" " + e.getY());
			}
		});
		
			mywindow.setTitle("Mohamed");  
			mywindow.getContentPane().setBackground(Color.RED); 
			 mywindow.setLayout(new BorderLayout()); 
			mywindow.getContentPane().add(mylabel, BorderLayout.NORTH);
			JButton mybutton = new JButton(); 
			mybutton.setBounds(300,300,50,50);
			mywindow.add(mybutton);  
			mybutton.addActionListener(this); 
			mywindow.setBackground(arg0);
}

	public static void main(String args[]) {
		new FirsWindow(); 
	}
	
	public void actionPerformed(ActionEvent e){
		System.exit(0); 
	}
}