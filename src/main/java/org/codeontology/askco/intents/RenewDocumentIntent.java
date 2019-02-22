package org.codeontology.askco.intents;

public abstract class RenewDocumentIntent extends AbstractIntent {

    @Override
    public void run() {
        super.run();
        renew();
    }

    public abstract void renew();
}
