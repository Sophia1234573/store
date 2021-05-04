package ua.goit;

abstract class Item {
    String description = "item";
    boolean offerThreeForThree = false;
    boolean offerFiveForSix = false;

    public boolean isOfferThreeForThree() {
        return offerThreeForThree;
    }

    public boolean isOfferFiveForSix() {
        return offerFiveForSix;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost (int numberOfItem);
}
