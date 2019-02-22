package org.codeontology.askco.intents;

/**
 * @label_it Rinnovo Carta Identita'
 *
 * Intent per il rinnovo della carta di identita'
 */
public class RenewIdentityCardIntent extends RenewDocumentIntent {

    /**
     * @label_it rinnova
     *
     * Esegue il rinnovo carta di identita'
     */
    public void renew() {
        System.out.println("Renewing identity card");
    }
}
