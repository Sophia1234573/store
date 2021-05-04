package ua.goit;

class OfferFiveForSix extends SpecialOffer {
    private Item item;

    public OfferFiveForSix(Item item) {
        this.item = item;
    }

    @Override
    public double cost(int numberOfItem) {
        if (item.isOfferFiveForSix()) {
            switch (numberOfItem) {
                case 0 -> {
                    return 0.00;
                }
                case 1, 2, 3, 4, 5 -> {
                    return item.cost(numberOfItem);
                }
                default -> {
                    return ((numberOfItem / 6) * 5.00 + item.cost(numberOfItem % 6));
                }
            }
        } else {
            return item.cost(numberOfItem);
        }
    }

    @Override
    public String getDescription() {
        if (item.isOfferFiveForSix()) {
            return "5.00 for 6 items " + item.getDescription();
        } else {
            return item.getDescription();
        }
    }
}
