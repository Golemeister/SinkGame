package igra;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class Kvadrat extends Canvas{
	
	protected Color color;
	protected boolean isSelected = false;
	protected boolean canBeSelected;
	protected int height = 75;
	protected int width = 75;
	protected Cev cev = null;
	
	public Kvadrat() {
		setSize(width, height);
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				Kanalizacija k = (Kanalizacija) getParent();
				k.traziPromenu((Kvadrat) e.getSource());
			}
			
		});
	}
	
	public void dodajCev(String string) {
		if(string == "Levo-Desno" || string == "Gore-Dole" || string == "Dole-Gore") {
			cev = new LevoDesnoCev(string);
		}else {
			cev = new LevoDoleCev(string);
		}
		
	}
	
	public boolean canBeSelected() {
		return canBeSelected;
	}
	
	public void setSelected(boolean b) {
		isSelected = b;
	}
	
	public void paint(Graphics g) {
		if(isSelected) {
			g.setColor(Color.RED);
			g.drawRect(1, 1, width-1, height-1);
		}
		if(cev != null) {
			cev.paint(g);
		}
	}
}
