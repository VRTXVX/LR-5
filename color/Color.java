package color;

import java.lang.reflect.Array;

public class Color {
    public final static String BLACK = "\u001B[30m";
    public final static String RED = "\u001B[31m";
    public final static String GREEN = "\u001B[32m";
    public final static String YELLOW = "\u001B[33m";
    public final static String BLUE = "\u001B[34m";
    public final static String PURPLE = "\u001B[35m";
    public final static String CYAN = "\u001B[36m";
    public final static String RESET_COLOR = "\u001B[0m";

    public static String colorize(String string, String color) {
        String colors[] = {BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN};
        for (String c : colors) {
            if (c.equals(color)) {
                return color + string + RESET_COLOR;
            }
        }
        return "Color not found";
    }
}
