package ua.goit;

class A extends Item {
    public A() {
        description = "A";
        offerThreeForThree = true;
    }

    @Override
    public double cost(int numberOfItem) {
        return 1.25 * numberOfItem;
    }
}
