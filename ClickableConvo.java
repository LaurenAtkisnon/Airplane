
import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.ConversationBubble;

public class ClickableConvo extends ConversationBubble {
	
	private Aircraft _Crafty;
	
	public ClickableConvo(Aircraft crafty, String talk) {
		super(talk);
		_Crafty = crafty;
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		_Crafty.setColor(Color.yellow, Color.black);
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		_Crafty.setColor(Color.blue, Color.DARK_GRAY);
	}	
}

