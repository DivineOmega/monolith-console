package windows;

import main.Main;

import com.googlecode.lanterna.gui.Action;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;
import com.googlecode.lanterna.gui.component.Button;
import com.googlecode.lanterna.gui.component.Label;
import com.googlecode.lanterna.gui.dialog.DialogButtons;
import com.googlecode.lanterna.gui.dialog.DialogResult;
import com.googlecode.lanterna.gui.dialog.MessageBox;

public class WelcomeWindow extends Window {

	public WelcomeWindow() {
		super("Main Menu");
		
		addComponent(new Label("This is the Monolith Console. You can do everything here. (¬‿¬)"));
				
		addComponent(new Button("Date/Time", new Action() {
            public void doAction() {
               DateTimeWindow testWindow = new DateTimeWindow();
               Main.guiScreen.showWindow(testWindow, GUIScreen.Position.CENTER);
            }
        }));
		
		addComponent(new Button("Exit", new Action() {
            public void doAction() {
            	
            	DialogResult result = MessageBox.showMessageBox(Main.guiScreen, "Exit", "Are you sure you want to exit?", DialogButtons.YES_NO);
            	
            	if (result==DialogResult.YES) {
            		System.exit(0);
            	}
            	
            }
        }));
		
	}

}
