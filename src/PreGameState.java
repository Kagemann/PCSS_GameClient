//import lib
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

//class
public class PreGameState extends BasicGameState{
	//image objects 
	Image background, backButton, backButtonHighlighted;
	
	@Override
	public void init(GameContainer gc, final StateBasedGame s) throws SlickException {
		//instantiate objects
		background = new Image("resources/background.png");	
		backButton = new Image("resources/back.png");
		backButtonHighlighted = new Image("resources/backHighlighted.png");

		//creating a button from button class
		Button Back = new Button(Windows.scWidth/2 - backButton.getWidth()/2, Windows.scHeight/2 + 10, 326, 86, "Back", this) {
			@Override
			public void isClicked() {
				s.enterState(States.LobbyState);
			}
		};
	}
	//draws all objects
	@Override
	public void render(GameContainer gc, StateBasedGame s, Graphics g) throws SlickException {
		//draw background
		g.drawImage(background, 0, 0, Windows.scWidth, Windows.scHeight, 0, 0, 1366, 768);
		//draw title
		g.setColor(Color.black);
		g.drawString("WELCOME TO SETTLERS, THE GOOD EDITION", Windows.scWidth/2 - 150, 10);	
		//draw buttons
		Button.draw(g, this);
	}

	//updates the flow
	@Override
	public void update(GameContainer gc, StateBasedGame s, int delta) throws SlickException {
		//update buttons
		Button.update(this);
	}

	//State ID
	@Override
	public int getID() {
		return States.PreGameState;
	}

}