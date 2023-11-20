package at.spengergasse;

public class TestSchiff {
    
    
    
    public void testAnheuern() {
        
        
        Schiff s1 = new Schiff('s');
        
        Pirat p1 = new Pirat();
        Pirat p2 = new Pirat();
        Pirat p3 = new Pirat();
        Pirat p4 = new Pirat();
        
    
        
        s1.anheuern( p1 );
        s1.anheuern( p2 );
        s1.anheuern( p3 );
        s1.anheuern( p4 );  // Wenn das Schiff vom Typ 's' ist, so darf der Pirat p3 nicht mehr aufgenommen werden
        
        // Wie k�nnte ich das �berpr�fen? -> Ausgabe der Infos mit toString()
        System.out.println(s1.toString());
        
        
    }
    
    
}