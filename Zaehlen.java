
/**
 * Write a description of class Zaehlen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zaehlen
{
    // instance variables - replace the example below with your own
    private int x;

    public Zaehlen( int max )
    {
        x = max;
    }
    
    public static void main(String[] args)
    {
       Zaehlen myObject = new Zaehlen(10);
       myObject.countdown(); 
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void countdown()
    {
        while(x >= 0){
            System.out.println(x--);
        }
    }
    
    public void iHaveNoIdeas()
    {
        System.out.println ("<|°_°|>");
    }
}
