package Kalkulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* Program Kalkulator, wykonujacy podstawowe dzialania arytmetyczne
* klasa FuncAction, zawiera glowna funkcjonalnosc kalkulatora
* okresla dzialanie po wcisnieci odpowiednich przyciskow operacyjnych
*
* @author Leszek Otkała
* @version 0.2
*/

class FuncAction implements ActionListener {
	 public void actionPerformed (ActionEvent arg0) {
		
		 String n = arg0.getActionCommand();
		
		 if(n.equals("CE")) {
			
			CalcFrame.disp.setText("0");
			CalcFrame.liczba2.setText("----");
			CalcFrame.liczba3.setText("----");
			CalcFrame.operacja.setText("--");
			CalcFrame.next=false;
		}

		else if(n.equals("C")) {
					
			CalcFrame.disp.setText("0");
			
		}
		else if(n.equals("+/-")) {
			
			String s1=CalcFrame.disp.getText();
			
			if(!(s1.equals("0"))&&!(s1.equals("0.0"))){
				int l=s1.length();
				int i=s1.indexOf("-");
					if(i==(-1))
						CalcFrame.disp.setText("-"+s1);
					else
						CalcFrame.disp.setText((s1.substring(1,(l))));
			}
		} 
		else if(n.equals(".")) {
				
			String s1=CalcFrame.disp.getText();
			int i=s1.indexOf(".");
			if (i==-1)
				CalcFrame.disp.setText(s1+".");
		}
		else if(n.equals("sqrt")) {
			
			String s1=CalcFrame.disp.getText();
			CalcFrame.liczba2.setText(s1);
			CalcFrame.operacja.setText("sq");
			CalcFrame.liczba3.setText("----");
			CalcFrame.disp.setText(pierwiastek(s1));
		}
		
		else { 
			String s1=CalcFrame.disp.getText();
			String s2=CalcFrame.liczba2.getText();
			String s3=CalcFrame.liczba3.getText();
			
			if(n.equals("-")) {
	             CalcFrame.operacja.setText("-");
	             
					if(s2.equals("----")){
						CalcFrame.liczba2.setText(s1); 
						CalcFrame.disp.setText("0");
					}
					
					else if(s3.equals("----")){
						CalcFrame.liczba3.setText(s1);
						CalcFrame.disp.setText(odejmij(s2, s1));
						CalcFrame.next=true;
					}
					else{					
						s2=odejmij(s2,s3);
		            	CalcFrame.liczba2.setText(s2);//s2=s2-s3;
			            CalcFrame.liczba3.setText(s1);
			            CalcFrame.disp.setText(odejmij(s2,s1));
			            CalcFrame.next=true;
	             }
	         } 
			
			else if(n.equals("+")) {
	            CalcFrame.operacja.setText("+");
	            
					if(s2.equals("----")){
						CalcFrame.liczba2.setText(s1); 
						CalcFrame.disp.setText("0");
					}
					
					else if(s3.equals("----")){
						CalcFrame.liczba3.setText(s1);
						CalcFrame.disp.setText(dodaj(s2, s1));
						CalcFrame.next=true;
					}
					else{					
						s2=dodaj(s2,s3);
		            	CalcFrame.liczba2.setText(s2);//s2=s2-s3;
			            CalcFrame.liczba3.setText(s1);
			            CalcFrame.disp.setText(dodaj(s2,s1));
			            CalcFrame.next=true;
	            }
	        }
			
			else if(n.equals("*")) {
	            CalcFrame.operacja.setText("*");
	            
					if(s2.equals("----")){
						CalcFrame.liczba2.setText(s1); 
						CalcFrame.disp.setText("0");
					}
					
					else if(s3.equals("----")){
						CalcFrame.liczba3.setText(s1);
						CalcFrame.disp.setText(pomnoz(s2, s1));
						CalcFrame.next=true;
					}
					else{					
						s2=pomnoz(s2,s3);
		            	CalcFrame.liczba2.setText(s2);//s2=s2-s3;
			            CalcFrame.liczba3.setText(s1);
			            CalcFrame.disp.setText(pomnoz(s2,s1));
			            CalcFrame.next=true;
	            }
	        }
			
			else if(n.equals("/")) {
	            CalcFrame.operacja.setText("/");
	            
					if(s2.equals("----")){
						CalcFrame.liczba2.setText(s1); 
						CalcFrame.disp.setText("0");
					}
					
					else if(s3.equals("----")){
						CalcFrame.liczba3.setText(s1);
						CalcFrame.disp.setText(podziel(s2, s1));
						CalcFrame.next=true;
					}
					else{					
						s2=podziel(s2,s3);
		            	CalcFrame.liczba2.setText(s2);//s2=s2-s3;
			            CalcFrame.liczba3.setText(s1);
			            CalcFrame.disp.setText(podziel(s2,s1));
			            CalcFrame.next=true;
	            }
	        }
			
			
			else if(n.equals("=")) {
				
				
	                String op=CalcFrame.operacja.getText();
	                
	                if(op.equals("+")){
	                	CalcFrame.disp.setText(dodaj(s2, s1));
	                	CalcFrame.liczba3.setText(s1);
	                	CalcFrame.operacja.setText("+ ");
	                }
	                else if (op.equals("-")){
	                	CalcFrame.disp.setText(odejmij(s2, s1));
	                	CalcFrame.liczba3.setText(s1);
	                	CalcFrame.operacja.setText("- ");
	                }
	                else if (op.equals("*")){
	                	CalcFrame.disp.setText(pomnoz(s2, s1));
	                	CalcFrame.liczba3.setText(s1);
	                	CalcFrame.operacja.setText("* ");
	                }
	                else if (op.equals("/")){
		                CalcFrame.disp.setText(podziel(s2, s1)); 
		                CalcFrame.liczba3.setText(s1);
		                CalcFrame.operacja.setText("/ ");
	                }
	                else ;
	                CalcFrame.next=true;  	
	                }
				
			}
      
	 } 
	 static String dodaj(String x, String y) {
	        double a=Double.valueOf(x);
	        double b=Double.valueOf(y);
	        double c=a+b;
	        String d = String.valueOf(c);
	        return d; 
	     }
	 
	 static String odejmij(String x, String y) {
	        double a=Double.valueOf(x);
	        double b=Double.valueOf(y);
	        double c=a-b;
	        String d = String.valueOf(c);
	        return d; 
	     }
	 static String pomnoz(String x, String y) {
	        double a=Double.valueOf(x);
	        double b=Double.valueOf(y);
	        double c=a*b;
	        String d = String.valueOf(c);
	        return d; 
	     }
	 static String podziel(String x, String y) {
	        double a=Double.valueOf(x);
	        double b=Double.valueOf(y);
	        if(b==0) return "ERROR!!! PRESS CE!!!";
	        else{
	        double c=a/b;
	        String d = String.valueOf(c);
	        return d;
	        }
	     }
	 static String pierwiastek(String x) {
	        double a=Double.valueOf(x);
	        a=Math.sqrt(a);       
	        String d = String.valueOf(a);
	        return d; 
	     }
}