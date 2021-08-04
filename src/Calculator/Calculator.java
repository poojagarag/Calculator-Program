package Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	private static final ActionListener ActionListener = null;
	JFrame frame = new JFrame();              // For GUI
	JPanel panel = new JPanel();              // For Panel
	JTextArea textarea = new JTextArea(2,10); // To set number of rows and columns of calculator
	
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();
	JButton button0 = new JButton();
	
	
	JButton buttonadd = new JButton();
	JButton buttonsub = new JButton();
	JButton buttonmul = new JButton();
	JButton buttondiv = new JButton();
	JButton buttonclear = new JButton();
	JButton buttondot = new JButton();
	JButton buttonequal = new JButton();
	
	
	double number1,number2,result;
	int add=0,mul=0,div=0,sub=0;
	
	public Calculator() {
		frame.setSize(340,450);  //set size of calculator layout such as height, width
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		//frame.setResizable(false);  //Calulator's frame cannot be resizable
		
		frame.add(panel);
		panel.setBackground(Color.gray);
		Border border= BorderFactory.createLineBorder(Color.cyan,4);
		textarea.setBorder(border);
		
		
		panel.add(textarea);  //adding text area
		textarea.setBackground(Color.BLACK);
		Border text_border = BorderFactory.createLineBorder(Color.blue);
		textarea.setBorder(text_border);
		
		
		
		
		Font font = new Font("arial", Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		
		
		button1.setPreferredSize(new Dimension(70,40));
		button1.setIcon(new ImageIcon("F:\\Buttons\\button1.png"));
		
		button2.setPreferredSize(new Dimension(70,40));
		button2.setIcon(new ImageIcon("F:\\Buttons\\button2.png"));
		
		button3.setPreferredSize(new Dimension(70,40));
		button3.setIcon(new ImageIcon("F:\\Buttons\\button3.png"));
		
		button4.setPreferredSize(new Dimension(70,40));
		button4.setIcon(new ImageIcon("F:\\Buttons\\button4.png"));
		
		button5.setPreferredSize(new Dimension(70,40));
		button5.setIcon(new ImageIcon("F:\\Buttons\\button5.png"));
		
		button6.setPreferredSize(new Dimension(70,40));
		button6.setIcon(new ImageIcon("F:\\Buttons\\button6.png"));
		
		button7.setPreferredSize(new Dimension(70,40));
		button7.setIcon(new ImageIcon("F:\\Buttons\\button7.png"));
		
		button8.setPreferredSize(new Dimension(70,40));
		button8.setIcon(new ImageIcon("F:\\Buttons\\button8.png"));
		
		button9.setPreferredSize(new Dimension(70,40));
		button9.setIcon(new ImageIcon("F:\\Buttons\\button9.png"));
		
		button0.setPreferredSize(new Dimension(70,40));
		button0.setIcon(new ImageIcon("F:\\Buttons\\button0.png"));
		
		buttondot.setPreferredSize(new Dimension(70,40));
		buttondot.setIcon(new ImageIcon("F:\\Buttons\\buttondot.png"));
		
		buttonclear.setPreferredSize(new Dimension(70,40));
		buttonclear.setIcon(new ImageIcon("F:\\Buttons\\buttonclear.png"));
		
		buttonadd.setPreferredSize(new Dimension(70,40));
		buttonadd.setIcon(new ImageIcon("F:\\Buttons\\buttonadd.png"));
		
		buttonsub.setPreferredSize(new Dimension(70,40));
		buttonsub.setIcon(new ImageIcon("F:\\Buttons\\buttonsub.png"));
		
		buttonmul.setPreferredSize(new Dimension(70,40));
		buttonmul.setIcon(new ImageIcon("F:\\Buttons\\buttonmul.png"));
		
		buttondiv.setPreferredSize(new Dimension(70,40));
		buttondiv.setIcon(new ImageIcon("F:\\Buttons\\buttondiv.png"));
		
		buttonequal.setPreferredSize(new Dimension(70,40));
		buttonequal.setIcon(new ImageIcon("F:\\Buttons\\buttonequal.png"));
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button0);
		panel.add(buttonadd);
		panel.add(buttonmul);
		panel.add(buttondiv);
		panel.add(buttonsub);
		panel.add(buttonclear);
		panel.add(buttondot);
		panel.add(buttonequal);
		
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttondot.addActionListener((ActionListener) this);
		buttonadd.addActionListener((ActionListener) this);
		buttonsub.addActionListener((ActionListener) this);
		buttonmul.addActionListener((ActionListener) this);
		buttondiv.addActionListener((ActionListener) this);
		buttonclear.addActionListener((ActionListener) this);
		buttonequal.addActionListener((ActionListener) this);
		
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source==buttonclear) {
			number1=0.0;
			number2=0.0;
			textarea.setText("");
		}
		
		if(source==button1) {
			textarea.append("1");
		}
		
		if(source==button2) {
			textarea.append("2");
		}
		if(source==button3) {
			textarea.append("3");
		}
		if(source==button4) {
			textarea.append("4");
		}
		if(source==button5) {
			textarea.append("5");
		}
		if(source==button6) {
			textarea.append("6");
		}
		if(source==button7) {
			textarea.append("7");
		}
		if(source==button8) {
			textarea.append("8");
		}
		
		if(source==button9) {
			textarea.append("9");
		}
		
		if(source==button0) {
			textarea.append("0");
		}
		if(source==buttondot) {
			textarea.append(".");
		}
		if(source==buttonadd) {
			number1=number_reader();
			textarea.setText("");
			add=1;
			div=0;
			mul=0;
			sub=0;
			
		}
		
		if(source==buttonsub) {
			number1=number_reader();
			textarea.setText("");
			add=0;
			div=0;
			mul=0;
			sub=1;
			
		}
		if(source==buttonmul) {
			number1=number_reader();
			textarea.setText("");
			add=0;
			div=0;
			mul=1;
			sub=0;
			
		}
		if(source==buttondiv) {
			number1=number_reader();
			textarea.setText("");
			add=0;
			div=1;
			mul=0;
			sub=0;
			
		}
		if(source==buttonequal) {
			number2=number_reader();
			textarea.setText("=");
			if(add>0) {
				result=number1+number2;
				textarea.setText(Double.toString(result));
			}
			if(sub>0) {
				result=number1-number2;
				textarea.setText(Double.toString(result));
			}
			if(mul>0) {
				result=number1*number2;
				textarea.setText(Double.toString(result));
			}
			if(div>0) {
				result=number1/number2;
				textarea.setText(Double.toString(result));
			}
		}
	}

	
	public double number_reader() {
		double number1;
		String s;
		s=textarea.getText();
		number1=Double.valueOf(s);
		return number1;
	}

}
