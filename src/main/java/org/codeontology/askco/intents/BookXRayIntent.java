package org.codeontology.askco.intents;

/**
 * @label_it Prenotazione Pap Test
 *
 * Questa classe rappresenta l'intent che permette all'utente di prenotare una radiografia
 */
public class BookXRayIntent extends BookMedicalExaminationIntent {

    /**
     * @label_it Prenota
     *
     * Prenota la radiografia
     */
    public void book() {
        System.out.println("Booking X-Ray");
    }
}
