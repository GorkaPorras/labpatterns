package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Covid19Pacient	p1=new Covid19Pacient("aitor",	35);
		PacientObserverGUI	poGUI1 =	new PacientObserverGUI(p1);
		PacientSymptomGUI	psGUI1 =	new 	PacientSymptomGUI(p1);
		PacientThermometerGUI ptGUI1=new PacientThermometerGUI(p1);
		SemaphorGUI s =new SemaphorGUI(p1);
	/*	
		Covid19Pacient	p2=new Covid19Pacient("Gorka",	23);
		PacientObserverGUI	poGUI2 =	new PacientObserverGUI(p2);
		PacientSymptomGUI	psGUI2 =	new 	PacientSymptomGUI(p2);
		PacientThermometerGUI ptGUI2=new PacientThermometerGUI(p2);
		
		Covid19Pacient	p3=new Covid19Pacient("mikel",	73);
		PacientObserverGUI	poGUI3 =	new PacientObserverGUI(p3);
		PacientSymptomGUI	psGUI3 =	new 	PacientSymptomGUI(p3);
		PacientThermometerGUI ptGUI3=new PacientThermometerGUI(p3);
	

*/
		
		
		
	}


}
