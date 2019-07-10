
/**
 * Write a description of the interface here.
 *
 * @author (ruby)
 * @version (a version number or a date)
 */

import java.awt.event.*;

public interface Draggable
{
    public void mousePressed(MouseEvent e);
    public void mouseDragged(MouseEvent e);
    public void move(int distanceInX, int distanceInY);
}
