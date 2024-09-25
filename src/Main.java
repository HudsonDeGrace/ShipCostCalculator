import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        String trash = "";
        double shipCost = 0;
        System.out.print("Enter the price of your item: $");
        if(in.hasNextDouble()){
            price = in.nextDouble();
            if(price > 100){
                System.out.println("Your item is more than $100, so shipping is free" +
                        " your total is: $" + price);
            } else{
                shipCost = price * 0.02;
                double total = price + shipCost;
                System.out.println("Your total with shipping is : $" + total);
            }
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("\nYou said your price was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
        }
    }
}