package ensta.ship;

import ensta.util.ShipLabel;
import ensta.util.ShipLength;
import ensta.util.ShipName;
import ensta.util.ShipOrientation;

/**
 * Submarine
 * Ship of size 2
 */
public class Submarine 
    extends AbstractShip
{

    /**
     * Create a new Submarine with the Orientation EAST
     */
    public Submarine () 
    {
        super(ShipLabel.SUBMARINE, ShipName.SUBMARINE, ShipLength.SUBMARINE,ShipOrientation.EAST);
    }
    
    /**
     * Create a new Submarine with the Orientation provided
     * @param Orientation
     */
    public Submarine (ShipOrientation Orientation)
    {
        super(ShipLabel.SUBMARINE, ShipName.SUBMARINE, ShipLength.SUBMARINE, Orientation);
    }
}