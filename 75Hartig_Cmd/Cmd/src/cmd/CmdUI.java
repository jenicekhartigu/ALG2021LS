package cmd;

import java.util.Scanner;

public class CmdUI {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CommandLine cmd = new CommandLine();
        String command;
        do{
            System.out.print(cmd.getActualDir() + "# ");
            command = sc.nextLine();
            System.out.println(cmd.parseAndExecute(command));
        //} while(!command.equals("exit"));
        } while(!cmd.isEnd());
    }
}