package org.codeontology.askco.intents;

public abstract class PayIntent extends AbstractIntent {
    @Override
    public void run() {
        super.run();
        pay();
    }

    public abstract void pay();
}
