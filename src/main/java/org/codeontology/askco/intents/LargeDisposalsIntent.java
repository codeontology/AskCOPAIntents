package org.codeontology.askco.intents;


/**
 * @label_it Smaltimento Rifiuti Ingombranti
 *
 * Questa classe rappresenta l'intent che corrisponde all'invio di una richiesta di smaltimento di rifiuti ingombranti
 */
public class LargeDisposalsIntent extends AbstractIntent {

    @Override
    public void run() {
        super.run();
        sendRequest();
    }

    /**
     * @label_it Invia righiesta
     *
     * Invia la richiesta di smaltimento di rifiuti ingombranti
     */
    public void sendRequest() {
        System.out.println("Sending request for large waste disposals");
    }
}
