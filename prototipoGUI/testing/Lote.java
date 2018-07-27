package testing;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Lote {
	private Random azar;

	public Lote() {
		this.azar = new Random();
	}
	
	public void setColor(JPanel panel) { 
		int segnal = this.azar.nextInt(2);
		if(segnal == 0) {
			panel.setBackground(SystemColor.textHighlight); 
		}else {
			panel.setBackground(SystemColor.activeCaptionBorder); 			
		}
	}

}