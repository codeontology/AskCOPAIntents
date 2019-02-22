package org.codeontology.askco.intents;

/**
 * @label_it Informazioni cambio residenza
 *
 * Questa classe rappresenta l'intent che corrisponde alla richiesta di informazioni relative al cambio di residenza
 */
public class AddressChangeInfoIntent extends InfoIntent {

    /**
     * @label_it richiedi informazioni
     *
     * Richiede informazioni su come effettuare il cambio di residenza
     */
    @Override
    public void askInfo() {
        System.out.println("Asking info for address change");
    }
}
