package ensta.util;

/**
 * Allowed size ships 
 */
public enum ShipLength {
    DESTROYER(2),
    SUBMARINE(3),
    BATTLESHIP(4),
    CARRIER(5);



    /**
     * True size value
     */
    private int value; 
  
     /**
     * Return true size value
     */
    public int getValue() 
    {
        return this.value;
    }

    /**
     * Returns a string representation of the object 
     */
    @Override
    public String toString()
    {
        return Integer.toString(this.value);
    }

    /**
     * Create a new ShipLength with the true value
     * @param value 
     */
    private ShipLength(int value) 
    { 
        this.value = value; 
    } 
}