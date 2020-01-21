package Service;

public class ItemService {

    private String itemName;
    private double itemCP;
    private double itemSP;
    private int quantity;



    public ItemService(String itemName, double itemCP, double itemSP, int quantity) {
        this.itemName = itemName;
        this.itemCP = itemCP;
        this.itemSP = itemSP;
        this.quantity = quantity;
    }




    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCP() {
        return itemCP;
    }

    public void setItemCP(double itemCP) {
        this.itemCP = itemCP;
    }

    public double getItemSP() {
        return itemSP;
    }

    public void setItemSP(double itemSP) {
        this.itemSP = itemSP;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /*
     * Print the inventory format
     */

    public void printRow() {
        System.out.printf("%s %f, %f, %d", itemName, itemCP, itemSP, quantity);
        System.out.println();
    }
}
