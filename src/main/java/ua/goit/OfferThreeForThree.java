package ua.goit;

class OfferThreeForThree extends SpecialOffer {
    private Item item;

    public OfferThreeForThree(Item item) {
        this.item = item;
    }

    @Override
    public double cost(int numberOfItem) {
        if (item.isOfferThreeForThree()) {
            switch (numberOfItem) {
                case 0 -> {
                    return 0.00;
                }
                case 1, 2 -> {
                    return item.cost(numberOfItem);
                }
                default -> {
                    return (double) ((numberOfItem / 3) * 3.00 + item.cost(numberOfItem % 3));
                }
            }
        } else {
            return item.cost(numberOfItem);
        }
    }

    @Override
    public String getDescription() {
        if (item.isOfferThreeForThree()) {
            return "3.00 for 3 items " + item.getDescription();
        } else {
            return item.getDescription();
        }
    }
}
