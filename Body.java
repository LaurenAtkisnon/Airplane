/* Lauren Atkinson 
 * Assignment Practice 2
 * Due: February 12, 2019 
 * Displays the body of the aircrafts including its shaping, coloring, and size, so
 * it can actually look like a body of an aircraft   
 */
import java.awt.Color;
import java.awt.event.MouseEvent;
import wheels.users.*;

public class Body implements Draggable
{
//		Declare global variables
	private DraggableEllipse _aircraft;
	private Ellipse _window1,_window2,_window3,_cockpit;
	private RoundedRectangle _wing;
	private Rectangle _tail;
	private int _x, _y, _clickLocX, _clickLocY; 
	private Color _maincolor;
	private Color _altcolor; 
	
	public Body(Color maincolor, Color altcolor)
	{
//		Here we need to initialize all the different components of the body of the aircraft. 
		_maincolor = maincolor; 
		_altcolor = altcolor; 
		
//		Set up body
		// _aircraft = new DraggableEllipse(_maincolor, _x, _y, this, drag)
		_aircraft = new DraggableEllipse(_maincolor, this);
		_aircraft.setSize(150, 30);
//		Set up wings
		_wing = new DraggableRoundedRectangle(_maincolor,this); 
		_wing.setSize(45, 85);
		_wing.setRotation(30);

//		Set up windows
		_window1 = new DraggableEllipse(_altcolor,this);
		_window2 = new DraggableEllipse(_altcolor,this);
		_window3 = new DraggableEllipse(_altcolor,this);
		
		_window1.setSize(10, 10);
		_window2.setSize(10, 10);
		_window3.setSize(10, 10);
		
//		Front
		_cockpit = new Ellipse(_maincolor);
		_cockpit.setSize(80, 30);
		
// 		Tail
//		_tail = new Rectangle(maincolor);
//		_tail.setSize(30, 50);
//		_tail.setRotation(-45);
		
	}
	public void setLocation(int x, int y) {
		_x = x;
		_y = y;
		
//		We change where the components are drawn respective to the given coordinates. 
		_aircraft.setLocation(x, y);
		_wing.setLocation(x+60, y+5);
		
		
		_window1.setLocation(x+30, y+10);
		_window2.setLocation(x+60,y+10);
		_window3.setLocation(x+90,y+10);
		
		_cockpit.setLocation(x+110, y);
			}
	public int getX()
	{
		return _x; 
	}
	public int getY()
	{
		return _y;
	}
	public void setColor(Color maincolor, Color altcolor) 
	{
		_maincolor = maincolor;
		_altcolor = altcolor; 
		
		_aircraft.setColor(maincolor);
		
		_wing.setColor(maincolor);
		
		_window1.setColor(altcolor);
		_window2.setColor(altcolor);
		_window3.setColor(altcolor);
		
		_cockpit.setColor(maincolor);
		
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

