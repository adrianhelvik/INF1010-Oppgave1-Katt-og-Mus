class Katt {
    private int maksSpistMus = 2; // No getter method for this guy

    private String navn;
    private int vekt;
    private int antMus;
    private boolean syk;

    // Constructors
    public Katt(String navn, int vekt, boolean syk) {
        this.navn = navn;
        this.vekt = vekt;
        this.syk = syk;
    }

    public Katt(String navn) {
        this.navn = navn;
        vekt = 5000;
        syk = false;
    }

    // Getters
    public String       navn()   { return navn; }
    public int          vekt()   { return vekt; }
    public int          antMus() { return antMus; }
    public boolean      syk()    { return syk; }
    
    // Misc. methods
    Mus gaaPaaJaktI(Bol<Mus> musebol) {
        // Hvis musen ikke er dod og, hvis ikke mett,
        // spis mus,
        // hvis musa er syk blir katten syk
        // vekt += mus.getVekt()
        // Slett mus fra bolet
        
        // Om bolet er tomt er det intet aa gjoere
        if ( musebol.tomt() ) return null;
        
        // Finn frem musa(!)
        Mus mus = musebol.beboer();
        
        // Hvis musa ikke lever returner musa
        if (! mus.lever()) {
            return mus;
        }
        
        // Hvis musa lever og katten ikke er mett
        if (! mett()) {
            // Hvis katten biter en syk mus, men ikke spiser den skal den ikke bli syk
            if (mus.syk()) syk = true;
            spis(mus);
            mus = null;
        } else {
            mus.bliBitt();
        }

        return mus;
    }

    boolean mett() {
        if (antMus() >= maksSpistMus) return true;
        else return false;
    }

    void spis(Mus mus) {
        this.vekt += mus.vekt();
        this.antMus++;
        mus.die();
    }
}
