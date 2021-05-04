package ua.goit;

class D extends Item {
    public D() {
        description = "D";
    }

    @Override
    public double cost(int numberOfItem) {
        return 0.75 * numberOfItem;
    }
}
