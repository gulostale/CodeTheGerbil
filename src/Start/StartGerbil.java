package Start;
import Control.*;
import Model.Backend;

/**
 * Main program that runs the program
 * @author Jatar,Carlos
 */
public class StartGerbil {
	public static Backend backend;
	public static Controller controller;
	public static ActionListenersControl alc;
	
	/** 
	 * Main method to run the program
	 * @param args Command line arguments are not necessary
	 */
	public static void main(String[] args) {
		backend = new Backend();

		try{
			backend.setGameList(backend.loadSavedGames());
			
		}catch (Exception e1) { //if txt file stuff is cleared, it has issues so make a dummy user, and delete the dummy user for it to work
			System.out.println("No hay juegos guardados.");
		}

		controller = new Controller();
		alc = new ActionListenersControl();

	}
}