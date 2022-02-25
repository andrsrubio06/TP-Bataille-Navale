package ensta;

import ensta.board.Board;
import ensta.ship.AbstractShip;
import ensta.ship.BattleShip;
import ensta.ship.Carrier;
import ensta.ship.Destroyer;
import ensta.ship.Submarine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Board nuevo = new Board("La guerre",10);
        Carrier ship = new Carrier();
        nuevo.setHit(false, 0, 0);
        nuevo.setHit(true, 1, 1);
        nuevo.putShip(ship, 1, 1);
        
        nuevo.printGame();
    }
}
