package main;

import windows.WelcomeWindow;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;

public class Main {

	public static GUIScreen guiScreen;
	
	public static void main(String[] args) {
		
		guiScreen = TerminalFacade.createGUIScreen();
		
		guiScreen.getScreen().startScreen();
		guiScreen.setTitle("Monolith Console");
		
        Window welcomeWindow = new WelcomeWindow();
        
        guiScreen.showWindow(welcomeWindow, GUIScreen.Position.CENTER);
                        
	}

}
