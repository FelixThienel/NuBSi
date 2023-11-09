package Uebung5.Aufgabe1;

import java.util.Random;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AufgabeTest {
    Random random = new Random();
    int k_alice = random.nextInt();
    int a = random.nextInt();
    int b = random.nextInt();
    int s = k_alice ^ a;
    int u = s ^ b;
    int w = u ^ a;
    int k_bob = w ^ b;

    @Test
    void gleicheSchluessel() {
        assertEquals(k_alice, k_bob);
    }

    @Test
    void angreifer() {
        int k = s ^ u ^ w;
        assertEquals(k_alice, k);
    }
}