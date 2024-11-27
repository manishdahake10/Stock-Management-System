import java.util.ArrayList;
import java.util.Scanner;

public class StockManagementSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an empty ArrayList to hold the stocks
        ArrayList<Stock> stocks = new ArrayList<>();

        // Display the menu and ask for user input
        int choice;
        do {
            System.out.println("1. Add stock");
            System.out.println("2. Remove stock");
            System.out.println("3. Buy stock");
            System.out.println("4. Sell stock");
            System.out.println("5. View stock");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Ask for stock details to add
                    System.out.print("Enter the stock name: ");
                    String name = input.next();
                    System.out.print("Enter the stock quantity: ");
                    int quantity = input.nextInt();
                    System.out.print("Enter the stock price: ");
                    double price = input.nextDouble();

                    // Create a new Stock object and add it to the ArrayList
                    Stock newStock = new Stock(name, quantity, price);
                    stocks.add(newStock);

                    System.out.println("Stock added successfully.");
                    break;

                case 2:
                    // Ask for the stock name and quantity to remove
                    System.out.print("Enter the stock name: ");
                    String stockNameToRemove = input.next();
                    System.out.print("Enter the quantity to remove: ");
                    int removeQuantity = input.nextInt();

                    // Loop through the stocks to find the matching stock
                    boolean stockFoundForRemove = false;
                    for (Stock stock : stocks) {
                        if (stock.getName().equals(stockNameToRemove)) {
                            // If the stock is found, remove the specified quantity
                            stockFoundForRemove = true;
                            stock.removeQuantity(removeQuantity);
                            System.out.println("Stock removed successfully.");
                            break;
                        }
                    }
                    if (!stockFoundForRemove) {
                        System.out.println("Stock not found.");
                    }
                    break;

                case 3:
                    // Ask for the stock name and quantity to buy
                    System.out.print("Enter the stock name to buy: ");
                    String stockNameToBuy = input.next();
                    System.out.print("Enter the quantity to buy: ");
                    int buyQuantity = input.nextInt();

                    // Loop through the stocks to find the matching stock
                    boolean stockFoundForBuy = false;
                    for (Stock stock : stocks) {
                        if (stock.getName().equals(stockNameToBuy)) {
                            // If the stock is found, add the specified quantity to it
                            stockFoundForBuy = true;
                            stock.buyQuantity(buyQuantity);
                            System.out.println("Stock bought successfully.");
                            break;
                        }
                    }
                    if (!stockFoundForBuy) {
                        System.out.println("Stock not found.");
                    }
                    break;

                case 4:
                    // Ask for the stock name and quantity to sell
                    System.out.print("Enter the stock name to sell: ");
                    String stockNameToSell = input.next();
                    System.out.print("Enter the quantity to sell: ");
                    int sellQuantity = input.nextInt();

                    // Loop through the stocks to find the matching stock
                    boolean stockFoundForSell = false;
                    for (Stock stock : stocks) {
                        if (stock.getName().equals(stockNameToSell)) {
                            // If the stock is found, sell the specified quantity
                            stockFoundForSell = true;
                            stock.sellQuantity(sellQuantity);
                            System.out.println("Stock sold successfully.");
                            break;
                        }
                    }
                    if (!stockFoundForSell) {
                        System.out.println("Stock not found.");
                    }
                    break;

                case 5:
                    // Display the list of stocks
                    System.out.println("Current stocks:");
                    for (Stock stock : stocks) {
                        System.out.println(stock.toString());
                    }
                    break;

                case 6:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }

        } while (choice != 6);

        input.close();
    }
}

class Stock {
    private String name;
    private int quantity;
    private double price;

    public Stock(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void removeQuantity(int quantityToRemove) {
        if (quantityToRemove <= quantity) {
            quantity -= quantityToRemove;
        } else {
            System.out.println("Not enough quantity to remove.");
        }
    }

    public void buyQuantity(int quantityToBuy) {
        quantity += quantityToBuy;
    }

    public void sellQuantity(int quantityToSell) {
        if (quantityToSell <= quantity) {
            quantity -= quantityToSell;
            double totalSale = quantityToSell * price;
            System.out.println("Total sale amount: $" + totalSale);
        } else {
            System.out.println("Not enough quantity to sell.");
        }
    }

    public String toString() {
        return name + ", quantity: " + quantity + ", price: $" + price;
    }
}
