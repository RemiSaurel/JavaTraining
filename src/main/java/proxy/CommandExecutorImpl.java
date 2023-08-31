package proxy;

public class CommandExecutorImpl implements CommandExecutor {

    public CommandExecutorImpl() {
        System.out.println("CommandExecutorImpl instance created.");
    }

    @Override
    public void runCommand(String cmd) {
        System.out.println("'" + cmd + "' command executed.");
    }
}
