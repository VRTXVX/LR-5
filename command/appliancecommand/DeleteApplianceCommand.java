package command.appliancecommand;

import command.Command;

public class DeleteApplianceCommand implements Command {
    @Override
    public void execute() {
    }

    @Override
    public String toString(){
        return "Delete appliance";
    }

}