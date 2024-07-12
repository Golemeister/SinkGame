package igra;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Cev extends Kvadrat{
	
	protected String type = "";
	
	public Cev() {
		color = new Color(170,170,170);
		setBackground(color);
		canBeSelected = true;
	}
	
	public abstract void innerPaint(Graphics g);
	
	public abstract void outerPaint(Graphics g);
	
	public void paint(Graphics g) {
		g.setColor(new Color(204, 204, 204));
		innerPaint(g);
		g.setColor(Color.BLACK);
		outerPaint(g);
	}

}
