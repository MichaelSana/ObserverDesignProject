import java.util.ArrayList;

public class Golfer implements Subject {

    ArrayList<Observer> observers;
    private String name;
    
    public Golfer(String name){
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(int strokes, int par) {
        for(Observer observer : observers){
            
        }

    }

    public String getName() {
        return this.name;
    }
    
}
