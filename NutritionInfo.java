// NutritionInfo.java
public class NutritionInfo
{
    // Properties
    private String name;
    private double fat;
    private double carbs;
    private double protein;

    // Constructor

    public NutritionInfo(String name, double fat, double carbs, double protein) {
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }


    // Getters and Setters
    public String getName()
    {
        return name;
    }


    public void setName (String name)
    {
        this.name = name;
    }


    public double getFat()
    {
        return fat;
    }


    public void setFat (double fat)
    {
        this.fat = fat;
    }


    public double getCarbs()
    {
        return carbs;
    }


    public void setCarbs (double carbs)
    {
        this.carbs = carbs;
    }


    public double getProtein()
    {
        return protein;
    }


    public void setProtein (double protein)
    {
        this.protein = protein;
    }


    public void protein() {
    }


    public void carbs() {
    }


    public void fat() {
    }


    // Method for testing
    public static void main (String[]args) {
        NutritionInfo item1 = new NutritionInfo ("Soda", 0.0, 70.0, 0.0);
        item1.fat ();
        item1.carbs ();
        item1.protein ();

        public static double getCalories(double numServings) {
            // Calorie formula

            double numServings = 0;
            double calories = ((item1.fat * 9) + (item1.carbs * 4) + (item1.protein * 4)) * numServings;
            return calories;
        }


        System.out.println ("Nutritional information per serving of " + item1.getName () + ":");
        System.out.printf ("   Fat: %.2f g\n", item1.getFat ());
        System.out.printf ("   Carbohydrates: %.2f g\n", item1.getCarbs ());
        System.out.printf ("   Protein: %.2f g\n", item1.getProtein ());

    }
}
