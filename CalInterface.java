// Calculator Interface
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class CalInterface implements ActionListener
{
	JFrame frm;
	JPanel pnlHead,pnlBody;
	JTextField txtDisplay;
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDiv,btnMul,btnSub,btnAdd,btnEqual,btnOFF,btnON,btnC,btnDec;
	
	public void initialize()
	{
		frm = new JFrame("My Calculator...");
		
		pnlBody = new JPanel();
		pnlHead = new JPanel();
		
		txtDisplay = new JTextField(10);
		btn0 = new JButton("0");
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnDiv = new JButton("/");
		btnMul = new JButton("*");
		btnSub = new JButton("-");
		btnAdd = new JButton("+");
		btnEqual = new JButton(".");
		btnOFF = new JButton("OFF");
		btnOFF.addActionListener(this);
		btnON = new JButton("ON");
		btnON.addActionListener(this);
		btnC = new JButton("C");
	}
	public void addComp()
	{
		frm.setSize(300,500);
		frm.setLayout(new GridLayout(2,1));
		frm.add(pnlHead);
		pnlHead.setLayout(new BorderLayout());
		pnlHead.add(txtDisplay);
		
		frm.add(pnlBody);
		pnlBody.setLayout(new GridLayout(5,4));
		pnlBody.add(btnOFF);
		pnlBody.add(btnON);
		pnlBody.add(btnC);
		pnlBody.add(btnDiv);
		pnlBody.add(btn1);
		pnlBody.add(btn2);
		pnlBody.add(btn3);
		pnlBody.add(btnMul);
		pnlBody.add(btn4);
		pnlBody.add(btn5);
		pnlBody.add(btn6);
		pnlBody.add(btnSub);
		pnlBody.add(btn7);
		pnlBody.add(btn8);
		pnlBody.add(btn9);
		pnlBody.add(new JButton(""));
		pnlBody.add(btn0);
		pnlBody.add(btnDec);
		pnlBody.add(btnEqual);
		
		frm.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnOFF)
		{
			txtDisplay.setEnabled(false);
			txtDisplay.setText("");
		}
		if(ae.getSource()==btnON)
		{
			txtDisplay.setEnabled(true);
		}
	}
	
	public static void main(String args [])
	{
		CalInterface cal = new CalInterface();
		cal.initialize();
		cal.addComp();
	}
	
}