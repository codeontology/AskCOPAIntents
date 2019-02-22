package org.codeontology.askco.intents;

public abstract class BookIntent extends AbstractIntent {
    @Override
    public void run() {
        super.run();
        book();
    }

    public abstract  void book();
}
