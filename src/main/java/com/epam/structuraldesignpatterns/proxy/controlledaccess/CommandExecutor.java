package com.epam.structuraldesignpatterns.proxy.controlledaccess;

public interface CommandExecutor {

    void runCommand(String cmd) throws Exception;
}

class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) {
        System.out.println("Komut çalıştırıldı: " + cmd);
    }
}

// Proxy
class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("admin_user".equals(user) && "1234".equals(pwd)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("'rm' only admin can use rm");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}