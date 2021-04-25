package aufgabe.aufgabe1;

import javax.swing.JOptionPane;

public class Spiel 
{
    public int siegPunkte;
    public Spieler[] spieler;
    
    Spiel()
    {
    	int anzSpieler = 0;
    	boolean inputOk = false;
    	while(!inputOk) {
    		try {
    			String input =  JOptionPane.showInputDialog("Anzahl Spieler");
    			inputOk = false;
    			anzSpieler = Integer.parseInt(input);
    		}
    		
    	
    		
    	}
    }
}
