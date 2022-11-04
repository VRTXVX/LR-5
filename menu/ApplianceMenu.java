package menu;

import command.Command;
import smarthome.SmartHome;
import command.appliancecommand.*;
import static menu.MenuUtils.menuLoop;

import static saving.Saving.loadSaving;

public class ApplianceMenu {
    public static void callApplianceMenu() {
        Command[] commands = createApplianceMenuCommandArray();
        menuLoop(commands, "Appliance menu");
    }

    private static Command[] createApplianceMenuCommandArray() {
        SmartHome[] smartHouses = loadSaving();

        if (smartHouses == null) {
            return new Command[]{ new ChangeCharacteristicApplianceCommand() };
        } else {
            return new Command[]{ new PrintApplianceCommand(),new TotalConsumedEnergyCommand(),new ChangeCharacteristicApplianceCommand()};
        }
    }

}

