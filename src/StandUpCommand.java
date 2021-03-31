public class StandUpCommand implements ICommand{
    Trainee trainee;

    public StandUpCommand(Trainee trainee){
        super();
        this.trainee = trainee;
    }

    @Override
    public void execute() {
        System.out.println("Standing up...");
        trainee.standUp();
    }
}
