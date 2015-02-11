class Mus {
    private boolean syk = false;
    private int vekt;
    private boolean lever = true;
    private String navn;

    private static int museTeller = 0;

    public Mus (int vekt, boolean syk) {
        this.vekt = vekt;
        this.syk = syk;
        this.navn = "musNr" + ++museTeller;
    }

    // Getters
    public boolean syk() { return syk; }
    public int vekt() { return vekt; }
    public boolean lever() { return lever; }

    // Misc. methods
    void sjekktilstand(String testid, String navn, boolean syk, int vekt, boolean lever) {
        /*
        En metode sjekktilstand som tar inn fem argumenter:
            testid, navn, syk, vekt, lever.
        Denne metoden skal sjekke om de tre siste argumentene -- syk, vekt lever
        matcher over ens med dataene som er lagret i musens private variabler.
        */
        String message = "********* Test av musobjekt, testid: " + testid + " ***";

        message += "\n** navn: " + navn + ", ";
        message = (this.navn.equals(navn)) ? message + "OK." : message + "FEIL!";

        message += "\n** syk: " + this.syk + ", ";
        message = (syk == this.syk) ? message + "OK." : message + "FEIL!";

        message += "\n** vekt: " + this.vekt + ", ";
        message = (vekt == this.vekt) ? message + "OK." : message + "FEIL!";

        System.out.println(message);
    }
    
    void infoOmTilstand(String testid) {
        String message = "--- " + testid + " --- Info om mus: navn: " + this.navn + ", " +
            "vekt: " + vekt + ", ";
        if (! lever ) message += "død";
        else if (syk) message += "syk";
        else message += "lever";
        System.out.println(message);
    }

    void die() { lever = false; }

    void bliBitt() {
        if (!syk) syk = true;
        else lever = false;
    }
}
