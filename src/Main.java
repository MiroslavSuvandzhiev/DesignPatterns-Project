import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final String STAND_UP ="Stand up!";
        final String LAY_DOWN ="Lay down!";

        Trainee traineeOne = new Trainee();
        Trainee traineeTwo = new Trainee();
        Trainee traineeThree = new Trainee();

        Instructor instructor = new Instructor();

        instructor.addTrainee(traineeOne);
        instructor.addTrainee(traineeTwo);
        instructor.addTrainee(traineeThree);

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Press S to sit L to lay and 0 to exit");
        while (true){
            String input = reader.readLine();
            if(input.toUpperCase().equals("S")){
                input = STAND_UP;
            }
            if(input.toUpperCase().equals("L")){
                input = LAY_DOWN;
            }
            if(input.toUpperCase().equals("0")){
                break;
            }
            Message message = new Message(input);
            instructor.updateTrainees(message);

            InstructorCommand instructorCommand = new InstructorCommand();
            if(message.getMessageContent().equals(STAND_UP)){
                instructorCommand.setCommand(new StandUpCommand(traineeOne));
                instructorCommand.instructorCommand();

                instructorCommand.setCommand(new StandUpCommand(traineeTwo));
                instructorCommand.instructorCommand();

                instructorCommand.setCommand(new StandUpCommand(traineeThree));
                instructorCommand.instructorCommand();

            }
            if(message.getMessageContent().equals(LAY_DOWN)){
                instructorCommand.setCommand(new LayDownCommand(traineeOne));
                instructorCommand.instructorCommand();

                instructorCommand.setCommand(new LayDownCommand(traineeTwo));
                instructorCommand.instructorCommand();

                instructorCommand.setCommand(new LayDownCommand(traineeThree));
                instructorCommand.instructorCommand();

            }
        }


    }
}
