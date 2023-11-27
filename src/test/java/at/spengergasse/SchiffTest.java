package at.spengergasse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchiffTest {

    private Schiff schiff_s;
    private Schiff schiff_b;
    private Schiff schiff_f;
    private Schiff schiff_g;
    private Pirat p1, p2, p3, p4, p5, p6, p7;
    @Test
    void setTyp() {
    }

    @Test
    void getTyp() {
    }

    @Test
    void getKanonen() {
    }

    @Test
    void anheuern() {
    }

    @Test
    void print() {
    }

    @Test
    void testToString() {
    }

    @BeforeEach
    void setUp() {
        schiff_s = new Schiff('s');
        schiff_b = new Schiff('b');
        schiff_f = new Schiff('f');
        schiff_g = new Schiff('g');
        p1 = new Pirat("Cook", 50, true);
        p2 = new Pirat("Peter", 50, false);
        p3 = new Pirat("Maria", 50, true);
        p4 = new Pirat("Susi", 50, false);
        p5 = new Pirat("Anton", 50, true);
        p6 = new Pirat("Heidi", 50, false);
        p7 = new Pirat("Heidi", 50, true);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void hasPirat() {
        schiff_g.anheuern(p1);
        assertEquals(true, schiff_g.hasPirat(p1));
        p1.kielholen();
        assertEquals(false, schiff_g.hasPirat(p1));
    }
}