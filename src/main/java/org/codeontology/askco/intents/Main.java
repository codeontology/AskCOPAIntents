package org.codeontology.askco.intents;

public class Main {
    public static void main(String[] args) {
        new RenewIdentityCardIntent().run();
        System.out.println();
        new PayIRPEFIntent().run();
        System.out.println();
        new RenewDrivingLicenseIntent().run();
        System.out.println();
        new PayTicketIntent().run();
        System.out.println();
        new BookPapTestIntent().run();
        System.out.println();
        new BookPapTestIntent().run();
        System.out.println();
        new BookXRayIntent().run();
        System.out.println();
        new LargeDisposalsIntent().run();
        System.out.println();
        new AddressChangeInfoIntent().run();
    }
}
