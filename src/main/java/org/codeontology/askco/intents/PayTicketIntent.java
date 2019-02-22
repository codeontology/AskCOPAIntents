package org.codeontology.askco.intents;

/**
 * @label_it Pagamento multa
 *
 * Intent per il pagamento di una multa
 */
public class PayTicketIntent extends PayIntent {

    /**
     * @label_it paga
     *
     * paga la multa
     */
    public void pay() {
        System.out.println("Paying intent");
    }
}
