package cli;

public class CommandFactory {

    public static Command create(char letter, String word, String[] arguments, String help) {
        return new Command(letter, word, arguments, help);
    }

    public static Command create(char letter, String word, String help) {
        return new Command(letter, word, null, help);
    }
}
