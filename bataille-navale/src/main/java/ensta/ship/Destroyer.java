package ensta.ship;

import ensta.util.ShipLabel;
import ensta.util.ShipLength;
import ensta.util.ShipName;
import ensta.util.ShipOrientation;

/**
 * Destroyer
 * Ship of size 2
 */
public class Destroyer 
    extends AbstractShip
{

    /**
     * Create a new Destroyer with the Orientation EAST
     */
    public Destroyer () 
    {
        super(ShipLabel.DESTROYER, ShipName.DESTROYER, ShipLength.DESTROYER,ShipOrientation.EAST);
    }
    
    /**
     * Create a new Destroyer with the Orientation provided
     * @param Orientation
     */
    public Destroyer (ShipOrientation Orientation)
    {
        super(ShipLabel.DESTROYER, ShipName.DESTROYER, ShipLength.DESTROYER, Orientation);
    }
}