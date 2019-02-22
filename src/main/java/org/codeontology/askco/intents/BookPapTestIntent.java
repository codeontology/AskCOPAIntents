package org.codeontology.askco.intents;

/**
 * @label_it Prenotazione Pap Test
 *
 * Questa classe rappresenta l'intent che permette all'utente di prenotare una visita per il Pap Test
 */
public class BookPapTestIntent extends BookMedicalExaminationIntent {

    /**
     * @label_it prenota
     *
     * Prenota la visita per il pap test
     */
    public void book() {
        System.out.println("Booking Pap Test");
    }
}
