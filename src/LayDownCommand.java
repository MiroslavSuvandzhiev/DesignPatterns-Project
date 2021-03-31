public class LayDownCommand implements ICommand{
    Trainee trainee;

    public LayDownCommand(Trainee trainee){
        super();
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        System.out.println("Laying down...");
        trainee.layDown();
    }
}
