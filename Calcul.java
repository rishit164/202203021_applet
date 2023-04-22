import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Calcul extends Applet implements ActionListener {
Button b1,b2,b3,b4,b5;
TextField T1,T2,T3;
Label L1,L2,L3;

	public void init()
	{
L1 = new Label("Enter 1st Number");
L1.setBounds(100,40,100,20);
T1 = new TextField();
T1.setBounds(210,40,100,20);
L2 = new Label("Enter 2nd Number");
L2.setBounds(100,80,100,20);
T2 = new TextField();
T2.setBounds(210,80,100,20);
L3 = new Label("Result");
L3.setBounds(100,120,100,20);
T3 = new TextField();
T3.setBounds(210,120,100,20);
b1 = new Button("+");
b1.setBounds(80,150,60,50);
b2 = new Button("-");
b2.setBounds(130,150,60,50);
b3 = new Button("x");
b3.setBounds(180,150,60,50);
b4 = new Button("/");
b4.setBounds(230,150,60,50);
b5 = new Button("Mod");
b5.setBounds(280,150,60,50);
add(L1);
add(L2);
add(L3);
add(T1);
add(T2);
add(T3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
setLayout(null);
	}

	public void actionPerformed(ActionEvent e)
	 {
		int a = Integer.parseInt(T1.getText());
		int b = Integer.parseInt(T2.getText());
		if (e.getSource() == b1) 
		{
			T3.setText(String.valueOf(a + b));
		}
		if (e.getSource() == b2) 
		{
			T3.setText(String.valueOf(a - b));
		}
		if (e.getSource() == b3) 
		{
			T3.setText(String.valueOf(a * b));
		}
		if (e.getSource() == b4)
		 {
			T3.setText(String.valueOf(a / b));
		}
		if (e.getSource() == b5) 
		{
			T3.setText(String.valueOf(a % b));
		}
	}
}