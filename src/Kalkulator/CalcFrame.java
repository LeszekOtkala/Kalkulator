package Kalkulator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.util.Set;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
* Program Kalkulator, wykonujacy podstawowe dzialania arytmetyczne
* klasa CalcFrame odowiedzialna za graficzny interfejs uzytkownika
*
* @author Leszek Otkała
* @version 0.2
*/

public class CalcFrame extends JFrame{

	//tworzenie elementow wyswietlających podane liczby, operacje i wyniki
	//komponenty te sluzą rowniez do wymiany danych miedzy operacjami
	final static Label liczba2=new Label("----");
	final static Label liczba3=new Label("----");
	final static JTextField disp=new JTextField("0");
	final static Label operacja=new Label("--");
	static boolean next=false;
	
		//konstruktor bezparametrowy
	public CalcFrame() {
		
		//ustawienie wymiarow, ustawienie na ekranie, ustawienie operacji przy zamknieciu
		setSize(300,300);
		setLocation(400,100);
		setResizable(false);
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//utworzenie paneli: panel1 czesc wyswietlająca wyniki
		//					 panel2 czesc aktywna - do wprowadzania danych i operacji
		JPanel panel1= new JPanel();
        JPanel panel2= new JPanel();
        
        	//wykorzystanie menedzerów Layoutu
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(panel1,BorderLayout.PAGE_START);
        getContentPane().add(panel2, BorderLayout.CENTER);
       
        	panel1.setLayout(new BorderLayout());
        	panel2.setLayout(new GridLayout(0,4,5,5));
        	
        	//utworzenie obiektów słuchaczy numAc - dla klawiszy do wprowadzania liczb
        	// func dla klawiszy operacyjnych
        	ActionListener numAc = new NumAction();
        	ActionListener func = new FuncAction();
        	
        		//dodanie komponentów wyświetlających do panel1
        		panel1.add(liczba2,BorderLayout.PAGE_START);
        		panel1.add(operacja, BorderLayout.LINE_START);
        		panel1.add(liczba3,BorderLayout.CENTER);
        		panel1.add(disp, BorderLayout.PAGE_END);
        		
        			// ustawienie parametrów glownego wyswietlacza
        			disp.setEditable(false);
        			disp.setHorizontalAlignment(JTextField.RIGHT);
        			disp.setBackground(Color.white);
        			disp.setForeground(Color.blue);
        			
        		//dodanie buttonow do panel2, przypisanie odpowiedniego słuchacza	
        		// rozmieszczenie w wierszach po 4 przyciski	
        		JButton butSqrt= new JButton("sqrt");
		        butSqrt.addActionListener(func);
		        panel2.add(butSqrt);
		        
		        JButton butNeg = new JButton("+/-");
		        butNeg.addActionListener(func);
		        panel2.add(butNeg);
		        
		        JButton butC = new JButton("C");
		        butC.addActionListener(func);
		        panel2.add(butC);
		        
		        JButton butCE = new JButton("CE");
		        butCE.addActionListener(func);
		        panel2.add(butCE);
		        
		        
		        JButton but7 = new JButton("7");
		        but7.addActionListener(numAc);
		        panel2.add(but7);
		        
		        JButton but8 = new JButton("8");
		        but8.addActionListener(numAc);
		        panel2.add(but8);
		        
		        JButton but9 = new JButton("9");
		        but9.addActionListener(numAc);
		        panel2.add(but9);
		        
		        JButton butMult= new JButton("*");
		        butMult.addActionListener(func);
		        panel2.add(butMult);
		       
		        
		        JButton but4 = new JButton("4");
		        but4.addActionListener(numAc);
		        panel2.add(but4);
		        
		         JButton but5 = new JButton("5");
		        but5.addActionListener(numAc);
		        panel2.add(but5);
		        
		        JButton but6 = new JButton("6");
		        but6.addActionListener(numAc);
		        panel2.add(but6);
		        JButton butDiv= new JButton("/");
		        butDiv.addActionListener(func);
		        panel2.add(butDiv);
		       
		        
		        JButton but1 = new JButton("1");
		        but1.addActionListener(numAc);
		        panel2.add(but1);
		        
		        JButton but2 = new JButton("2");
		        but2.addActionListener(numAc);
		        panel2.add(but2);
		        
		        JButton but3 = new JButton("3");
		        but3.addActionListener(numAc);
		        panel2.add(but3);
		        
		        JButton butMinus= new JButton("-");
		        butMinus.addActionListener(func);
		        panel2.add(butMinus);
		       
   
		        JButton but0 = new JButton("0");
		        but0.addActionListener(numAc);
		        panel2.add(but0);
		        
		        JButton butDot= new JButton(".");
		        butDot.addActionListener(func);
		        panel2.add(butDot);
		        
		        JButton butPlus= new JButton("+");
		        butPlus.addActionListener(func);
		        panel2.add(butPlus);
		       
		        JButton butResult= new JButton("=");
		        butResult.addActionListener(func);
		        panel2.add(butResult);
		        
        //ustawienie widoczności
        setVisible(true);
	}
	
}