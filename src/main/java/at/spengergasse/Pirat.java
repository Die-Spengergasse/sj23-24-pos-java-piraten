package at.spengergasse;

// Änderung
public class Pirat {
    
    private String name;
    private int gesundheit;  // 0 - 100 
    private boolean holzbein;
    
    
    public Pirat() {
    }
    
    
    public void kielholen() {
        
        // Gesundheit darf nicht unter 0 kommen
        // Pruefung hat er holzbein, dann 95 sonst 90
        
        // Einfache Variante mit Zwischenergebnis
        int aktuelleGesundheit = gesundheit - 90;
        
        // Pruefen ob aktuelleGesundheit <= 0 -> dann gesundheit 0 und Meldung
        int gesundheit = 0;
        
        // ...
        
    }
    
    public int getGesundheit() {
        return gesundheit;
    }
    
    
    
    
    
    
}