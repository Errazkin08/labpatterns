package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("Dani", 35);
		new PacientObserverGUI (pacient);
		new PacientSymptomGUI  (pacient);
		new PacientThermometerGUI(pacient);
		new SemaphorGUI(pacient);
		Covid19Pacient pacient2=new Covid19Pacient("aimar", 35);
		new PacientObserverGUI (pacient2);
		new PacientSymptomGUI  (pacient2);
		new PacientThermometerGUI(pacient2);
		new SemaphorGUI(pacient2);

		Covid19Pacient pacient3=new Covid19Pacient("Urtzi", 35);
		new PacientObserverGUI (pacient3);
		new PacientSymptomGUI  (pacient3);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient3);

		
	}


}
