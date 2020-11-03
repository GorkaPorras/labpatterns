package observer;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import domain.Covid19Pacient;
import observer.PacientThermometerGUI.TemperatureCanvas;


public class SemaphorGUI extends JFrame implements Observer{
	/** stores the associated ConcreteSubject */
	private TemperatureCanvas gauges;
	public void set(int level) { current = level; }	
	public int get(){return current;}
	public int getMax(){return Max;}
	public int getMin(){return Min;}
	
	private int Max, Min, current;
	
	public SemaphorGUI (Observable obs) {
		setSize(100, 100);
		setLocation(350,10);
		Color c=Color.green;
		getContentPane().setBackground(c);
		repaint();
		setVisible(true);
		obs.addObserver(this);
	}
	/*public void paint(Graphics g)
	{	Color c;
	    if (current<5) c=Color.green;
	     else if (current<10) c=Color.yellow;
	      else c=Color.red;
		//g.setColor(Color.black);
		g.setColor(c);
	}
	*/
	
	@Override
	public void update(Observable o, Object arg) {
		
	
	}
}     

