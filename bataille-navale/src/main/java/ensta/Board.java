package ensta;

public class Board {
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
    private Boolean[][] boardHits;

    /**
     * Constructeur for the class
     * @param name
     * @param size
     */
    public Board(String name, int size) {
        size = (size>letters.length())?letters.length():size;
        this.name = name;
        this.boardShips = new int[size][size];
        this.boardHits = new Boolean[size][size];
        
    }
    
    /**
     * Calling the constructeur with a default size of 10
     * @param name
     */
    public Board(String name) {
        this(name, defaultSize);
    }

    private String controlStringSize(){
        
        String helpString="";

        for (char character : letters.toCharArray()) {
            if(helpString.length()==boardShips[0].length)
             break;
            else helpString += character ;
        }

        return helpString;
    }

    private void printTitles(String title, int boardColumnSize){
        System.out.print(" " + title + String.format("%" + (3 * boardColumnSize - title.length() + 2) + "s", ""));
    }

    private void printTop(int boardColumnSize){
        System.out.print("   ");
        for ( char character : controlStringSize().toCharArray()) {
            System.out.print(" "+character+" ");
        }
    }

    public void printGame(){


        System.out.println("\n"+name+"\n");
        
        printTitles("   Navires:", boardShips[0].length);
        printTitles("   Frappes:", boardHits[0].length);
        System.out.println();

        printTop(boardShips[0].length);
        System.out.print(" ");
        printTop(boardHits[0].length);
        System.out.println();
        
        for (int i : controlStringSize().toCharArray()) {
            System.out.print(String.format("%2s ", i - 64));
            for(int j : controlStringSize().toCharArray()){
                System.out.print(" . ");
            }
            //printing column numbers
            System.out.print(String.format(" %2s ", i - 64));
            //printing board hits
            for(int j : controlStringSize().toCharArray()){
                System.out.print(" . ");
            }
            System.out.println();
        }
        
       
    }

}
