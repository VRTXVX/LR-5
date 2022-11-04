package command.appliancecommand;
import command.Command;

public class PrintApplianceCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public String toString(){
        return "Print appliance";
    }
}
