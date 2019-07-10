/* Lauren Atkinson 
 * Assignment Practice 2
 * Due: February 12, 2019 
 * Similiar to MyApp, used in other projects. Displays two aircrafts with that have different colors, location and untimely 
 * the two aircrafts will have a conversation  
 */
import java.awt.Color;
//import wheels.users.ConversationBubble;
// import wheels.users.Ellipse; 
import wheels.users.*;


public class StartAirplane extends Frame {
	private Aircraft plane1,plane2;
	private ClickableConvo _bubble1, _bubble2; 
	private ControlPanel _panel1,_panel2;
	
	public StartAirplane() {
		plane1 = new Aircraft(Color.GRAY,Color.gray);
		plane1.setLocation(300, 100);
		_panel1 = new ControlPanel(plane1);
		_panel1.setColor(Color.GRAY);
	
		plane2 = new Aircraft(Color.LIGHT_GRAY,Color.gray);
		plane2.setLocation(200, 300);
		_panel2 = new ControlPanel(plane2);
		_panel2.setLocation(0, 80);
		_panel2.setColor(Color.LIGHT_GRAY);
		
	}
	
	public static void main(String[] args)
	{
		StartAirplane start = new StartAirplane();
	}

}