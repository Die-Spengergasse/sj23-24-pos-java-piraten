package at.spengergasse;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Schiff schaluppe = new Schiff('s');
        Pirat fred = new Pirat("Fred", 100,true);
        Pirat edward = new Pirat("Edward", 100, false);
        Pirat john = new Pirat("John",100,true);
        Pirat albert = new Pirat("Albert", 100, false);

        schaluppe.anheuern(edward);
        schaluppe.anheuern(fred);
        schaluppe.anheuern(john);

        schaluppe.print();
        //fred.print();

    }
}
