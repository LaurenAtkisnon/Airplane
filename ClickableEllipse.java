import java.awt.Color; 
import java.awt.event.MouseEvent;
import wheels.users.Ellipse;

public class ClickableEllipse extends Ellipse 
{
	private Color _mainColor, _altColor;
	private ColorChangable _object;

public ClickableEllipse(Color mainColor, Color altColor, ColorChangable change)
	{
		setColor(mainColor);
		_mainColor = mainColor;
		_altColor = altColor;
		_object = change;
	}


@Override
public void mouseClicked(MouseEvent e) {
	_object.setColor(_mainColor, _altColor);
}
}