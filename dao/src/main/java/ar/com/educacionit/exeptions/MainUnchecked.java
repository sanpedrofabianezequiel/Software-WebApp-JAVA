package ar.com.educacionit.exeptions;

import javax.swing.JOptionPane;

public class MainUnchecked {

	public static void  main(String [] args) {
		
		Integer a = 10;
		Integer b= 0;
		Integer c= a/b;
		JOptionPane.showInputDialog("La division es : " + c);
	}
}
