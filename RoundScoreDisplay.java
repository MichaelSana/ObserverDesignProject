public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    public void update(int strokes, int par) {
        this.strokesTotal = strokes;
        this.parTotal = par;
        displayRoundScore();
    }

    private void displayRoundScore(){
        System.out.println("Round Stats:");
        int aPar = strokesTotal - parTotal;
        if(strokesTotal < parTotal){
            System.out.println(aPar +"under par");
        }
        else if (strokesTotal > parTotal) {
            System.out.println(aPar + "over par");
        }
        else{
            System.out.println("Made par");
        }
    }


}
