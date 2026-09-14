package com.adeliosys.greet;

import static com.adeliosys.greet.ColorUtil.CYAN_BRIGHT;
import static com.adeliosys.greet.ColorUtil.colorize;

/**
 * Simple command-line tool printing a greeting message.
 */
public class GreetCommand {

    public static void main(String[] args) {
        System.out.println(greetMessage(args));
    }

    static String greetMessage(String... args) {
        if (args.length == 0) {
            return "Hello!";
        } else {
            return "Hello " + colorize(CYAN_BRIGHT, String.join(" ", args)) + "!";
        }
    }
}
