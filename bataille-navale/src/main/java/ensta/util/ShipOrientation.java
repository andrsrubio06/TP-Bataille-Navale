package ensta.util;

/**
 * allowed ships orientation 
 */
public enum ShipOrientation {
    NORTH("n"),
    SOUTH("s"),
    EAST("e"),
    WEST("w");

    /**
     * True label value
     */
    private String value; 
  
    /**
     * Returns the true label value
     */
    public String getValue() 
    {
        return this.value;
    }

    /**
     * Returns the label value from String value
     * @param value String
     * @return Orientation
     */
    public static ShipOrientation fromString(String value) {
        for (ShipOrientation o : ShipOrientation.values()) {
            if (o.toString().equals(value)) {
                return o;
            }
        }
        return null;
    }
    
    /**
     * Returns a string representation of the object 
     */
    @Override
    public String toString()
    {
        return this.value;
    }

    /**
     * Create a new ShipOrientation with the true value
     * @param value {@link Character}
     */
    private ShipOrientation(String value) 
    { 
        this.value = value; 
    } 
}