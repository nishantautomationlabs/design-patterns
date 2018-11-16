package com.nal.structuralpattern.proxypattern.example3;

/**
 * Created by nishant on 16/11/18.
 */
public class RealCommandExecutor implements ICommandExecutor {

    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("Successfully executed command " + cmd);
    }
}
