package Kalkulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
* Program Kalkulator, wykonujacy podstawowe dzialania arytmetyczne
* klasa NumAction okresla dzialanie przycisow do wprowadzania liczb
*
* @author Leszek Otkała
* @version 0.2
*/
class NumAction implements ActionListener {
	 public void actionPerformed (ActionEvent arg0) {
		String s1=CalcFrame.disp.getText();
		String n = arg0.getActionCommand();
			 
			if(!(CalcFrame.next)) {
				 if((s1.compareTo("0"))!=0)
					 CalcFrame.disp.setText(s1+n);
				 else  
					 CalcFrame.disp.setText(n);
				 
			 }
			 else {
				 CalcFrame.next=false;
				 CalcFrame.disp.setText(n);
			 }
		 }
	 		
 }	