package ensta.ship;

import ensta.util.ShipLabel;
import ensta.util.ShipLength;
import ensta.util.ShipName;
import ensta.util.ShipOrientation;

/**
 * Carrier
 * Ship of size 5
 */
public class Carrier 
    extends AbstractShip
{

    /**
     * Create a new Carrier with the Orientation EAST
     */
    public Carrier () 
    {
        super(ShipLabel.CARRIER, ShipName.CARRIER, ShipLength.CARRIER,ShipOrientation.EAST);
    }
    
    /**
     * Create a new Carrier with the Orientation provided
     * @param Orientation
     */
    public Carrier (ShipOrientation Orientation)
    {
        super(ShipLabel.CARRIER, ShipName.CARRIER, ShipLength.CARRIER, Orientation);
    }
    
}