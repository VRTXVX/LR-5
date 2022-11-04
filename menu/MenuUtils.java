package menu;
import command.Command;
import java.util.Scanner;

import static color.Color.colorize;

public class MenuUtils {
    public final static Scanner sc = new Scanner(System.in);

    public static void menuLoop(Command[] commands, String menuName) {
        byte choice;

        do {
            showMenu(commands, menuName);

            try{
                System.out.print("Enter your choice >>> ");
                choice = sc.nextByte();
            }
            catch (Exception e){
                sc.nextLine(); // clear buffer
                System.out.println(colorize("[ERROR]","RED") + "Answer must be a number!");
                choice = -1;
             }

            if(choice == 0){
                break;
            } else if (choice > 0 && choice <= commands.length){
                commands[choice - 1].execute(); // because we display a menu that starts numbering from 1
            } else {


                System.out.println(colorize("[ERROR]","RED") + "Wrong choice!");
            }
        }while (true);
    }

    private static void showMenu(Command[] commands, String menuName) {
        System.out.println("\t" + menuName);
        for (int i = 0; i < commands.length; i++) {
            System.out.println("[" + (i + 1)+ "] - " + commands[i]); // i + 1 because we want to start from 1
        }

        if(menuName.equals("Main menu")){
            System.out.println("[0] - Quit");
        } else {
            System.out.println("[0] - Back");
        }
    }
}
