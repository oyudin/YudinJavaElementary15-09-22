package org.example.test;

public abstract class CommandsMessages implements Commands {

    private static String greeting = "Registration user on fly started:";
    private static String info = """
                Type 'info' to get info about registrations or 'exit' to close
                or type any to register another client""";

    public static void greetingMessage(){
        System.out.println(greeting);

    };public static void showInfoMessage(){
        System.out.println(info);
    };

}
