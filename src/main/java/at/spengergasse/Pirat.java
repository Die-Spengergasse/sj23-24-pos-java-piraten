package at.spengergasse;

public class Pirat {
    // instance variables - replace the example below with your own
    private String name;
    private int gesundheit;
    private boolean holzbein;



    public Pirat(String name, int gesundheit, boolean holzbein) {
        setName(name);
        setGesundheit(gesundheit);
        setHolzbein(holzbein);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer oder null sein!");
        }
        this.name = name;
    }

    public void setGesundheit(int gesundheit) {
        if (gesundheit < 0 || gesundheit > 100) {
            throw new IllegalArgumentException("Gesundheit darf nur >= 0 und <= 100 sein!");
        }
        this.gesundheit = gesundheit;
    }

    public void setHolzbein(boolean holzbein) {
        this.holzbein = holzbein;
    }

    public String getName() {
        return this.name;
    }

    public int getGesundheit() {
        return this.gesundheit;
    }

    public boolean getHolzbein() {
        return this.holzbein;
    }

    public void kielholen() {
        if (this.holzbein) {
            if (this.gesundheit - 95 < 0) {
                setGesundheit(0);
                System.out.println("Pirat " + this.name + " stieg in Davy Jone's Kiste");
            } else {
                this.gesundheit = gesundheit - 95;
                if (this.gesundheit == 0) {
                    System.out.println("Pirat " + this.name + " stieg in Davy Jone's Kiste");
                }
            }
        } else {
            if (this.gesundheit - 90 < 0) {
                setGesundheit(0);
            } else {
                this.gesundheit = gesundheit - 90;
                if (this.gesundheit == 0) {
                    System.out.println("Pirat " + this.name + " stieg in Davy Jone's Kiste");
                }
            }
        }
    }

    public void trinken(char getränk) {
        switch (getränk) {
            case 'w' -> {
                if (this.gesundheit - 10 < 0) {
                    throw new IllegalArgumentException("Haudegen " + this.name + " kann jetzt kein Wasser trinken!");
                }
                this.gesundheit = gesundheit - 10;
                if (this.gesundheit == 0) {
                    System.out.println("Haudegen " + this.name + " ging über die Planke");
                }
            }
            case 'g' -> {
                if (this.gesundheit + 10 >= 100) {
                    throw new IllegalArgumentException("Haudegen " + this.name + " kann jetzt keinen Grog 'g' trinken!");
                }
                this.gesundheit = gesundheit + 10;
                if (this.gesundheit == 100) {
                    System.out.println("Haudegen " + this.name + " erfreut sich voller Gesundheit");
                }
            }
            case 'r' -> {
                if (this.gesundheit + 20 >= 100) {
                    throw new IllegalArgumentException("Haudegen " + this.name + " kann gerade keinen Rum 'r' trinken, versuchen sie Grog 'g'!");
                }
                this.gesundheit = gesundheit + 20;
            }
            default -> throw new IllegalArgumentException("Es darf nur 'w', 'g' oder 'r' getrunken werden!");
        }
    }

    public void print() {
        System.out.println(this);
    }

    public String toString() {
        String toReturn;
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
        toReturn = "`Aye` - Trunkenbold " + this.name + " meldet sich an Board! " + gesundheitsInfo + holzbeinInfo;

        return toReturn;
    }

}