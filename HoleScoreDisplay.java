/**
 * Displays the score for the whole the Golfer is on
 * @author Michael Sana
 */

public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;
    /**
     * Registers the golfer to this display
     * @param golfer
     */

    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }
    /**
     * updates the observer on the Golfers score
     * @param strokes
     * @param par
     */

    @Override
    public void update(int strokes, int par) {
        System.out.println("Par: " + par);
        System.out.println("Strokes: " + strokes);
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * Sends the current score to the update method
     * @return the current score
     */

    private void displayCurrentScore(){
        System.out.println("Current Hole Stats:");
        int aPar = strokes - par;
        if(strokes < par){
            System.out.println(aPar +" under par");
        }
        else if (strokes > par) {
            System.out.println(aPar + " over par");
        }
        else{
            System.out.println("Made par");
        }
    }


    
}
