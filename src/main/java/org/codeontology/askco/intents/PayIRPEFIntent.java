package org.codeontology.askco.intents;

/**
 * @label_it pagamento IRPEF
 *
 * Intent per il pagamento dell'IRPEF
 */
public class PayIRPEFIntent extends PayTaxIntent {

    /**
     * @label_it paga
     *
     * esegue il pagamento dell'IRPEF
     */
    public void pay() {
        System.out.println("Paying IRPEF");
    }
}
