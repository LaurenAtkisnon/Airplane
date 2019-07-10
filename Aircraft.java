/* Lauren Atkinson 
 * Assignment Practice 4
 * Due: March 21, 2019 
 * This class calls calls on the classes Body and Tail, which 
 * then produces the two aircrafts with the color and the location
 */

import java.awt.Color;
import java.awt.event.MouseEvent;

public class Aircraft implements Draggable,ColorChangable {

	private Body _body;
	private Tail _tail;
	private Color _mainColor, _altColor; 
	private int _x, _y;
	private int _clickLocX;
	private int _clickLocY; 

	public Aircraft(Color maincolor, Color altcolor) { 
		_tail = new Tail(maincolor,altcolor,this);
		_body = new Body(maincolor,altcolor);

		_mainColor = maincolor; 
		_altColor = altcolor; 
		setLocation(0,0); // Base position. 
	}
	public void setLocation(int x, int y) {
		System.out.println("X: "+(x-_x) + " Y: " + (y-_y));
		_body.setLocation(_body.getX()+((x-_x)), _body.getY()+((y-_y)));
		_tail.setLocation(x, y-23);
		_x = x; 
		_y = y;
	}
	private int getThatOffsetShawty(int v1, int v2) {
		return v1 - v2;
	}
	@Override
	public void setColor(Color maincolor, Color altColor)
	{
		_mainColor = maincolor; 
		_altColor = altColor;

		_body.setColor(_mainColor,_altColor);
		_tail.setColor(_mainColor, _altColor);
	}
	@Override
	public void mousePressed (MouseEvent e)
	{
		// this.setLocation(getX(), getY());
		_clickLocX = e.getX();
        _clickLocY = e.getY();
    }
	@Override
	public void mouseDragged(MouseEvent e) {
		move(e.getX() - _clickLocX, e.getY() - _clickLocY);
    	_clickLocX = e.getX();
    	_clickLocY = e.getY();
		
	}
	@Override
	public void move(int distanceInX, int distanceInY) {
		setLocation(_x + distanceInX, _y + distanceInY);
		System.out.println("X: " + distanceInX + " Y: " + distanceInY);
		
	}
}
