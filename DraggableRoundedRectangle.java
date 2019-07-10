import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.RoundedRectangle;

public class DraggableRoundedRectangle extends RoundedRectangle implements Draggable{
	
	private Draggable _co; 
	
	public DraggableRoundedRectangle (Color main, Draggable co)
	{ 
		super(main);
		this._co = co;
	}
	public void mousePressed(MouseEvent e)
    {
        _co.mousePressed(e);
    }
	public void mouseDragged(MouseEvent e)
    {
        _co.mouseDragged(e);
    }
	@Override
    public void move(int dx, int dy)
    {

    }

}
