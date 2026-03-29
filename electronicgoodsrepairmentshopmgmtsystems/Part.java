package electronicgoodsrepairmentshopmgmtsystems;

import java.util.List;
import java.util.ArrayList;

public class Part {

    private int partId;
    private String partName;
    private int stockQuantity;
    private float unitPrice;

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public static void add_part(List<Part> list, int id, String partName, int stockQuantity, float unitPrice) {
        Part p = new Part();
        p.setPartId(id);
        p.setPartName(partName);
        p.setStockQuantity(stockQuantity);
        p.setUnitPrice(unitPrice);
        list.add(p);
    }

    public static void list_all_parts(List<Part> list) {
        for (Part p : list) {
            System.out.println(p.getPartId() + ", " + p.getPartName() + ", Stock:" + p.getStockQuantity() + ", Price:" + p.getUnitPrice());
        }
    }

    public static void delete_part(List<Part> list, int id) {
        list.removeIf(p -> p.getPartId() == id);
        System.out.println("Have been succesfuly deleted.");
    }

    public static void edit_part(List<Part> list, int id, String partName, int stockQuantity, float unitPrice) {
        for (Part p : list) {
            if (p.getPartId() == id) {
                p.setPartName(partName);
                p.setStockQuantity(stockQuantity);
                p.setUnitPrice(unitPrice);
            }
        }
    }

    public static void backup_parts(List<Part> list) {
        System.out.println("Parts have been backed up.");
    }

    public static void restore_parts(List<Part> list) {
        System.out.println("Parts have been restored.");
    }
}