package org.codeontology.askco.intents;


public abstract class AbstractIntent implements Intent {
    public void run() {
        if (Settings.DEBUG) {
            printDebugInfo();
        }
    }

    protected void printDebugInfo() {
        String className = this.getClass().getSimpleName();
        System.out.println("[" + className + "]");
    }
}
