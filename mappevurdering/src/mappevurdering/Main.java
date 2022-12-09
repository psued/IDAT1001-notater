package mappevurdering;

import mappevurdering.Inputverifier;


import java.util.InputMismatchException;
import java.util.Objects;

public class Main {
  public static void main(String[] args) {
    ItemRegister itemRegister = new ItemRegister();

    while (true) {
      System.out.println("""
              What operation do you want to execute?
              (1) Add item
              (2) Search for an item
              (3) Remove an item
              (4) Increase stock
              (5) Decrease stock
              (6) Print all items
              (7) Exit""");
      int choice = 0;

      try {
        choice = mappevurdering.Inputverifier.choiceVerifier(1, 7);
      } catch (NumberFormatException e) {
        System.out.println("You must enter a number");
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      }

      switch (choice) {
        case 1 -> {
          String itemNum = null;
          String description = null;
          int price = 0;
          String brand = null;
          double weight = 0;
          double length = 0;
          double height = 0;
          String color = null;
          int stock = 0;
          int category = 0;
          while (true) {
            try {
              System.out.println("Enter item number");
              itemNum = mappevurdering.Inputverifier.stringVerifier();

              System.out.println("Enter description");
              description = mappevurdering.Inputverifier.stringVerifier();

              System.out.println("Enter price");
              price = mappevurdering.Inputverifier.integerCanBeZeroVerifier();

              System.out.println("Enter brand");
              brand = mappevurdering.Inputverifier.stringVerifier();

              System.out.println("Enter weight");
              weight = mappevurdering.Inputverifier.doubleVerifier();

              System.out.println("Enter length");
              length = mappevurdering.Inputverifier.doubleVerifier();

              System.out.println("Enter height");
              height = mappevurdering.Inputverifier.doubleVerifier();

              System.out.println("Enter Color");
              color = mappevurdering.Inputverifier.stringVerifier();

              System.out.println("Enter stock");
              stock = mappevurdering.Inputverifier.integerCanBeZeroVerifier();

              System.out.println("Enter category");
              category = mappevurdering.Inputverifier.choiceVerifier(1, 4);
            } catch (NumberFormatException e) {
              System.out.println(e.getMessage());
              continue;
            } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
              continue;
            }


            ItemRegister.addItem(itemNum, description, price, brand, weight, length, height, color, stock, category);
            break;
          }
        }
        case 2 -> {
          System.out.println("Please enter either item number or description");
          String search = null;
          try {
            search = Inputverifier.stringVerifier();
          } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
          } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
          }
          System.out.println(Objects.requireNonNull(ItemRegister.searchItem(search)).toString());
        }
        case 3 -> {
          System.out.println("Please enter the item number of the item you want to remove");
          String itemNum = null;
          try {
            itemNum = Inputverifier.stringVerifier();
          } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
          } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
          }
          ItemRegister.removeItem(itemNum);
        }
        case 4 -> {
          System.out.println("Please enter the item number of the item you want to increase stock of");
          String itemNum = null;
          int amount = 0;
          try {
            itemNum = Inputverifier.stringVerifier();
            System.out.println("Please enter the amount you want to increase stock with");
            amount = Inputverifier.integerCanBeZeroVerifier();
          } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
          } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
          }

          ItemRegister.increaseStock(itemNum, amount);
          System.out.println(itemNum + " stock increased by " + amount);
          System.out.println("Current stock" + Objects.requireNonNull(ItemRegister.searchItem(itemNum)).getStockInStore());
        }
        case 5 -> {
          System.out.println("Please enter the amount you want to decrease stock with");
          String itemNum = null;
          int amount = 0;
          try {
            itemNum = Inputverifier.stringVerifier();
            System.out.println("Please enter the amount you want to decrease stock with");
            amount = Inputverifier.integerCanBeZeroVerifier();
          } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
          } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
          }
          ItemRegister.decreaseStock(itemNum, amount);
          System.out.println(itemNum + " stock decreased by " + amount);
          System.out.println("Current stock" + Objects.requireNonNull(ItemRegister.searchItem(itemNum)).getStockInStore());
        }
        case 6 -> {
          System.out.println(itemRegister.printAllItems());
        }
        case 7 -> {
          System.out.println("Exiting program...");
          System.exit(0);
        }

        default -> {
          continue;
        }
      }
    }
  }
}


