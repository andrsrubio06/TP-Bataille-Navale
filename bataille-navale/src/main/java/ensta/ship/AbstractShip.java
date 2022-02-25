package ensta.ship;

import ensta.util.ShipLabel;
import ensta.util.ShipLength;
import ensta.util.ShipName;
import ensta.util.ShipOrientation;

/**
 * Base class for the different types of ships
 */
public abstract class AbstractShip{
    /**
     * Ship label
     */
    protected ShipLabel type;
    /**
     * Ship name
     */
    protected ShipName name;
    /**
     * Ship size
     */
    protected ShipLength length;
    /**
     * Ship Orientation
     */
    protected ShipOrientation Orientation;


    /**
     * Number of impacts received by the ship
     */
    protected int strikeCount;

    
    public ShipLabel getType() {
        return this.type;
    }

    public ShipName getName() {
        return this.name;
    }

    public ShipLength getLength() {
        return this.length;
    }


    public ShipOrientation getOrientation() {
        return this.Orientation;
    }
    
    /** 
     * Sets the orientation of the ship
     * @return void
     * @param Orientation
     */
    public void setOrientation(ShipOrientation Orientation) 
    {
        this.Orientation = Orientation;
    }

    public void addStrike() {
        this.strikeCount++;
    }

    public boolean isSunk() {
        return this.strikeCount == this.length.getValue();
    }

    /**
     * Create a new ship with the label, name, size, orientation provided
     * 
     * @param type 
     * @param name 
     * @param length
     * @param Orientation
     * 
     */
    public AbstractShip (ShipLabel type, ShipName name, ShipLength length, ShipOrientation Orientation)
    {
        this.type = type;
        this.name = name;
        this.length = length;
        this.Orientation = Orientation;
    }

    
    /**
     * Returns a string representation of the object 
     */
    @Override
    public String toString() 
    {
        return this.getClass().getName() + ":" + "\n" 
            + "\ttype: "  + this.type + '\n' 
            + "\tname: "  + this.name + '\n' 
            + "\tlength: "  + this.length + '\n' 
            + "\tShipOrientation: "  + this.Orientation + '\n' ;
    }
    
}