package at.spengergasse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PiratTest {
    Pirat p;
    private Schiff schiff_s;

    @BeforeEach
    void setUp() {
        p = new Pirat("Salz", 100, true);
        schiff_s = new Schiff('s');
    }

    @Test
    void setName() {
        p.setName("Ignaz");
        assertEquals("Ignaz", p.getName());
    }

    @Test
    void setGesundheit() {
        p.setGesundheit(70);
        assertEquals(70, p.getGesundheit());
    }

    @Test
    void setHolzbein() {
        p.setHolzbein(true);
        assertTrue(p.getHolzbein());
        p.setHolzbein(false);
        assertFalse(p.getHolzbein());
    }

    @Test
    void getName() {
        assertEquals("Salz", p.getName());
    }

    @Test
    void getGesundheit() {
        assertEquals(100, p.getGesundheit());
    }

    @Test
    void getHolzbein() {
        assertTrue(p.getHolzbein());
    }

    @Test
    void kielholen() {
        schiff_s.anheuern(p);
        p.kielholen();
        if (p.getHolzbein()) {
            assertEquals(5, p.getGesundheit());
        } else {
            assertEquals(10, p.getGesundheit());
        }
        p.trinken('w');
        assertEquals(0, p.getGesundheit());
    }

    @Test
    void trinken() {
        p.trinken('w');
        assertEquals(90, p.getGesundheit());
        p.trinken('w');
        assertEquals(80, p.getGesundheit());
        p.trinken('w');
        assertEquals(70, p.getGesundheit());
        p.trinken('r');
        assertEquals(90, p.getGesundheit());
        p.trinken('r');
        assertEquals(100, p.getGesundheit());
    }

    @Test
    void testToString() {
        assertEquals("`Aye` - Trunkenbold Salz meldet sich an Board! 100 %, Holzbein", p.toString());
    }
}