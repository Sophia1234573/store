package ua.goit;

class B extends Item {
    public B() {
        description = "B";
    }

    @Override
    public double cost(int numberOfItem) {
        return 4.25 * numberOfItem;
    }
}
