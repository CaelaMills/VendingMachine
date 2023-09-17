import java.util.Arrays;

// All Soda Vending Machine
    public class VendingMachine {
        private final String[][][] products;

        public VendingMachine(int rows, int cols, int depth) {
            // Declare and dimension a Multi-dimensional array of Strings
            products = new String[rows][cols][depth];
        }

        public void addProduct(int row, int col, int depth, String productName) {
            if (row >= 0 && row < products.length && col >= 0 && col < products[0].length && depth >= 0 && depth < products[0].length) {
                products[row][col][depth] = productName;
            } else {
                System.out.println("Invalid location for adding a product.");
            }
        }

        public String getProduct(int row, int col, int depth) {
            if (row >= 0 && row < products.length && col >= 0 && col < products[0].length && depth >= 0 && depth < products[0].length) {
                String product = products[row][col][depth];
                if (product != null) {
                    products[row][col][depth] = null; // Remove the product from the vending machine
                    return product;
                } else {
                    return "Empty Slot";
                }
            } else {
                return "invalid location";
            }
        }

        public void display() {
            for (String[][] strings : products) {
                for (int j = 0; j < products[0].length; j++) {
                    String[] product = strings[j];
                    if (product == null) {
                        System.out.print("[Empty]");
                    } else {
                        System.out.print("[" + Arrays.toString(product) + "] ");
                    }
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            // constructs 6 rows x 6 cols x 6 for depth
            VendingMachine vendingMachine = new VendingMachine(6, 6, 6);


            // ??
            vendingMachine.addProduct(0, 0, 0, "Soda");
            vendingMachine.addProduct(0, 0, 1, "Soda");
            vendingMachine.addProduct(0, 0, 2, "Soda");
            vendingMachine.addProduct(0, 0, 3, "Soda");
            vendingMachine.addProduct(0, 0, 4, "Soda");
            vendingMachine.addProduct(0, 0, 5, "Soda");

            vendingMachine.addProduct(1, 0, 0, "Soda");
            vendingMachine.addProduct(1, 0, 1, "Soda");
            vendingMachine.addProduct(1, 0, 2, "Soda");
            vendingMachine.addProduct(1, 0, 3, "Soda");
            vendingMachine.addProduct(1, 0, 4, "Soda");
            vendingMachine.addProduct(1, 0, 5, "Soda");

            vendingMachine.addProduct(2, 0, 0, "Soda");
            vendingMachine.addProduct(2, 0, 1, "Soda");
            vendingMachine.addProduct(2, 0, 2, "Soda");
            vendingMachine.addProduct(2, 0, 3, "Soda");
            vendingMachine.addProduct(2, 0, 4, "Soda");
            vendingMachine.addProduct(2, 0, 5, "Soda");

            vendingMachine.addProduct(3, 0, 0, "Soda");
            vendingMachine.addProduct(3, 0, 1, "Soda");
            vendingMachine.addProduct(3, 0, 2, "Soda");
            vendingMachine.addProduct(3, 0, 3, "Soda");
            vendingMachine.addProduct(3, 0, 4, "Soda");
            vendingMachine.addProduct(3, 0, 5, "Soda");

            vendingMachine.addProduct(4, 0, 0, "Soda");
            vendingMachine.addProduct(4, 0, 1, "Soda");
            vendingMachine.addProduct(4, 0, 2, "Soda");
            vendingMachine.addProduct(4, 0, 3, "Soda");
            vendingMachine.addProduct(4, 0, 4, "Soda");
            vendingMachine.addProduct(4, 0, 5, "Soda");

            vendingMachine.addProduct(5, 0, 0, "Soda");
            vendingMachine.addProduct(5, 0, 1, "Soda");
            vendingMachine.addProduct(5, 0, 2, "Soda");
            vendingMachine.addProduct(5, 0, 3, "Soda");
            vendingMachine.addProduct(5, 0, 4, "Soda");
            vendingMachine.addProduct(5, 0, 5, "Soda");

            // Filling Row 0 -  Horizontally
            vendingMachine.addProduct(0, 1, 0, "Soda");
            vendingMachine.addProduct(0, 1, 1, "Soda");
            vendingMachine.addProduct(0, 1, 2, "Soda");
            vendingMachine.addProduct(0, 1, 3, "Soda");
            vendingMachine.addProduct(0, 1, 4, "Soda");
            vendingMachine.addProduct(0, 1, 5, "Soda");

            vendingMachine.addProduct(0, 2, 0, "Soda");
            vendingMachine.addProduct(0, 2, 1, "Soda");
            vendingMachine.addProduct(0, 2, 2, "Soda");
            vendingMachine.addProduct(0, 2, 3, "Soda");
            vendingMachine.addProduct(0, 2, 4, "Soda");
            vendingMachine.addProduct(0, 2, 5, "Soda");

            vendingMachine.addProduct(0, 3, 0, "Soda");
            vendingMachine.addProduct(0, 3, 1, "Soda");
            vendingMachine.addProduct(0, 3, 2, "Soda");
            vendingMachine.addProduct(0, 3, 3, "Soda");
            vendingMachine.addProduct(0, 3, 4, "Soda");
            vendingMachine.addProduct(0, 3, 5, "Soda");

            vendingMachine.addProduct(0, 4, 0, "Soda");
            vendingMachine.addProduct(0, 4, 1, "Soda");
            vendingMachine.addProduct(0, 4, 2, "Soda");
            vendingMachine.addProduct(0, 4, 3, "Soda");
            vendingMachine.addProduct(0, 4, 4, "Soda");
            vendingMachine.addProduct(0, 4, 5, "Soda");

            vendingMachine.addProduct(0, 5, 0, "Soda");
            vendingMachine.addProduct(0, 5, 1, "Soda");
            vendingMachine.addProduct(0, 5, 2, "Soda");
            vendingMachine.addProduct(0, 5, 3, "Soda");
            vendingMachine.addProduct(0, 5, 4, "Soda");
            vendingMachine.addProduct(0, 5, 5, "Soda");

            // Filling Column 1 -  Horizontally
            vendingMachine.addProduct(1, 1, 0, "Soda");
            vendingMachine.addProduct(1, 1, 1, "Soda");
            vendingMachine.addProduct(1, 1, 2, "Soda");
            vendingMachine.addProduct(1, 1, 3, "Soda");
            vendingMachine.addProduct(1, 1, 4, "Soda");
            vendingMachine.addProduct(1, 1, 5, "Soda");

            vendingMachine.addProduct(2, 1, 0, "Soda");
            vendingMachine.addProduct(2, 1, 1, "Soda");
            vendingMachine.addProduct(2, 1, 2, "Soda");
            vendingMachine.addProduct(2, 1, 3, "Soda");
            vendingMachine.addProduct(2, 1, 4, "Soda");
            vendingMachine.addProduct(2, 1, 5, "Soda");

            vendingMachine.addProduct(3, 1, 0, "Soda");
            vendingMachine.addProduct(3, 1, 1, "Soda");
            vendingMachine.addProduct(3, 1, 2, "Soda");
            vendingMachine.addProduct(3, 1, 3, "Soda");
            vendingMachine.addProduct(3, 1, 4, "Soda");
            vendingMachine.addProduct(3, 1, 5, "Soda");

            vendingMachine.addProduct(4, 1, 0, "Soda");
            vendingMachine.addProduct(4, 1, 1, "Soda");
            vendingMachine.addProduct(4, 1, 2, "Soda");
            vendingMachine.addProduct(4, 1, 3, "Soda");
            vendingMachine.addProduct(4, 1, 4, "Soda");
            vendingMachine.addProduct(4, 1, 5, "Soda");

            vendingMachine.addProduct(5, 1, 0, "Soda");
            vendingMachine.addProduct(5, 1, 1, "Soda");
            vendingMachine.addProduct(5, 1, 2, "Soda");
            vendingMachine.addProduct(5, 1, 3, "Soda");
            vendingMachine.addProduct(5, 1, 4, "Soda");
            vendingMachine.addProduct(5, 1, 5, "Soda");

            // Filling Column 2 - Horizontally
            vendingMachine.addProduct(1, 2, 0, "Soda");
            vendingMachine.addProduct(1, 2, 1, "Soda");
            vendingMachine.addProduct(1, 2, 2, "Soda");
            vendingMachine.addProduct(1, 2, 3, "Soda");
            vendingMachine.addProduct(1, 2, 4, "Soda");
            vendingMachine.addProduct(1, 2, 5, "Soda");

            vendingMachine.addProduct(2, 2, 0, "Soda");
            vendingMachine.addProduct(2, 2, 1, "Soda");
            vendingMachine.addProduct(2, 2, 2, "Soda");
            vendingMachine.addProduct(2, 2, 3, "Soda");
            vendingMachine.addProduct(2, 2, 4, "Soda");
            vendingMachine.addProduct(2, 2, 5, "Soda");

            vendingMachine.addProduct(3, 2, 0, "Soda");
            vendingMachine.addProduct(3, 2, 1, "Soda");
            vendingMachine.addProduct(3, 2, 2, "Soda");
            vendingMachine.addProduct(3, 2, 3, "Soda");
            vendingMachine.addProduct(3, 2, 4, "Soda");
            vendingMachine.addProduct(3, 2, 5, "Soda");

            vendingMachine.addProduct(4, 2, 0, "Soda");
            vendingMachine.addProduct(4, 2, 1, "Soda");
            vendingMachine.addProduct(4, 2, 2, "Soda");
            vendingMachine.addProduct(4, 2, 3, "Soda");
            vendingMachine.addProduct(4, 2, 4, "Soda");
            vendingMachine.addProduct(4, 2, 5, "Soda");

            vendingMachine.addProduct(5, 2, 0, "Soda");
            vendingMachine.addProduct(5, 2, 1, "Soda");
            vendingMachine.addProduct(5, 2, 2, "Soda");
            vendingMachine.addProduct(5, 2, 3, "Soda");
            vendingMachine.addProduct(5, 2, 4, "Soda");
            vendingMachine.addProduct(5, 2, 5, "Soda");

            // Filling Column 3 - Horizontally
            vendingMachine.addProduct(1, 3, 0, "Soda");
            vendingMachine.addProduct(1, 3, 1, "Soda");
            vendingMachine.addProduct(1, 3, 2, "Soda");
            vendingMachine.addProduct(1, 3, 3, "Soda");
            vendingMachine.addProduct(1, 3, 4, "Soda");
            vendingMachine.addProduct(1, 3, 5, "Soda");

            vendingMachine.addProduct(2, 3, 0, "Soda");
            vendingMachine.addProduct(2, 3, 1, "Soda");
            vendingMachine.addProduct(2, 3, 2, "Soda");
            vendingMachine.addProduct(2, 3, 3, "Soda");
            vendingMachine.addProduct(2, 3, 4, "Soda");
            vendingMachine.addProduct(2, 3, 5, "Soda");

            vendingMachine.addProduct(3, 3, 0, "Soda");
            vendingMachine.addProduct(3, 3, 1, "Soda");
            vendingMachine.addProduct(3, 3, 2, "Soda");
            vendingMachine.addProduct(3, 3, 3, "Soda");
            vendingMachine.addProduct(3, 3, 4, "Soda");
            vendingMachine.addProduct(3, 3, 5, "Soda");

            vendingMachine.addProduct(4, 3, 0, "Soda");
            vendingMachine.addProduct(4, 3, 1, "Soda");
            vendingMachine.addProduct(4, 3, 2, "Soda");
            vendingMachine.addProduct(4, 3, 3, "Soda");
            vendingMachine.addProduct(4, 3, 4, "Soda");
            vendingMachine.addProduct(4, 3, 5, "Soda");

            vendingMachine.addProduct(5, 3, 0, "Soda");
            vendingMachine.addProduct(5, 3, 1, "Soda");
            vendingMachine.addProduct(5, 3, 2, "Soda");
            vendingMachine.addProduct(5, 3, 3, "Soda");
            vendingMachine.addProduct(5, 3, 4, "Soda");
            vendingMachine.addProduct(5, 3, 5, "Soda");

            // Filling Column 4 - Horizontally
            vendingMachine.addProduct(1, 4, 0, "Soda");
            vendingMachine.addProduct(1, 4, 1, "Soda");
            vendingMachine.addProduct(1, 4, 2, "Soda");
            vendingMachine.addProduct(1, 4, 3, "Soda");
            vendingMachine.addProduct(1, 4, 4, "Soda");
            vendingMachine.addProduct(1, 4, 5, "Soda");

            vendingMachine.addProduct(2, 4, 0, "Soda");
            vendingMachine.addProduct(2, 4, 1, "Soda");
            vendingMachine.addProduct(2, 4, 2, "Soda");
            vendingMachine.addProduct(2, 4, 3, "Soda");
            vendingMachine.addProduct(2, 4, 4, "Soda");
            vendingMachine.addProduct(2, 4, 5, "Soda");

            vendingMachine.addProduct(3, 4, 0, "Soda");
            vendingMachine.addProduct(3, 4, 1, "Soda");
            vendingMachine.addProduct(3, 4, 2, "Soda");
            vendingMachine.addProduct(3, 4, 3, "Soda");
            vendingMachine.addProduct(3, 4, 4, "Soda");
            vendingMachine.addProduct(3, 4, 5, "Soda");

            vendingMachine.addProduct(4, 4, 0, "Soda");
            vendingMachine.addProduct(4, 4, 1, "Soda");
            vendingMachine.addProduct(4, 4, 2, "Soda");
            vendingMachine.addProduct(4, 4, 3, "Soda");
            vendingMachine.addProduct(4, 4, 4, "Soda");
            vendingMachine.addProduct(4, 4, 5, "Soda");

            vendingMachine.addProduct(5, 4, 0, "Soda");
            vendingMachine.addProduct(5, 4, 1, "Soda");
            vendingMachine.addProduct(5, 4, 2, "Soda");
            vendingMachine.addProduct(5, 4, 3, "Soda");
            vendingMachine.addProduct(5, 4, 4, "Soda");
            vendingMachine.addProduct(5, 4, 5, "Soda");

            // Filling Column 5 - Horizontally
            vendingMachine.addProduct(1, 5, 0, "Soda");
            vendingMachine.addProduct(1, 5, 1, "Soda");
            vendingMachine.addProduct(1, 5, 2, "Soda");
            vendingMachine.addProduct(1, 5, 3, "Soda");
            vendingMachine.addProduct(1, 5, 4, "Soda");
            vendingMachine.addProduct(1, 5, 5, "Soda");

            vendingMachine.addProduct(2, 5, 0, "Soda");
            vendingMachine.addProduct(2, 5, 1, "Soda");
            vendingMachine.addProduct(2, 5, 2, "Soda");
            vendingMachine.addProduct(2, 5, 3, "Soda");
            vendingMachine.addProduct(2, 5, 4, "Soda");
            vendingMachine.addProduct(2, 5, 5, "Soda");

            vendingMachine.addProduct(3, 5, 0, "Soda");
            vendingMachine.addProduct(3, 5, 1, "Soda");
            vendingMachine.addProduct(3, 5, 2, "Soda");
            vendingMachine.addProduct(3, 5, 3, "Soda");
            vendingMachine.addProduct(3, 5, 4, "Soda");
            vendingMachine.addProduct(3, 5, 5, "Soda");

            vendingMachine.addProduct(4, 5, 0, "Soda");
            vendingMachine.addProduct(4, 5, 1, "Soda");
            vendingMachine.addProduct(4, 5, 2, "Soda");
            vendingMachine.addProduct(4, 5, 3, "Soda");
            vendingMachine.addProduct(4, 5, 4, "Soda");
            vendingMachine.addProduct(4, 5, 5, "Soda");

            vendingMachine.addProduct(5, 5, 0, "Soda");
            vendingMachine.addProduct(5, 5, 1, "Soda");
            vendingMachine.addProduct(5, 5, 2, "Soda");
            vendingMachine.addProduct(5, 5, 3, "Soda");
            vendingMachine.addProduct(5, 5, 4, "Soda");
            vendingMachine.addProduct(5, 5, 5, "Soda");


            // Show all the contents in the Vending Machine
            System.out.println("Vending Machine contents:");
            vendingMachine.display(); // Empty


            // Get some of the products from the vending machine product Inventory
            System.out.println("\nGetting products from the vending machine:");
            System.out.println("1. " + vendingMachine.getProduct(0, 0, 0)); // Get Soda



            // Display what left in the inventory
            System.out.println("\nUpdated Vending Machine Contents:");
            vendingMachine.display();


        }
}
