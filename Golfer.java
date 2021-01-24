import java.util.ArrayList;
/**
 * A Singular Golfer
 * @author Michael Sana
 */

public class Golfer implements Subject {

    ArrayList<Observer> observers;
    private String name;
    /**
     * Gives the Golfers name and initalized the obersver array list
     * @return The players name
     * @param String name
     */

    public Golfer(String name){
        observers = new ArrayList<Observer>();
        this.name = name;
    }
    /**
     * Registers the obersver
     * @param the observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * De-Registers the observer
     * @param the observer
     */

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * Notifies the observers of an update to the score
     * @return an update of the strokes and par to the observer
     * @param int strokes, int par
     */

    @Override
    public void notifyObserver(int strokes, int par) {
        for(Observer observer : observers){
            observer.update(strokes, par);
        }

    }
    /**
     * Shows the observers the score
     * @param strokes
     * @param par
     */

    public void enterScore(int strokes,int par){
        notifyObserver(strokes, par);
    }

    public String getName() {
        return this.name;
    }
    
}
