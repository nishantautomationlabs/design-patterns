package com.nal.behaviouralpattern.commandpattern;

/**
 * Created by nishant on 23/01/20.
 */
public class PasteCommand implements Command {

    private Document document;
    private int position;
    private String text;

    public PasteCommand(Document document, int position, String text) {
        this.document = document;
        this.position = position;
        this.text = text;
    }

    public void execute() {
        document.insertText(position, text);
    }

    public void unExecute() {
        document.deleteText(position, text);
    }

    public boolean isReversible() {
        return true;
    }


}
