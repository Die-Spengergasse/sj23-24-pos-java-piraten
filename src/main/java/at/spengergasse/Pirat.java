package at.spengergasse;

public class Pirat {
    private String name;
    private int gesundheit;
    private boolean holzbein;
    private Schiff schiff;


    public Pirat(String name, int gesundheit, boolean holzbein) {
        setName(name);
        setGesundheit(gesundheit);
        setHolzbein(holzbein);
    }

    public Schiff getSchiff() {
        return schiff;
    }

    public void setSchiff(Schiff schiff) {
        this.schiff = schiff;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer oder null sein!");
        }
        this.name = name;
    }

    public int getGesundheit() {
        return this.gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        String ungueltig = "Yo-ho-ho - Gültiger Bereich für die Gesundheit: 0 bis 100 Prozent";
        if (gesundheit < 0) {
            System.out.println(ungueltig);
            this.gesundheit = 0;
            return;
        }
        if (gesundheit > 100) {
            System.out.println(ungueltig);
            this.gesundheit = 100;
            return;
        }
        this.gesundheit = gesundheit;
        if (gesundheit == 0 && this.schiff != null) {
            this.schiff.piratIstTot(this);
        }
    }

    public boolean getHolzbein() {
        return this.holzbein;
    }

    public void setHolzbein(boolean holzbein) {
        this.holzbein = holzbein;
    }

    public void kielholen() {
        int gesundheitsAbzug;
        int neueGesundheit;
        if (this.holzbein) {
            gesundheitsAbzug = 95;
        } else gesundheitsAbzug = 90;
        neueGesundheit = this.gesundheit - gesundheitsAbzug;
        if (neueGesundheit < 0) {
            setGesundheit(0);
        } else {
            setGesundheit(neueGesundheit);
        }
        if (this.gesundheit < 0) {
            System.out.println("Pirat " + this.name + " stieg in Davy Jone's Kiste");
        }
    }

    public void trinken(char getraenk) {
        switch (getraenk) {
            case 'w' -> setGesundheit(this.gesundheit - 10);
            case 'g' -> setGesundheit(this.gesundheit + 10);
            case 'r' -> setGesundheit(this.gesundheit + 20);
            default -> throw new IllegalArgumentException("Es darf nur 'w', 'g' oder 'r' getrunken werden!");
        }
        if (this.gesundheit == 0) {
            System.out.println("Haudegen " + this.name + " ging über die Planke");
        }
        if (this.gesundheit == 100) {
            System.out.println("Haudegen " + this.name + " erfreut sich voller Gesundheit");
        }
    }

    public void print() {
        System.out.println(this);
    }

    public String toString() {
        String gesundheitsInfo;
        String holzbeinInfo;

        //Holzbeininfo
        if (holzbein) {
            holzbeinInfo = ", Holzbein";
        } else {
            holzbeinInfo = ", Zweifüßer";
        }

        //Gesundheitsinfo
        if (this.gesundheit > 0 && this.gesundheit <= 10) {
            gesundheitsInfo = "- hisst den Yellow Jack";
        } else if (this.gesundheit == 0) {
            gesundheitsInfo = "X - sprang in die Kiste";
        } else {
            gesundheitsInfo = this.gesundheit + " %";
        }

        //Rückgabewert
        return "`Aye` - Trunkenbold " + this.name + " meldet sich an Board! " + gesundheitsInfo + holzbeinInfo;
    }

}