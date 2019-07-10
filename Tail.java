/* Lauren Atkinson 
 * Assignment Practice 2
 * Due: February 12, 2019 
 * Displays the tail of the aircrafts including its coloring, size, and the appropriate rotation so
 * it can actually look like a wing   
 */
import java.awt.Color;
import wheels.users.*;

public class Tail implements ColorChangable{
	private DraggableRoundedRectangle _tail;
	private Draggable _drag;
	public Tail(Color maincolor, Color altcolor, Draggable parentDrag) {
		_drag = parentDrag;
		_tail =  new DraggableRoundedRectangle(maincolor, _drag);
		_tail.setColor(maincolor);
		_tail.setSize(30, 50);
		_tail.setRotation(-45);
	}
	public void setLocation(int x, int y) {
		_tail.setLocation(x, y);
	}
	@Override
	public void setColor(Color mainColor, Color altColor) {
		_tail.setColor(mainColor);
		
	}

}
