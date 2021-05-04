package ua.goit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroceryStoreTest {
    GroceryStore groceryStore;

    @Before
    public void init() {
        groceryStore = new GroceryStore();
    }

    @After
    public void clear() {
        groceryStore = null;
    }

    @Test
    public void testCalculateTotalCost_IfCartIsEmpty() {
        assertThrows("Sorry, but Your cart is empty!", GroceryStoreException.class,
                () -> groceryStore.calculateTotalCost(""));
    }

    @Test
    public void testCalculateTotalCost_IfCartIsNull() {
        assertThrows("Sorry, but Your cart is empty!", GroceryStoreException.class,
                () -> groceryStore.calculateTotalCost(null));
    }

    @Test
    public void testCalculateTotalCost_IfCartContainsAnyItems() {
        String expected = "ckjdheheeoldjhdp39485757cjchcccncn";
        assertThrows("Sorry, but Your cart doesn't contains any product from our store!", GroceryStoreException.class,
                () -> groceryStore.calculateTotalCost(expected));
    }

    @Test
    public void testCalculateTotalCost_happyPath() {
        assertEquals(13.25, groceryStore.calculateTotalCost("Ajfhh    hhjkcmnsadbbfjkadcbBCDABA"), 0.00);
        assertEquals(1.25, groceryStore.calculateTotalCost("A"), 0.00);
        assertEquals(4.25, groceryStore.calculateTotalCost("B"), 0.00);
        assertEquals(1.00, groceryStore.calculateTotalCost("C"), 0.00);
        assertEquals(0.75, groceryStore.calculateTotalCost("D"), 0.00);
        assertEquals(0.75, groceryStore.calculateTotalCost("D"), 0.00);
        assertEquals(5.5, groceryStore.calculateTotalCost("Afjsl948AkaAAbcdmfnfaklA"), 0.00);
        assertEquals(6, groceryStore.calculateTotalCost("fCjCsClcabcd948kmCfCCnfakCl"), 0.00);
        assertEquals(7.25, groceryStore.calculateTotalCost("AjfghggjdjjaaaBkkkbbbdCkckdhhDkkkkbd"), 0.00);
    }
}