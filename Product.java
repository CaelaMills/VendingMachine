public enum Product {;
    private String[][][] products;


    public void VendingMachine(int rows, int cols, int depth) {
        // Declare and dimension a Multi-dimensional array of Strings
        products = new String[rows][cols][depth];
    }
}
