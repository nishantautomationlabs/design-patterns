package com.nal.behaviouralpattern.commandpattern;

/**
 * Created by nishant on 23/01/20.
 */
public interface Command {

    void execute();

    void unExecute();

    boolean isReversible();

}
