package com.nal.structuralpattern.proxypattern.example3;

/**
 * Created by nishant on 16/11/18.
 */
public class ProxyCommandExecutor implements ICommandExecutor {

    private ICommandExecutor commandExecutor = new RealCommandExecutor();
    private String userName;
    private String password;

    public ProxyCommandExecutor(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    private boolean isAdminUser(String userName, String password) {
        if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
            return true;
        return false;
    }

    public void runCommand(String cmd) throws Exception {
        if(isAdminUser(userName, password))
            commandExecutor.runCommand(cmd);
        else
        {
            if(isCommandNotAllowed(cmd))
                throw new Exception("command not allowed");
            else
                commandExecutor.runCommand(cmd);
        }

    }

    private boolean isCommandNotAllowed(String cmd) {
        if(cmd.startsWith("rm"))
            return true;
        return false;
    }
}
