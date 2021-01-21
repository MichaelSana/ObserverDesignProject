import java.util.ArrayList;

public class Golfer implements Subject {

    ArrayList<Observer> observers;
    private String name;
    Golfer(String name){
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
        

    }

    String getName() {
        return this.name;
    }
    
}
