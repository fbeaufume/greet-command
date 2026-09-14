package com.adeliosys.greet;

/**
 * Utility class for ANSI color codes.
 * Comes with a convenience main method that prints all available colors.
 * Also see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code#Colors">ANSI Colors</a>.
 */
public class ColorUtil {

    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular colors
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String MAGENTA = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";

    // Bold colors
    public static final String BLACK_BOLD = "\033[1;30m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String MAGENTA_BOLD = "\033[1;35m";
    public static final String CYAN_BOLD = "\033[1;36m";
    public static final String WHITE_BOLD = "\033[1;37m";

    // Underline colors
    public static final String BLACK_UNDERLINED = "\033[4;30m";
    public static final String RED_UNDERLINED = "\033[4;31m";
    public static final String GREEN_UNDERLINED = "\033[4;32m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String BLUE_UNDERLINED = "\033[4;34m";
    public static final String MAGENTA_UNDERLINED = "\033[4;35m";
    public static final String CYAN_UNDERLINED = "\033[4;36m";
    public static final String WHITE_UNDERLINED = "\033[4;37m";

    // Bright colors
    public static final String BLACK_BRIGHT = "\033[0;90m";
    public static final String RED_BRIGHT = "\033[0;91m";
    public static final String GREEN_BRIGHT = "\033[0;92m";
    public static final String YELLOW_BRIGHT = "\033[0;93m";
    public static final String BLUE_BRIGHT = "\033[0;94m";
    public static final String MAGENTA_BRIGHT = "\033[0;95m";
    public static final String CYAN_BRIGHT = "\033[0;96m";
    public static final String WHITE_BRIGHT = "\033[0;97m";

    // Bold bright colors
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    public static final String MAGENTA_BOLD_BRIGHT = "\033[1;95m";
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m";

    // Background colors
    public static final String BLACK_BACKGROUND = "\033[40m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String YELLOW_BACKGROUND = "\033[43m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String MAGENTA_BACKGROUND = "\033[45m";
    public static final String CYAN_BACKGROUND = "\033[46m";
    public static final String WHITE_BACKGROUND = "\033[47m";

    // Bright background colors
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";
    public static final String MAGENTA_BACKGROUND_BRIGHT = "\033[0;105m";
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";

    public static void main(String[] args) {
        printAllColors();
    }

    /**
     * Convenience method that prints all colors.
     */
    public static void printAllColors() {
        System.out.println("--- Regular colors ---");
        print(BLACK, "BLACK");
        print(RED, "RED");
        print(GREEN, "GREEN");
        print(YELLOW, "YELLOW");
        print(BLUE, "BLUE");
        print(MAGENTA, "MAGENTA");
        print(CYAN, "CYAN");
        print(WHITE, "WHITE");

        System.out.println("--- Bold colors ---");
        print(BLACK_BOLD, "BLACK_BOLD");
        print(RED_BOLD, "RED_BOLD");
        print(GREEN_BOLD, "GREEN_BOLD");
        print(YELLOW_BOLD, "YELLOW_BOLD");
        print(BLUE_BOLD, "BLUE_BOLD");
        print(MAGENTA_BOLD, "MAGENTA_BOLD");
        print(CYAN_BOLD, "CYAN_BOLD");
        print(WHITE_BOLD, "WHITE_BOLD");

        System.out.println("--- Underlined colors ---");
        print(BLACK_UNDERLINED, "BLACK_UNDERLINED");
        print(RED_UNDERLINED, "RED_UNDERLINED");
        print(GREEN_UNDERLINED, "GREEN_UNDERLINED");
        print(YELLOW_UNDERLINED, "YELLOW_UNDERLINED");
        print(BLUE_UNDERLINED, "BLUE_UNDERLINED");
        print(MAGENTA_UNDERLINED, "MAGENTA_UNDERLINED");
        print(CYAN_UNDERLINED, "CYAN_UNDERLINED");
        print(WHITE_UNDERLINED, "WHITE_UNDERLINED");

        System.out.println("--- Bright colors ---");
        print(BLACK_BRIGHT, "BLACK_BRIGHT");
        print(RED_BRIGHT, "RED_BRIGHT");
        print(GREEN_BRIGHT, "GREEN_BRIGHT");
        print(YELLOW_BRIGHT, "YELLOW_BRIGHT");
        print(BLUE_BRIGHT, "BLUE_BRIGHT");
        print(MAGENTA_BRIGHT, "MAGENTA_BRIGHT");
        print(CYAN_BRIGHT, "CYAN_BRIGHT");
        print(WHITE_BRIGHT, "WHITE_BRIGHT");

        System.out.println("--- Bold bright colors ---");
        print(BLACK_BOLD_BRIGHT, "BLACK_BOLD_BRIGHT");
        print(RED_BOLD_BRIGHT, "RED_BOLD_BRIGHT");
        print(GREEN_BOLD_BRIGHT, "GREEN_BOLD_BRIGHT");
        print(YELLOW_BOLD_BRIGHT, "YELLOW_BOLD_BRIGHT");
        print(BLUE_BOLD_BRIGHT, "BLUE_BOLD_BRIGHT");
        print(MAGENTA_BOLD_BRIGHT, "MAGENTA_BOLD_BRIGHT");
        print(CYAN_BOLD_BRIGHT, "CYAN_BOLD_BRIGHT");
        print(WHITE_BOLD_BRIGHT, "WHITE_BOLD_BRIGHT");

        System.out.println("--- Background colors ---");
        print(BLACK_BACKGROUND, "BLACK_BACKGROUND");
        print(RED_BACKGROUND, "RED_BACKGROUND");
        print(GREEN_BACKGROUND, "GREEN_BACKGROUND");
        print(YELLOW_BACKGROUND, "YELLOW_BACKGROUND");
        print(BLUE_BACKGROUND, "BLUE_BACKGROUND");
        print(MAGENTA_BACKGROUND, "MAGENTA_BACKGROUND");
        print(CYAN_BACKGROUND, "CYAN_BACKGROUND");
        print(WHITE_BACKGROUND, "WHITE_BACKGROUND");

        System.out.println("--- Bright background colors ---");
        print(BLACK_BACKGROUND_BRIGHT, "BLACK_BACKGROUND_BRIGHT");
        print(RED_BACKGROUND_BRIGHT, "RED_BACKGROUND_BRIGHT");
        print(GREEN_BACKGROUND_BRIGHT, "GREEN_BACKGROUND_BRIGHT");
        print(YELLOW_BACKGROUND_BRIGHT, "YELLOW_BACKGROUND_BRIGHT");
        print(BLUE_BACKGROUND_BRIGHT, "BLUE_BACKGROUND_BRIGHT");
        print(MAGENTA_BACKGROUND_BRIGHT, "MAGENTA_BACKGROUND_BRIGHT");
        print(CYAN_BACKGROUND_BRIGHT, "CYAN_BACKGROUND_BRIGHT");
        print(WHITE_BACKGROUND_BRIGHT, "WHITE_BACKGROUND_BRIGHT");
    }

    private static void print(String code, String text) {
        System.out.println(colorize(code, text));
    }

    public static String colorize(String color, String text) {
        return color + text + RESET;
    }
}
