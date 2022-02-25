package ensta.ship;

import ensta.util.ShipLabel;
import ensta.util.ShipLength;
import ensta.util.ShipName;
import ensta.util.ShipOrientation;

/**
 * BattleShip
 * Ship of size 4
 */
public class BattleShip 
    extends AbstractShip
{

    /**
     * Create a new BattleShip with the Orientation EAST
     */
    public BattleShip () 
    {
        super(ShipLabel.BATTLESHIP, ShipName.BATTLESHIP, ShipLength.BATTLESHIP,ShipOrientation.EAST);
    }
    
    /**
     * Create a new BattleShip with the Orientation provided
     * @param Orientation
     */
    public BattleShip (ShipOrientation Orientation)
    {
        super(ShipLabel.BATTLESHIP, ShipName.BATTLESHIP, ShipLength.BATTLESHIP, Orientation);
    }
    
}