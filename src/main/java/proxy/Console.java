package proxy;

import java.util.Arrays;
import java.util.List;

public class Console {
    private final List<CommandExecutorProxy> executorList;

    public Console() {
        CommandExecutorImpl executorImpl = new CommandExecutorImpl();
        CommandExecutorProxy adminExecutor = new CommandExecutorProxy(executorImpl, "admin", "admin");
        CommandExecutorProxy nonAdminExecutor = new CommandExecutorProxy(executorImpl, "nonAdmin", "nonAdmin");
        this.executorList = Arrays.asList(adminExecutor, nonAdminExecutor);
        List<String> commands = Arrays.asList("ls", "rm", "mkdir", "touch");

        System.out.println(commands);
    }

    public void runCommand(CommandExecutorProxy e, String cmd) throws Exception {
        System.out.println("CommendExecutor isAdmin = " + e.isAdmin());
        System.out.println("Running '" + cmd + "' command.");
        e.runCommand(cmd);
    }

    public static void main(String[] args) {
        try {
            Console console = new Console();
            for (CommandExecutorProxy e : console.executorList) {
                console.runCommand(e, "ls");
                console.runCommand(e, "rm");
                console.runCommand(e, "mkdir");
                console.runCommand(e, "touch");
            }
        } catch (Exception e) {
            System.out.println("Exception message: " + e.getMessage());
        }

    }
}
