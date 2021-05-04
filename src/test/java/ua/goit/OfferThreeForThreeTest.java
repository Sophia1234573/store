package ua.goit;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class OfferThreeForThreeTest {
    OfferThreeForThree threeForThree;
    Item item;

    @After
    public void clear() {
        item = null;
        threeForThree = null;
    }

    @Test
    public void testCostByOfferThreeForThreeForA_happyPath() {
        item = new A();
        threeForThree = new OfferThreeForThree(item);
        assertEquals(1.25, threeForThree.cost(1), 0.0);
        assertEquals(2.50, threeForThree.cost(2), 0.0);
        assertEquals(3.00, threeForThree.cost(3), 0.0);
        assertEquals(27.00, threeForThree.cost(27), 0.0);
        assertEquals(0.00, threeForThree.cost(0), 0.0);
        assertEquals(28.25, threeForThree.cost(28), 0.0);
    }

    @Test
    public void testCostByOfferThreeForThreeForB_happyPath() {
        item = new B();
        threeForThree = new OfferThreeForThree(item);
        assertEquals(4.25, threeForThree.cost(1), 0.0);
        assertEquals(12.75, threeForThree.cost(3), 0.0);
        assertEquals(119.00, threeForThree.cost(28), 0.0);
        assertEquals(0.00, threeForThree.cost(0), 0.0);
    }

    @Test
    public void testCostByOfferThreeForThreeForC_happyPath() {
        item = new C();
        threeForThree = new OfferThreeForThree(item);
        assertEquals(1.00, threeForThree.cost(1), 0.0);
        assertEquals(3.00, threeForThree.cost(3), 0.0);
        assertEquals(27.00, threeForThree.cost(27), 0.0);
        assertEquals(28.00, threeForThree.cost(28), 0.0);
        assertEquals(0.00, threeForThree.cost(0), 0.0);
    }

    @Test
    public void testCostByOfferThreeForThreeForD_happyPath() {
        item = new D();
        threeForThree = new OfferThreeForThree(item);
        assertEquals(0.75, threeForThree.cost(1), 0.0);
        assertEquals(2.25, threeForThree.cost(3), 0.0);
        assertEquals(20.25, threeForThree.cost(27), 0.0);
        assertEquals(21.00, threeForThree.cost(28), 0.0);
        assertEquals(0.00, threeForThree.cost(0), 0.0);
    }

    @Test
    public void testGetDescriptionForA() {
        item = new A();
        threeForThree = new OfferThreeForThree(item);
        assertEquals("3.00 for 3 items A", threeForThree.getDescription());
    }

    @Test
    public void testGetDescriptionForB() {
        item = new B();
        threeForThree = new OfferThreeForThree(item);
        assertEquals("B", threeForThree.getDescription());
    }

    @Test
    public void testGetDescriptionForC() {
        item = new C();
        threeForThree = new OfferThreeForThree(item);
        assertEquals("C", threeForThree.getDescription());
    }

    @Test
    public void testGetDescriptionForD() {
        item = new D();
        threeForThree = new OfferThreeForThree(item);
        assertEquals("D", threeForThree.getDescription());
    }
}