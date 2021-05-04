package ua.goit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class GroceryStore {
    private Item a = new A();
    private Item b = new B();
    private Item c = new C();
    private Item d = new D();

    private final SpecialOffer specialOfferA = new OfferThreeForThree(a);
    private final SpecialOffer specialOfferC = new OfferFiveForSix(c);

    public double calculateTotalCost(String cartContent) {
        checkCartIsCorrect(cartContent);

        return specialOfferA.cost(calculateItemsInCart(a, cartContent))
                + specialOfferC.cost(calculateItemsInCart(c, cartContent))
                + b.cost(calculateItemsInCart(b, cartContent))
                + d.cost(calculateItemsInCart(d, cartContent));
    }

    private void checkCartIsCorrect(String cartContent) {
        if (cartContent == null || cartContent.length() == 0) {
            throw new GroceryStoreException("Sorry, but Your cart is empty!");
        }
        Pattern pattern = Pattern.compile("A+|B+|C+|D+");
        Matcher matcher = pattern.matcher(cartContent);
        if (!matcher.find()) {
            throw new GroceryStoreException("Sorry, but Your cart doesn't contains any product from our store");
        }
    }

    private int calculateItemsInCart(Item item, String cartContent) {
        int count = 0;
        char[] items = cartContent.toCharArray();
        for (char i : items) {
            if (String.valueOf(i).equals(item.getDescription())) {
                count++;
            }
        }
        return count;
    }
}
