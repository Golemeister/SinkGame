package igra;

import java.awt.GridLayout;
import java.awt.Panel;
import java.util.ArrayList;

public class Kanalizacija extends Panel implements Runnable{

	private Kvadrat oznacen = null;
	private Thread nit = null;
	private boolean pauza = false;
	
	public Kanalizacija(int r,int k) {
//		nit = new Thread(this);
//      nit.start();
		setLayout(new GridLayout(r,k,1,1));
		for (int i = 0; i < r*k; i++) {
			add(new Zid());
		}
	}
	
	public void dodajCev(String string) {
		if(oznacen == null) return;
		oznacen.dodajCev(string);
		oznacen.repaint();
	}
	
	public void traziPromenu(Kvadrat k) {
		if(oznacen != null) {
			oznacen.setSelected(false);
			oznacen.repaint();
		}
		oznacen = k;
		oznacen.setSelected(true);
		oznacen.repaint();
	}
	
	@Override
	public void run() {
		try {
            while (!nit.isInterrupted()) {
                synchronized (nit) {
                    while (pauza) {
                        nit.wait();
                    }
                }
                

                repaint();
            }
        } catch (InterruptedException e) {
            System.out.println("uhvaćen exception");
        }
		
	}
	
}
