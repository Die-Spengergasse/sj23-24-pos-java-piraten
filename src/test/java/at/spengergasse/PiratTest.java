package at.spengergasse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PiratTest {
    private Pirat pirat;

    @Test
    void kielholen() {
        Pirat p = new Pirat();
        p.kielholen();
        assertEquals(p.getGesundheit(), 50);
    }

    @Test
    void getGesundheit() {
    }

    @BeforeEach
    void setUp() {
        pirat = new Pirat("Georg", 80, true);
    }

    @AfterEach
    void tearDown() {
        pirat = null;
    }

    @Test
    void setGesundheit() {
    }

    @Test
    void trinkeRum() {
        pirat.trinken('r');
        assertEquals(100, pirat.getGesundheit());
    }
    @Test
    void trinkeWasser() {
        pirat.trinken('w');
        assertEquals(70, pirat.getGesundheit());
    }
}