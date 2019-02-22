package org.codeontology.askco.intents;

/**
 * @label_it Rinnovo patente
 *
 * Intent per il rinnovo della patente
 */
public class RenewDrivingLicenseIntent extends RenewDocumentIntent {

    /**
     * @label_it rinnova
     *
     * Esegue il rinnovo della patente
     */
    public void renew() {
        System.out.println("Renewing driving license");
    }
}
