package ensta.util;

/**
 * Label of ships allowed
 */
public enum ShipLabel {
    DESTROYER('D'),
    SUBMARINE('S'),
    BATTLESHIP('B'),
    CARRIER('C');



    /**
     * True label value
     */
    private char value; 
  
    /**
     * Returns the true label value
     */
    public char getValue() 
    {
        return this.value;
    }

    /**
     * Returns a string representation of the object 
     */
    @Override
    public String toString()
    {
        return Character.toString(this.value);
    }

    /**
     * Create a new ShipLabel with the true value
     * @param value
     */
    private ShipLabel(char value) 
    { 
        this.value = value; 
    } 
}