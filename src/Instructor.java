import java.util.ArrayList;
import java.util.List;

public class Instructor implements Subject {
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void addTrainee(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeTrainee(Observer o) {
        observers.remove(o);
    }

    @Override
    public void updateTrainees(Message message) {
        for(Observer o : observers){
            o.update(message);
        }
    }
}
