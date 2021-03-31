import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void addTrainee(Observer o);
    void removeTrainee(Observer o);
    void updateTrainees(Message message);

}
