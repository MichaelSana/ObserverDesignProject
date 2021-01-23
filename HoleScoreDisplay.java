import javax.lang.model.util.ElementScanner6;

public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    private void displayCurrentScore(){
        System.out.println("Current Hole Stats:");
        int aPar = strokes - par;
        if(strokes < par){
            System.out.println(aPar +"under par");
        }
        else if (strokes > par) {
            System.out.println(aPar + "over par");
        }
        else{
            System.out.println("Made par");
        }
    }


    
}
