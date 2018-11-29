import java.util.*;

import javax.swing.JOptionPane;
public class MyConverter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double TempCel;
		double TempFar;
		Long result = 1L;

		
		
		String Options ;
		
		String option = JOptionPane.showInputDialog("Press 1 to convert to Celsius. \nPress 2 to convert to Fahrenheit. "
				+ "\nPress 3 for Square Root. \nPress 4 to Factor a number. \nPress 5 to convert from inches to meters. \nPress 6 to convert from Kilometers to Miles."
				+ "\nPress 7 to convert from Miles to Kilometers. \nPress 8 to convert from Decimal to Binary. \nPress 9 to convert from Binary to Decimal number. ");    

		double num=Double.parseDouble(option);
	
		
		if(num==1){
			
			String num1 = JOptionPane.showInputDialog("Please enter temperature in Fahrenheit: ");
			
			double temp1 = Double.parseDouble(num1);
			
			TempCel= ((temp1 - 32)*5)/9;
			int TempCel2 = (int)Math.round(TempCel); //Parsing a Double to Int in order to round off the number.
			
			JOptionPane.showMessageDialog(null, "Temperature is: " +TempCel2+ " C... Thank you for using MyConverter !!!");
			
		}
		
		else if(num==2){
			String num2 = JOptionPane.showInputDialog("Please enter temperature in Celsius: ");
			
			float temp2=Float.parseFloat(num2);
			
			TempFar= ((temp2 * 9)/5)+32;
			int TempFar2 = (int)Math.round(TempFar); //Parsing a Double to Int in order to round off the number.
			
			JOptionPane.showMessageDialog(null, "Temperature is: " +TempFar2+ " Fahrenheits... Thank you for using MyConverter !!!");
		}
		
		else if(num==3){
			String num3 = JOptionPane.showInputDialog("Please enter a number to get the SQ.Root: ");
			
			double SR1 = Double.parseDouble(num3);
			
			int numero = (int)Math.round(SR1);
			
			JOptionPane.showMessageDialog(null, "The Square root of " +SR1+ " is: " +Math.sqrt(numero)+ "... Thank you for using MyConverter !!!");
		}
		
		else if(num==4){
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number to Factor: "));
			
			
			for(int f = numero; f>0; f--){
				
				result = result*f;
				System.out.println("           Number: " + f );
				
				}
			
			JOptionPane.showMessageDialog(null, "The Result for the entire Factorial is: " +result+ "... Thank you for using MyCoverter !!!");
			
			}
		
		else if(num==5){     
			
			String num5 = JOptionPane.showInputDialog("Please enter inches: ");
			double inches = Double.parseDouble(num5);
			double meters = inches * 0.0254;
			
			JOptionPane.showMessageDialog(null, "The result is: " + meters + " mts... Thank you for using MyConverter !!! "); 
			
		}
		
		else if(num==6){
			
			String num6 = JOptionPane.showInputDialog("Please enter Kilometers: ");
			double Kilometers = Double.parseDouble(num6);
			double Miles = Kilometers * 0.62137;
			
			JOptionPane.showMessageDialog(null, "The result is: " + Miles + " m/h... Thank you for using MyConverter !!! "); 
			
		}
		
		
		else if(num==7){
			
			String num7 = JOptionPane.showInputDialog("Please enter Miles: ");
			double Miles = Double.parseDouble(num7);
			double Kilometers = Miles / 0.62137;
			double Kilometers1 = Math.round(Kilometers*100.0)/100.0;
			
			JOptionPane.showMessageDialog(null, "The result is: " + Kilometers1 + " k/h... Thank you for using MyConverter !!! ");
		}
		
		
		else if(num==8){
			
			
			
			String numero2 = JOptionPane.showInputDialog("Please enter Decimal number: ");
			
			int numero1 = Integer.parseInt(numero2);
			
			int resultR1 = numero1  / 2;
			int resultR01 = numero1 % 2;
			
			int resultR2 = resultR1 / 2;
			int resultR02 = resultR2 % 2;
			
			int resultR3 = resultR2 / 2;
			int resultR03 = resultR2 % 2;
			
			int resultR4 = resultR3 / 2;
			int resultR04 = resultR03 % 2;
			
			
				
			JOptionPane.showMessageDialog(null,"The division of " +numero1+ " by 2 is: " +resultR1+ ", " +resultR2+ ", " +resultR3+ ", " +resultR4 +
					" --- The binary is " +resultR04 + resultR03 +resultR02+ resultR01 + "        "); //last space was left for margin purposes.
			
			
			    
	}
		
		else if(num==9){
			
			String numero9 = JOptionPane.showInputDialog("Please enter Binary number: ");
			
			int num9 = Integer.parseInt(numero9);
			
				for(int B = num9; B>0; B--){
				
				B = B%2;
				System.out.println("           Number: " + B );
				}
		}
		
	}

}
