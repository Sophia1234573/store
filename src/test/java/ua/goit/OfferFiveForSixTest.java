package ua.goit;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfferFiveForSixTest {
    OfferFiveForSix fiveForSix;
    Item item;

    @After
    public void clear() {
        item = null;
        fiveForSix = null;
    }

    @Test
    public void testCostByOfferFiveForSixForA_happyPath() {
        item = new A();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals(1.25, fiveForSix.cost(1), 0.0);
        assertEquals(15.00, fiveForSix.cost(12), 0.0);
        assertEquals(6.25, fiveForSix.cost(5), 0.0);
        assertEquals(0.00, fiveForSix.cost(0), 0.0);
    }

    @Test
    public void testCostByOfferFiveForSixForB_happyPath() {
        item = new B();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals(4.25, fiveForSix.cost(1), 0.0);
        assertEquals(51, fiveForSix.cost(12), 0.0);
        assertEquals(21.25, fiveForSix.cost(5), 0.0);
        assertEquals(0.00, fiveForSix.cost(0), 0.0);
    }

    @Test
    public void testCostByOfferFiveForSixForC_happyPath() {
        item = new C();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals(1.00, fiveForSix.cost(1), 0.0);
        assertEquals(5.00, fiveForSix.cost(5), 0.0);
        assertEquals(5.00, fiveForSix.cost(6), 0.0);
        assertEquals(0.00, fiveForSix.cost(0), 0.0);
    }

    @Test
    public void testCostByOfferFiveForSixForD_happyPath() {
        item = new D();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals(0.75, fiveForSix.cost(1), 0.0);
        assertEquals(3.75, fiveForSix.cost(5), 0.0);
        assertEquals(4.50, fiveForSix.cost(6), 0.0);
        assertEquals(0.00, fiveForSix.cost(0), 0.0);
    }

    @Test
    public void testGetDescriptionForA() {
        item = new A();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals("A", fiveForSix.getDescription());
    }

    @Test
    public void testGetDescriptionForB() {
        item = new B();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals("B", fiveForSix.getDescription());
    }

    @Test
    public void testGetDescriptionForC() {
        item = new C();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals("5.00 for 6 items C", fiveForSix.getDescription());
    }

    @Test
    public void testGetDescriptionForD() {
        item = new D();
        fiveForSix = new OfferFiveForSix(item);
        assertEquals("D", fiveForSix.getDescription());
    }
}