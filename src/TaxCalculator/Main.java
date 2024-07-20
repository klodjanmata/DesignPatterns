package TaxCalculator;

public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator2023();
        System.out.println("Your taxes for 2023: " + taxCalculator.calculateTax());
        taxCalculator = new TaxCalculator2024();
        System.out.println("Your taxes for 2024: " + taxCalculator.calculateTax());

    }
}
