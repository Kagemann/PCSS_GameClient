import org.newdawn.slick.SlickException;

public class ServerClientDecider {
	/**
	 * When isServer = true the server launches
	 * When isServer = false the client launches
	 */
	static final boolean isServer = false;
	static final boolean isTest = false;
	static final boolean isOther = false;

	
	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		if (isOther) {
			BuildTesting.start();
		}
		
		else if (isServer)
			ServerMain.start();
		else {
			try {
				testMain.init();
			} catch (SlickException e) {
				e.printStackTrace();
			}
		}
	}
}