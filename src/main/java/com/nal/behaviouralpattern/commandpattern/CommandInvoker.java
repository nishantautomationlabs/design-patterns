package com.nal.behaviouralpattern.commandpattern;

/**
 * Created by nishant on 23/01/20.
 */
public class CommandInvoker {

    private Document document;

    public void paste(String text, int position)
    {
        CommandManager commandManager = CommandManager.getInstance();
        Command command = new PasteCommand(document, position, text);
        commandManager.invokeCommand(command);
    }
}
