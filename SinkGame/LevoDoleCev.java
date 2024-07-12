package igra;

import java.awt.Graphics;

public class LevoDoleCev extends Cev{

	public LevoDoleCev(String s) {
		super();
		type=s;
	}
	
	@Override
	public void innerPaint(Graphics g) {
		if(type=="Levo-Dole") {
			g.fillRect(0, getHeight()/4, 3*getWidth()/4, getHeight()/2);
			g.fillRect(getWidth()/4, getHeight()/4, getWidth()/2, getHeight());
		}else if(type=="Levo-Gore") {
			g.fillRect(0, getHeight()/4, 3*getWidth()/4, getHeight()/2);
			g.fillRect(getWidth()/4, 0, getWidth()/2, 3*getHeight()/4);
		}else if(type=="Gore-Desno") {
			g.fillRect(getWidth()/4, getHeight()/4, getWidth(), getHeight()/2);
			g.fillRect(getWidth()/4, 0, getWidth()/2, 3*getHeight()/4);
		}else {
			g.fillRect(getWidth()/4, getHeight()/4, getWidth(), getHeight()/2);
			g.fillRect(getWidth()/4, getHeight()/4, getWidth()/2, 3*getHeight()/4);
		}
	}

	@Override
	public void outerPaint(Graphics g) {
		
		int x[] = new int[3];
		int y[] = new int[3];
		
		if(type=="Levo-Dole") {
			
			g.drawLine(0, getHeight()/4, 3*getWidth()/4, getHeight()/4);
			g.drawLine(0, 3*getHeight()/4, getWidth()/4, 3*getHeight()/4);
			g.drawLine(3*getWidth()/4, getHeight()/4, 3*getWidth()/4, getHeight());
			g.drawLine(getWidth()/4, 3*getHeight()/4, getWidth()/4, getHeight());
			g.drawLine(getWidth()/4, getHeight()/2, getWidth()/2, getHeight()/2);
			g.drawLine(getWidth()/2, getHeight()/2, getWidth()/2, 3*getHeight()/4);
			int tmpx = getWidth()/2;
			int tmpy = 3*getHeight()/4;
			x[0] = tmpx+4;
			x[1] = tmpx;
			x[2] = tmpx-4;
			y[0] = tmpy;
			y[1] = tmpy+10;
			y[2] = tmpy;
			
		}else if(type=="Levo-Gore") {
			
			g.drawLine(0, getHeight()/4, getWidth()/4, getHeight()/4);
			g.drawLine(0, 3*getHeight()/4, 3*getWidth()/4, 3*getHeight()/4);
			g.drawLine(3*getWidth()/4,3*getHeight()/4, 3*getWidth()/4, 0);
			g.drawLine(getWidth()/4, getHeight()/4, getWidth()/4, 0);
			g.drawLine(getWidth()/4, getHeight()/2, getWidth()/2, getHeight()/2);
			g.drawLine(getWidth()/2, getHeight()/2, getWidth()/2, getHeight()/4);
			int tmpx = getWidth()/2;
			int tmpy = getHeight()/4;
			x[0] = tmpx-4;
			x[1] = tmpx;
			x[2] = tmpx+4;
			y[0] = tmpy;
			y[1] = tmpy-10;
			y[2] = tmpy;
			
		}else if(type=="Gore-Desno") {
			
			g.drawLine(getWidth()/4, 0,getWidth()/4, 3*getHeight()/4);
			g.drawLine(3*getWidth()/4, getHeight()/4, getWidth(), getHeight()/4);
			g.drawLine(3*getWidth()/4, 0,3*getWidth()/4, getHeight()/4);
			g.drawLine(getWidth()/4,3*getHeight()/4, getWidth(), 3*getHeight()/4);
			g.drawLine(getWidth()/2, getHeight()/4, getWidth()/2, getHeight()/2);
			g.drawLine(getWidth()/2, getHeight()/2, 3*getWidth()/4, getHeight()/2);
			int tmpx = 3*getWidth()/4;
			int tmpy = getHeight()/2;
			x[0] = tmpx;
			x[1] = tmpx+10;
			x[2] = tmpx;
			y[0] = tmpy+4;
			y[1] = tmpy;
			y[2] = tmpy-4;
			
		}else {
			
			g.drawLine(getWidth()/4, getHeight(),getWidth()/4, getHeight()/4);
			g.drawLine(getWidth()/4, getHeight()/4, getWidth(), getHeight()/4);
			g.drawLine(3*getWidth()/4,getHeight(), 3*getWidth()/4,3*getHeight()/4);
			g.drawLine(3*getWidth()/4,3*getHeight()/4, getWidth(), 3*getHeight()/4);
			g.drawLine(getWidth()/2, 3*getHeight()/4, getWidth()/2, getHeight()/2);
			g.drawLine(getWidth()/2, getHeight()/2, 3*getWidth()/4, getHeight()/2);
			int tmpx = 3*getWidth()/4;
			int tmpy = getHeight()/2;
			x[0] = tmpx;
			x[1] = tmpx+10;
			x[2] = tmpx;
			y[0] = tmpy+4;
			y[1] = tmpy;
			y[2] = tmpy-4;
			
		}
		
		g.fillPolygon(x, y, 3);
	}

}
