import java.awt.Color;

import wheels.users.Rectangle;

public class ControlPanel {
	ColorChangable _object;
	private ClickableEllipse _button1,_button2,_button3,_button4,_button5;
	private Rectangle _rect;
	public ControlPanel(ColorChangable change) {
		_object = change;
		_rect = new Rectangle();
		_rect.setSize(200, 50);
		
		_button1 = new ClickableEllipse(Color.pink,Color.BLUE,_object);
		_button1.setColor(Color.pink);
		_button1.setSize(40, 40);
		
		_button2 = new ClickableEllipse(Color.BLUE,Color.darkGray,_object);
		_button2.setColor(Color.BLUE);
		_button2.setSize(40, 40);
		
		_button3 = new ClickableEllipse(Color.green,Color.YELLOW,_object);
		_button3.setColor(Color.GREEN);
		_button3.setSize(40, 40);
		
		_button4 = new ClickableEllipse(Color.BLACK,Color.CYAN,_object);
		_button4.setColor(Color.BLACK);
		_button4.setSize(40, 40);
		
		setLocation(0,0);

	}
	public void setLocation(int x, int y) {
		_rect.setLocation(x,y);
		_button1.setLocation(x+5,y+5);
		_button2.setLocation(x+55, y+5);
		_button3.setLocation(x+105, y+5);
		_button4.setLocation(x+155, y+5);
	}
	public void setColor(Color color) {
		_rect.setColor(color);
	}
}
