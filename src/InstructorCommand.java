public class InstructorCommand {
    private ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void instructorCommand(){
        command.execute();
    }
}
