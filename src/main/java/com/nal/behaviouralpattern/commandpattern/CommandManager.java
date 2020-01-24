package com.nal.behaviouralpattern.commandpattern;

/**
 * Created by nishant on 23/01/20.
 */
public class CommandManager {

    private static CommandManager commandManager;

    private CommandManager() {
    }

    public static CommandManager getInstance()
    {
        if(commandManager == null)
            commandManager = new CommandManager();
        return commandManager;
    }

    public void invokeCommand(Command command) {
        command.execute();
        System.out.println("Command Invoked");
    }
}
