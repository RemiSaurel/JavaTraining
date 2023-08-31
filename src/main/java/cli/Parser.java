package cli;

public class Parser {

    public void parse(String line) {
        String[] words = line.split(" ");
        if (words.length == 0) {
            return;
        }
        String command = words[0];
        String[] arguments = new String[words.length - 1];
        System.arraycopy(words, 1, arguments, 0, words.length - 1);
        switch (command) {
            case "-h":
                Printer.help(Main.COMMANDS);
                break;
            case "-q":
                Printer.goodbye();
                System.exit(0);
                break;
            case "-c":
                if (arguments.length == 0) {
                    System.out.println("Le nom du projet est obligatoire");
                } else {
                    System.out.println("Création du projet " + arguments[0]);
                }
                break;
            default:
                System.out.println("Commande inconnue");
                break;
        }
    }
}
