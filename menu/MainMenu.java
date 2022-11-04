package menu;
import command.smarthomecommand.*;
import command.Command;
import smarthome.SmartHome;
import saving.Saving;

public class MainMenu {


    public static void callMainMenu(){
        Command[] commands = new Command[3];
        MenuUtils.menuLoop(createMainMenuCommandArray(), "Main menu");
    }

    private static Command[] createMainMenuCommandArray() {
        SmartHome[] smartHouses = Saving.loadSaving();

        if (smartHouses == null) {
            return new Command[]{ new AddSmartHomeCommand() };
        } else {
            return new Command[]{ new AddSmartHomeCommand(), new DeleteSmartHomeCommand(), new ChooseSmartHomeCommand() };
        }
    }
}
