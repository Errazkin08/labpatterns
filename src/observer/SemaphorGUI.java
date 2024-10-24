package observer;

import java.awt.Color;
import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;


public class SemaphorGUI extends JFrame implements Observer{
	/** stores the associated ConcreteSubject */
	public SemaphorGUI (Observable obs) {
		obs.addObserver(null);
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}     

