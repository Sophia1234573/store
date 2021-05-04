package ua.goit;

public class Main {

    public static void main(String[] args) {
        GroceryStore groceryStore = new GroceryStore();
        System.out.println(groceryStore.calculateTotalCost(" A B C D A B A "));
    }
}
