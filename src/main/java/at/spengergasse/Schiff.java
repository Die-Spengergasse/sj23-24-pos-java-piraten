package at.spengergasse;

public class Schiff {
    private int kanonen;
    private char typ;
    private Pirat kapitaen;
    private Pirat[] piraten;

    /**
     * Constructor for objects of class Schiff
     */
    public Schiff(char typ) {
        setTyp(typ);

    }

    public char getTyp() {
        return this.typ;
    }

    public void setTyp(char typ) {
        switch (typ) {
            case 's' -> {
                this.typ = typ;
                piraten = new Pirat[2];
                kanonenKlarmachen(1);
            }
            case 'b' -> {
                this.typ = typ;
                piraten = new Pirat[3];
                kanonenKlarmachen(2);
            }
            case 'f' -> {
                this.typ = typ;
                piraten = new Pirat[4];
                kanonenKlarmachen(5);
            }
            case 'g' -> {
                this.typ = typ;
                piraten = new Pirat[5];
                kanonenKlarmachen(8);
            }
            default ->
                    throw new IllegalArgumentException("Arrgh! Schaebige Schnigge vom Typ " + typ + " ist nicht würdig gesegelt zu werden!");
        }
    }

    private void kanonenKlarmachen(int kanonen) {
        this.kanonen = kanonen;
    }

    public int getKanonen() {
        return this.kanonen;
    }

    public void anheuern(Pirat pirat) {
        if (kapitaen == null) {
            this.kapitaen = pirat;
            return;
        }
        for (int i = 0; i < piraten.length; i++) {
            if (piraten[i] == null) {
                piraten[i] = pirat;
                return;
            }
        }
        throw new IllegalArgumentException("Kein Grog mehr fuer den Trunkenbold! Voll besetzt! " + typ);
    }

    public void print() {
        System.out.println(this);
    }

    public String toString() {
        String rw = "";
        switch (this.getTyp()) {
            case 's' -> rw = "Crew Schaluppe (3): " + "\n" + "______________________" + "\n";
            case 'b' -> rw = "Brigg (4): " + "\n" + "______________________" + "\n";
            case 'f' -> rw = "Frigatte (5): " + "\n" + "______________________" + "\n";
            case 'g' -> rw = "Galeone (6): " + "\n" + "______________________" + "\n";
            default -> throw new IllegalArgumentException("Falsche Bezeichnung!");
        } ;
        rw += this.kapitaen.toString() + "\n";
        for (int i = 0; i < piraten.length; i++) {
            rw += piraten[i].toString();
        }
        return rw;
    }
}
