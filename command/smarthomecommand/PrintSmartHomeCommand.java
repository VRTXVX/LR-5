package command.smarthomecommand;
import command.Command;

public class PrintSmartHomeCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public String toString(){
        return "Print information about smart home";
    }
}
