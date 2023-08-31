package cli;

import java.util.Scanner;

public class Main {

    public static final Command[] COMMANDS = {
            CommandFactory.create('h', "help", "Afficher l'aide"),
            CommandFactory.create('q', "quit", "Quitter l'application"),
            CommandFactory.create('c', "create", new String[]{"name"}, "Créer un nouveau projet"),
    };

    public static void main(String[] args) {
        Printer.welcome();
        Printer.help(COMMANDS);
        Scanner scanner = new Scanner(System.in);
        Parser parser = new Parser();
        while (true) {
            Printer.newline();
            String line = scanner.nextLine();
            parser.parse(line);
        }
    }
}
