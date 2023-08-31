package cli;

public class Command {

    private final char letter;

    private final String word;

    private final String[] arguments;
    private final String help;

    public Command(char letter, String word, String[] arguments, String help) {
        this.letter = letter;
        this.word = word;
        this.arguments = arguments;
        this.help = help;
    }

    public char getLetter() {
        return letter;
    }

    public String getWord() {
        return word;
    }

    public String[] getArguments() {
        return arguments;
    }

    public String getHelp() {
        return help;
    }

    public String toString() {
        String result = "";
        if (letter != '\0') {
            result += "-" + letter;
        }
        if (word != null) {
            if (result.length() > 0) {
                result += " ";
            }
            result += "--" + word;
        }
        if (arguments != null) {
            for (String argument : arguments) {
                result += " <" + argument + ">";
            }
        }
        if (help != null) {
            result += "\n\t" + help;
        }
        return result;
    }
}
