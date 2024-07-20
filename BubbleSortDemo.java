/**
 * Program to sort products based on their prices in descending order
 */


package arraysdemo;

public class BubbleSortDemo {

    // Utility method to print products and their prices
    public static void printProductsAndPrices(String[] names, double[] prices) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": $" + prices[i]);
        }
        System.out.println();
    }

    public static void bubbleSortByPricesDescending(String[] names, double[] prices){
        boolean swapped;
        int n  = prices.length;

        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(prices[j] < prices[j+1]){
                    double  tempPrice = prices[j];
                    prices[j]=prices[j+1];
                    prices[j+1]=tempPrice;

                    String tempName = names[j];
                    names[j]=names[j+1];
                    names[j+1] = tempName;

                    swapped=true;
                }
            }
            if(!swapped)break;
        }
    }

    public static void main(String[] args) {
        // Array of product names
        String[] products = { "Headphones","Smartphone", "Tablet","Laptop", "Smartwatch"};
        // Corresponding array of product prices
        double[] prices = { 149.99,799.99,399.99,999.99,199.99};

        System.out.println("Unsorted products and prices:");
        printProductsAndPrices(products, prices);

        bubbleSortByPricesDescending(products,prices);

        System.out.println("Sorted");

        printProductsAndPrices(products,prices);

    }
}
