package igra;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Aplikacija extends Frame{

	
	
	public Aplikacija() {
		setBounds(700, 200, 500, 430);
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
		populateWindow();
		setVisible(true);
	}
	
	void populateWindow() {	
		 
		setBackground(Color.WHITE);
		Kanalizacija k = new Kanalizacija(5,5);
		Panel komande=new Panel();
		komande.setLayout(new GridLayout(8,1));
		komande.setBackground(Color.WHITE);
		CheckboxGroup cbg = new CheckboxGroup();
		komande.add(new Checkbox("Levo-Desno", cbg, false));
		komande.add(new Checkbox("Gore-Dole", cbg, false));
		komande.add(new Checkbox("Dole-Gore", cbg, false));
		komande.add(new Checkbox("Levo-Dole", cbg, false));
		komande.add(new Checkbox("Levo-Gore", cbg, false));
		komande.add(new Checkbox("Gore-Desno", cbg, false));
		komande.add(new Checkbox("Dole-Desno", cbg, false));
		
		Button dugme=new Button("Dodaj!");
		komande.add(dugme);
		dugme.addActionListener(new ActionListener() {
            
			@Override
			public void actionPerformed(ActionEvent e) {
				Checkbox selectedCheckbox = cbg.getSelectedCheckbox();
                if (selectedCheckbox != null) {
                    k.dodajCev(selectedCheckbox.getLabel());
                }
                k.requestFocus();
			}
        });
		add(k,BorderLayout.CENTER);
		add(komande,BorderLayout.EAST);
		
	}
	
	public static void main(String[] args) {
		new Aplikacija();
	}
}
