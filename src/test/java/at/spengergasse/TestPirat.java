package at.spengergasse;

public class TestPirat {
    
    
    public void testKielholen() {
        
        Pirat p1 = new Pirat();
        p1.kielholen();
        
        // Funktioniert die Methode korrekt, so wird nach dem Kielholen eines 
        // Piraten ohne Holzbein 90 erwartet.
        System.out.println( "Erwartet: 90; Ist: " +  p1.getGesundheit() );
    }
    
}