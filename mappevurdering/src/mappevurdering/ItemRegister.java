package mappevurdering;

import java.util.ArrayList;

/**
 * This class is for the object ItemRegistry.
 * It is an arraylist of items.
 *
 * @author psued
 *
 * @version 1.0.0
 */

public class ItemRegister {
  private static ArrayList<Item> items = new ArrayList<>();

  /**
   * This is the constructor for the ItemRegister class.
   *
   * @param itemNum item number of the item as a String.
   * @param description description of the item as a String.
   * @param price price of the item as an int.
   * @param brand brand of the item as a String.
   * @param weightInKilos weight of the item in kilos as a double.
   * @param length length of the item as a double.
   * @param height height of the item as a double.
   * @param colour colour of the item as a String.
   * @param stockInStore stock of the item in the store as an int.
   * @param category category of the item as an int.
   */



  public static void addItem(String itemNum, String description,
                             int price, String brand, double weightInKilos,
                             double length, double height, String colour, int stockInStore, int category) {
    items.add(new Item(itemNum, description, price, brand, weightInKilos,
              length, height, colour, stockInStore, category));
  }

  private ArrayList<Item> getitemRegister() {
    return items;
  }

  /** Method to remove an item from the arraylist.
   *
   * @param itemNum item number of the item as a String.
   */


  public static void removeItem(String itemNum) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getItemNum().equals(itemNum)) {
        items.remove(i);
      }
    }
  }

  /**
   * Prints the description of every item.
   */

  public String printAllItems() {
    String allItems = "";
    for (int i = 0; i < items.size(); i++) {
      allItems += "\n" + items.get(i).toString();

    }
    return allItems;
  }

  /**
   * Search for an item by item number or either by description.
   *
   * @param itemNumorDescription item number or description of the item as a String.
   */

  public static Item searchItem(String itemNumorDescription) {
    try {
      for (Item item : items) {
        if (item.getItemNum().trim().equalsIgnoreCase(itemNumorDescription) ||
                item.getDescription().trim().equalsIgnoreCase(itemNumorDescription)) {
          return item;
        }
      }
    } catch (Exception e) {
      throw new IllegalArgumentException("Item not found");
    }
    return null;
  }


  /**
   * Increase the stock of an item by amount.
   *
   * @param itemNum item number of the item as a String.
   * @param amount increase stock by amount as an int.
   */

  public static void increaseStock(String itemNum, int amount) {
    for (Item item : items) {
      if (item.getItemNum().equals(itemNum)) {
        item.setStockInStore(item.getStockInStore() + amount);
      }
    }
  }

  /**
   * Decrease the stock of an item by amount.
   *
   * @param itemNum item number of the item as a String.
   * @param amount decrease stock with amount as an int.
   */

  public static void decreaseStock(String itemNum, int amount) {
    for (Item item : items) {
      if (item.getItemNum().equals(itemNum)) {
        item.setStockInStore(item.getStockInStore() - amount);
      }
    }
  }

  /**
   * Deletes an item based on its item number.
   *
   * @param itemNum item number of the item as a String.
   */

  public void deleteItemBasedOnItemNumber(String itemNum) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getItemNum().equals(itemNum)) {
        items.remove(i);
      }
    }
  }

  /**
   * Deletes an item based on its description.
   *
   * @param description description of the item as a String.
   */

  public void deleteItemBasedOnDescription(String description) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i).getDescription().equals(description)) {
        items.remove(i);
      }
    }
  }

  /**
   * changes the price and description based on the itemnumber.
   *
   * @param itemNum item number of the item as a String.
   * @param price price of the item as an int.
   * @param description description of the item as a String.
   */

  public void changeItem(String itemNum, int price, String description) {
    for (Item item : items) {
      if (item.getItemNum().equals(itemNum)) {
        item.setPrice(price);
        item.setDescription(description);
      }
    }
  }

  /**
   * toString method for the ItemRegister class.
   *
   * @return returns the items as a String.
   */

  @Override
  public String toString() {
    return "ItemRegistry{"
            + "items=" + items
            + '}';
  }

}


