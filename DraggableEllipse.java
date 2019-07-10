import java.awt.Color;
import java.awt.event.MouseEvent;

import wheels.users.Ellipse;
import wheels.users.Rectangle;

/**
 * Write a description of the class here.
 *
 * @author (ruby)
 * @version (a version number or a date)
 */

public class DraggableEllipse extends Ellipse implements Draggable {
	private Body _body;
	
	public DraggableEllipse(Body body) {
		_body = body;
	}
	public DraggableEllipse (Color main, Body body) {
		super(main);
		_body = body;
	}
	@Override
	public void move(int dx, int dy)
    {

    }

    public void mouseDragged(MouseEvent e)
    {
        _body.mouseDragged(e);
    }

    public void mousePressed(MouseEvent e)
    {
        _body.mousePressed(e);
    }
}

/*import wheels.users.*;
import java.awt.event.*;

public class DraggableEllipse extends Ellipse implements Draggable
{
    private Draggable co; 
    	
    public DraggableEllipse (java.awt.Color mainColor, Draggable drag)
    {
        super(mainColor);
        co = drag; 
    }

    public void move(int distanceInX, int distanceInY)
    {

    }

    public void mouseDragged(MouseEvent e)
    {
        co.mouseDragged(e);
    }

    public void mousePressed(MouseEvent e)
    {
        co.mousePressed(e);
    }
}

/*public class DraggableEllipse extends Rectangle implements Draggable {

	private Body _body;
	private Draggable _drag;
	// private Draggable co; 
	

	public DraggableEllipse (java.awt.Color mainColor, int _x, int _y, Body body, Draggable drag)
	{ 
		super(mainColor);
	//	co = drag;
		_body = body;
		_drag = drag;
	}

    public void mouseDragged(MouseEvent e)
    {
        _drag.mouseDragged(e);
    }


	@Override
	public void mousePressed(MouseEvent e) {
		_body.setLocation(_body.getX() + 20, _body.getY());
		
	}

	@Override
	public void move(int distanceInX, int distanceInY) {
		// TODO Auto-generated method stub
		
	}
	
}
*/
