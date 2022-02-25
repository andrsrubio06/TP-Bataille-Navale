package ensta.board;

import ensta.ship.AbstractShip;
import ensta.ship.Carrier;
import ensta.util.ShipLabel;
import ensta.util.ShipLength;
import ensta.util.ShipName;

public class Board implements IBoard{
    /**
     * Default size
     */
    private static final int defaultSize = 10;

    private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //26
    /**
    * Name of the board 
    */
    private String name;
    /**
    * board of ships
    */
    private int[][] boardShips;
    /**
    * board of hits 
    */
    private boolean[][] boardHits;

    /**
     * Constructeur for the class
     * @param name
     * @param size
     */
    public Board(String name, int size) {
        size = (size>letters.length())?letters.length():size;
        this.name = name;
        this.boardShips = new int[size][size];
        this.boardHits = new boolean[size][size];
        
    }
    
    /**
     * Calling the constructeur with a default size of 10
     * @param name
     */
    public Board(String name) {
        this(name, defaultSize);
    }
    /**
     * 
     * @return
     */
    private String controlStringSize(){
        
        String helpString="";

        for (char character : letters.toCharArray()) {
            if(helpString.length()==boardShips[0].length)
             break;
            else helpString += character ;
        }

        return helpString;
    }
    /**
     * 
     * @param title
     * @param boardColumnSize
     */
    private void printTitles(String title, int boardColumnSize){
        System.out.print(" " + title + String.format("%" + (3 * boardColumnSize - title.length() + 2) + "s", ""));
    }
    /**
     * 
     * @param boardColumnSize
     */
    private void printTop(int boardColumnSize){
        System.out.print("   ");
        for ( char character : controlStringSize().toCharArray()) {
            System.out.print(" "+character+" ");
        }
    }
   
    /**
     * 
     */
    public void printGame(){


        System.out.println("\n"+name+"\n");
        
        printTitles("   Navires:", boardShips[0].length);
        printTitles("   Frappes:", boardHits[0].length);
        System.out.println();

        printTop(boardShips[0].length);
        System.out.print(" ");
        printTop(boardHits[0].length);
        System.out.println();
        
        int i=0,j=0, numberOfChar=65;
        for (int k : controlStringSize().toCharArray()) {
            i=k-numberOfChar;
            System.out.print(String.format("%2s ", i));
            for(int l : controlStringSize().toCharArray()){
                j=l-numberOfChar;
                System.out.print(" " + printShips(i ,j)+ " ");
            }
            //printing column numbers
            System.out.print(String.format(" %2s ", i));
            //printing board hits
            for(int l : controlStringSize().toCharArray()){
                j=l-numberOfChar;
                System.out.print(" " + printHits(i,j)  + " ");
            }
            System.out.println();
        }
        
    }

    private String printHits (int i, int j) {
        return this.boardHits[i][j] != false ? "x" : "." ;
    }

    private String printShips (int i, int j) {
        return (this.boardShips[i][j] != 0) ? ShipLabel.values()[this.boardShips[i][j]-1].toString() : ".";
    }



    /**
    * Get attribute name
    */
    public String getName() {
        return this.name;
    }

    /**
    * Set attribute name
    * @param name String
    */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        return boardShips.length;
    }

    @Override
    public boolean hasShip(int x, int y) {
        return boardShips[y][x] != 0 ;
    }
   
    public boolean hasShip() {
        for(int i = 0; i < getSize(); i++) {
            for(int j = 0; j < getSize(); j++) {
                if(hasShip(j, i)) {
                    return true;
                }
            } 
        }
        return false;
    }
    @Override
    public void setHit(boolean hit, int x, int y) {
        boardHits[y][x] = hit;
    }

    @Override
    public Boolean getHit(int x, int y) {
        return boardHits[y][x];
    }



    /**
    * Put the given ship at the given position
    * @param ship {@link AbstractShip} The ship to place on the board
    * @param x {@link Integer}
    * @param y {@link Integer
    * @throws BoardPutShipException
    */
    public void putShip(AbstractShip ship, int x, int y) 
    {
            int size = ship.getLength().getValue();
            int dx = 0, dy = 0;

            switch (ship.getOrientation()) {
                case NORTH:
                    dy = -1;
                    break;
                case SOUTH:
                    dy = 1;
                    break;
                case EAST:
                    dx = 1;
                    break;
                case WEST:
                    dx = -1;
                    break;
            }
            for(int i = 0; i < size; i++) {
                    this.boardShips[(i*dy)+y][(i*dx)+x] = ship.getName().ordinal()+1;
            }

    }
}
