public class Trainee implements Observer{

    public void standUp(){
        System.out.println("I stood up");
    }
    public void layDown(){
        System.out.println("I laid down");

    }
    @Override
    public void update(Message message) {
        System.out.println("Messege trainee: " + message.getMessageContent());
    }
}
