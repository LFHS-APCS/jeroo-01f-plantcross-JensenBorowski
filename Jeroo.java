/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    
    public void plantCross() {
    intro();
    firstL();
    secondL();
    thirdL();
    fourthL();
    }
    // Put any helpermethods here
  public void intro() {
  hop();
  hop();
  hop();
  hop();
  hop();
  hop();
  turn(RIGHT);
  hop();
  hop();
  hop();
}
public void firstL() {
  plant();
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(RIGHT);
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(LEFT);
  hop();
  plant();
}
public void secondL() {
  hop();
  plant();
  turn(LEFT);
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(RIGHT);
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(LEFT);
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(LEFT);
}
public void thirdL() {
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(RIGHT);
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(LEFT);
  hop();
  plant();
  hop();
  plant();
  turn(LEFT);
}
public void fourthL() {
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(RIGHT);
  hop();
  plant();
  hop();
  plant();
  hop();
  plant();
  turn(LEFT);
  hop();
  plant();
}
    
    
    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
