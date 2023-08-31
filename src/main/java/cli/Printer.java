package cli;

public class Printer {

    public static void welcome() {
        System.out.println("Bienvenue dans le projet de CLI !");
    }

    public static void commandList() {
        System.out.println("Liste des commandes :");
    }

    public static void newline() {
        System.out.print("> ");
    }

    public static void help(Command[] commands) {
        Printer.commandList();
        for (Command command : commands) {
            System.out.print(
                    "-" + command.getLetter() +
                            "\t" +
                            "--" + command.getWord());
            if (command.getArguments() != null) {
                for (String argument : command.getArguments()) {
                    System.out.print(" <" + argument + "> ");
                }
            }
            System.out.println("\t" + command.getHelp());
        }
    }

    public static void goodbye() {
        System.out.println("Au revoir !");
    }
}
