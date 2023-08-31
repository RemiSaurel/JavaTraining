package proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private final CommandExecutor executor;

    public CommandExecutorProxy(CommandExecutorImpl executor, String user, String pwd) {
        if ("admin".equals(user) && "admin".equals(pwd)) {
            isAdmin = true;
        }
        this.executor = executor;
        System.out.println("CommandExecutorProxy instance created.");
        System.out.println(this.executor);
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
