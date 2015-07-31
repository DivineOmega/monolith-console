package main;

import java.util.Date;

import com.googlecode.lanterna.gui.component.Label;

public class BackgroundTasks implements Runnable {
		
	String type;
	Label label;
	
	public BackgroundTasks(String type, Label label) {
		this.type = type;
		this.label = label;
	}
	
	public void run() {
				
		while(true){
			if (type.equals("datetime")) {
				Date date = new Date();
				label.setText(date.toString());
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
