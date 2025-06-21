package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Scanner;

public class FoodOrderingSystem {
    private static class FoodChooser {
        private final Scanner scanner = new Scanner(System.in);

        public String chooseProduct(FoodSupplier supplier) {
            List<String> products = supplier.getProductsList();
            System.out.println("Products: ");
            for(int i = 0; i < products.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, products.get(i));
            }

            System.out.print("Choose product: ");
            int i = -1;
            while(i <= 0 || i > products.size()) {
                i = scanner.nextInt();
                if(i <= 0 || i > products.size()) {
                    System.out.print("Choose product: ");
                }
            }
            System.out.println();
            return products.get(i - 1);
        }

        public int chooseQuantity() {
            System.out.print("Quantity: ");
            int i = 0;
            while(i == 0 || i < 0) {
                i = scanner.nextInt();
                if(i == 0 || i < 0) {
                    System.out.print("Quantity: ");
                }
            }
            System.out.println();
            return i;
        }
    }

    public void order(FoodSupplier supplier) {
        FoodChooser foodChooser = new FoodChooser();

        String product = foodChooser.chooseProduct(supplier);
        int quantity = foodChooser.chooseQuantity();

        if(supplier.process(product, quantity)) {
            System.out.printf("Ordered %d %ss from %s!", quantity, product, supplier.getName());
        } else {
            System.out.println("Could NOT order...");
        }
    }
}
