package ensta.ship;

import ensta.util.*;

/**
 * ShipState
 */
public class ShipState {

    /**
     *
     */
    private AbstractShip ship;
    private boolean struck;

    public ShipState (AbstractShip ship) {
        this.ship = ship;
    }

    public void addStrike() 
    {
        if (!this.struck) {
            this.ship.addStrike();
        }
        this.struck = true;
    }
    
    public boolean isStruck() 
    {
        return this.struck;
    }

    @Override
    public  String toString()
    {
        return 
            ColorUtil.colorize(
                this.ship.getType().toString(), 
                ((this.struck) ? ColorUtil.Color.RED: ColorUtil.Color.WHITE)
            );
    }

    public boolean isSunk()
    {
        return this.ship.isSunk();
    }

    public AbstractShip getShip()
    {
        return this.ship;
    }

}