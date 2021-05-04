package ua.goit;

class C extends Item {
    public C() {
        description = "C";
        offerFiveForSix = true;
    }

    @Override
    public double cost(int numberOfItem) {
        return 1.00 * numberOfItem;
    }
}
