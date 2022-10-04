package main.java.com.lj;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        System.out.println("Enter command");
        Scanner in = new Scanner(System.in);

        String command = "";

        ArrayList<String> commandsHistory = new ArrayList<>();
        while (!command.equals("exit")){
            command = in.nextLine();
            switch (command){
                case "add":
                    System.out.println("command add");
                    commandsHistory.add(command);
                    break;
                case "remove":
                    System.out.println("command remove");
                    commandsHistory.remove(command);
                    break;
                default:
                    System.out.println("command not found");
            }
        }

        for (String commandStr: commandsHistory) {
            System.out.println(commandStr);
        }


    }
}
