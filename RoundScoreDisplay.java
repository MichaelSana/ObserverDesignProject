/**
 * Gives the score for the total round
 * @author Michael Sana
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;
    /**
     * registers the Golfer to the observers
     * @param golfer
     */
    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }
    /**
     * updates the observer
     * @param strokes
     * @param par
     */
    @Override
    public void update(int strokes, int par) {
        displayRoundScore();
        System.out.println("Par: " + par);
        System.out.println("Strokes: " + strokes);
        this.strokesTotal = strokes;
        this.parTotal = par;
    }
    /**
     * Send the current score to the update method
     */
    private void displayRoundScore(){
        System.out.println("Round Stats:");
        int aPar = strokesTotal - parTotal;
        if(strokesTotal < parTotal){
            System.out.println(aPar +" under par");
        }
        else if (strokesTotal > parTotal) {
            System.out.println(aPar + " over par");
        }
        else{
            System.out.println("Made par");
        }
    }


}
