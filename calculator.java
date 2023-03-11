import java.awt.*; 
import java.awt.event.*; 
 
public class AwtCalculator implements ActionListener{ 
 
 	Frame f = new Frame("Calculator"); 
 	 
 	Label l1 = new Label("Enter First Number "); 
 	Label l2 = new Label("Enter Second Number "); 
 	Label l3 = new Label("Result"); 
 	 
 	TextField num1 = new TextField(); 
 	TextField num2 = new TextField(); 
 	TextField result = new TextField(); 
 	 
 	Button add = new Button("Add");  	Button sub = new Button("Sub"); 
 	Button mul = new Button("Mul"); 
 	Button div = new Button("Div"); 
 	Button clear = new Button("Clear"); 
 	 
 	AwtCalculator(){ 
 	 	 
 	 	l1.setBounds(50,50,130,30);  	 	l2.setBounds(50,100,130,30);  	 	l3.setBounds(50,150,130,30); 
 	 	 
 	 	num1.setBounds(200,50,150,30);  	 	num2.setBounds(200,100,150,30);  	 	result.setBounds(200,150,150,30); 
 	 	 
 	 	add.setBounds(50,250,70,30);  	 	sub.setBounds(130,250,70,30);  	 	mul.setBounds(210,250,70,30);  	 	div.setBounds(290,250,70,30); 
 	 	clear.setBounds(370,250,70,30); 
 	 	 
 	 	add.addActionListener(this);  	 	sub.addActionListener(this);  	 	mul.addActionListener(this);  	 	div.addActionListener(this); 
 	 	clear.addActionListener(this); 
 	 	 
 	 	f.add(l1);f.add(l2);f.add(l3);f.add(num1);f.add(num2);f.add(result); 
 	 	f.add(add);f.add(sub);f.add(mul);f.add(div);f.add(clear); 
 	 	f.setLayout(null); 
 	 	f.setVisible(true); 
 	 	f.setSize(500,500); 
 	} 
 	public static void main(String[] args) { 
 	 	 
 	 	AwtCalculator a = new AwtCalculator(); 
 	} 
 	@Override 
 	public void actionPerformed(ActionEvent e) { 
 	 	 
 	 	double number1 = Double.parseDouble(num1.getText());  	 	double number2 = Double.parseDouble(num2.getText()); 
 	 	 
 	 	if(e.getSource()==add) {  	 	 	double addition = number1+number2; 
 	 	 	result.setText(Double.toString(addition)); 
 	 	} 
  else if(e.getSource()==sub) {    double subtract = number1-number2; 
 	 	 	result.setText(Double.toString(subtract)); 
 	 	} 
 	 	else if(e.getSource()==mul) {  	 	 	double multi = number1*number2; 
 	 	 	result.setText(Double.toString(multi)); 
 	 	} 
 	 	else if(e.getSource()==div) {  	 	 	double divi = number1/number2; 
 	 	 	result.setText(Double.toString(divi)); 
 	 	} 
 	 	else {  	 	 	num1.setText("");  	 	 	num2.setText("");  	 	 	result.setText(""); 
 	 	} 
 	} 
}

