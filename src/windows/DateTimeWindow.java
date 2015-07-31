package windows;

import main.BackgroundTasks;

import com.googlecode.lanterna.gui.Action;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Label;

public class DateTimeWindow extends Window {

	Label testLabel;
	
	public DateTimeWindow() {
		super("Date/Time");
		
		testLabel = new Label();
		
		addComponent(testLabel);
		
		addComponent(new Button("Close", new Action() {
            public void doAction() {
               close();
            }
        }));
		
		BackgroundTasks backgroundTasks = new BackgroundTasks("datetime", testLabel);
		Thread backgroundTasksThread = new Thread(backgroundTasks);
		
		backgroundTasksThread.start();
		
	}

}
