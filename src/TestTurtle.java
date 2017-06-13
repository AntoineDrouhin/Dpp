/**
 *StartupTest01
 * The purpose of this program is to test such items as
 * the classpath, the media path, etc.
 *
 * 10/10/08 Compiles and runs OK on my laptop computer.
 *
 * Displays a turtle in a world and moves it forward by
 * 100 pixels.
 * 
 * Note that the program does not terminate when you
 * click the X button in the frame.
 *
 * Based on a program by Barbara Ericson that is:
 * Copyright Georgia Institute of Technology 2004-2005
 */
public class TestTurtle {
    
  public static void main(String[] args){
    World mars = new World(200,300);
    Turtle joe = new Turtle(mars);
    joe.forward();
  }//end main

}//end class