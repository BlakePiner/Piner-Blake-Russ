import java.util.Scanner;

public class ActivityThreePiner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = {"C1", "C2", "C3", "R1", "R2"};
        double[] prices = {100.0, 150.0, 200.0, 35.0, 50.0};
        double conversionRate = 56.0;

        System.out.println("Menu:"); 
        for (int i = 0; i < items.length; i++) {
            if (i == 3) {
                System.out.println("\nAdd ons:");
            }
            System.out.println((i + 1) + ". " + items[i] + " Php " + prices[i]);
        }

        System.out.println("\nEnter your order (e.g., 1 4 2 5): "); // getting the order
        String userInput = scanner.nextLine();

        double totalPhp = 0.0;  
        int totalQuantity = 0;
        
        System.out.print("\nOrder Code: ");
        for (int i = 0; i < userInput.length(); i += 2)  { //increment by 2 it is because we put spaces 
            int index = Character.getNumericValue(userInput.charAt(i)) -1 ; //minus one it is because for it to disreguard the space
            totalPhp += prices[index]; //adding the prices
            totalQuantity++; //how many did the user ordered
            System.out.print(items[index] + " ");
        }

        double totalDollar = totalPhp / conversionRate;

        System.out.println("\nTotal Price (Php): Php " + totalPhp);
        System.out.println("Total Price (Dollar): $ " + String.format("%.2f", totalDollar));
        System.out.println("Total Quantity: " + totalQuantity);

        scanner.close();
    }
}
