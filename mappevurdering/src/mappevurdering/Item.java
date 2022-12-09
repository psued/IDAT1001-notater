package mappevurdering;

/**This class is for the object Item.
 * Getters are utilized for every variable.
 * Setters are utilized for every variable that is not final.
 * It contains the toString method.
 *
 * @author psued
 *
 * @version 1.0.0
 */
public class Item {
  /**
   * The item number of the item.
   */
  private final String itemNum;
  private String description;
  private int price;
  private final String brand;
  private final double weightInKilos;
  private final double length;
  private final double height;
  private final String colour;

  private int stockInStore;
  private final int category;


  /**
   * This is the constructor for the Item class.
   *
   * @param itemNum The item number of the item.
   * @param description The description of the item.
   * @param price The price of the item.
   * @param brand The brand of the item.
   * @param weightInKilos The weight of the item in kilos.
   * @param length The length of the item.
   * @param height The height of the item.
   * @param colour The colour of the item.
   * @param stockInStore The stock of the item in the store.
   * @param category The category of the item.
   */

  public Item(String itemNum, String description, int price, String brand, double weightInKilos,
              double length, double height, String colour, int stockInStore, int category) {
    this.itemNum = itemNum;
    this.description = description;
    this.price = price;
    this.brand = brand;
    this.weightInKilos = weightInKilos;
    this.length = length;
    this.height = height;
    this.colour = colour;
    this.stockInStore = stockInStore;
    this.category = category;
  }

  /** Getter for item number.
   *
   * @return returns item number as a string.
   */
  public String getItemNum() {
    return itemNum;
  }

  /**Getter for description.
   *
   * @return returns description as a string.
   */

  public String getDescription() {
    return description;
  }

  /** getter for price.
   *
   * @return returns price as an integer.
   */

  public int getPrice() {
    return price;
  }

  /** getter for brand.
   *
   * @return returns brand as a string.
   */

  public String getBrand() {
    return brand;
  }

  /** getter for weight in kilos.
   *
   * @return returns weight in kilos as a double.
   */

  public double getWeightInKilos() {
    return weightInKilos;
  }

  /** getter for length.
   *
   * @return returns length as a double.
   */

  public double getLength() {
    return length;
  }

  /** getter for height.
   *
   * @return returns height as a double.
   */

  public double getHeight() {
    return height;
  }

  /** getter for colour.
   *
   * @return returns colour as a string.
   */

  public String getColour() {
    return colour;
  }

  /** getter for stock in store.
   *
   * @return returns stock in store as an integer.
   */

  public int getStockInStore() {
    return stockInStore;
  }

  /** getter for category.
   *
   * @return returns category as an integer.
   */

  public int getCategory() {
    return category;
  }

  /** getter for description.
   *
   * @param stockInStore sets stock in store as an integer.
   */

  public void setStockInStore(int stockInStore) {
    this.stockInStore = stockInStore;
  }

  /** getter for description.
   *
   * @param price sets price as an integer.
   */

  public void setPrice(int price) {
    this.price = price;
  }

  /** getter for description.
   *
   * @param description  sets description as a string.
   */

  public void setDescription(String description) {
    this.description = description;
  }

  /** getter for description.
   *
   * @return returns item number, description, price,
   *      brand, weight in kilos, length, height, colour,
   *      stock in store and category as a string.
   */

  @Override
  public String toString() {
    return "Item{"
            + "itemNum='" + itemNum + '\''
            + ", description='" + description + '\''
            + ", price=" + price
            + ", brand='" + brand + '\''
            + ", weightInKilos=" + weightInKilos
            + ", length=" + length
            + ", height=" + height
            + ", colour='" + colour + '\''
            + ", stockInStore=" + stockInStore
            + ", category=" + category
            + '}';
  }

}

