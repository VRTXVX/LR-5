package command.appliancecommand;

import command.Command;

public class AddApplianceCommand implements Command {
   @Override
   public void execute() {
   }

   @Override
    public String toString(){
         return "Add appliance";
    }
}