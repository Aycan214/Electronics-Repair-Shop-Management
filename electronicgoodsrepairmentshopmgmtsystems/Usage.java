package electronicgoodsrepairmentshopmgmtsystems;

import java.util.List;
import java.util.Date;

public class Usage {

    private int usageId;
    private int itemId;
    private int partId;
    private int quantityUsed;
    private Date usageDate;

    public int getUsageId() {
        return usageId;
    }

    public void setUsageId(int usageId) {
        this.usageId = usageId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

    public int getQuantityUsed() {
        return quantityUsed;
    }

    public void setQuantityUsed(int quantityUsed) {
        this.quantityUsed = quantityUsed;
    }

    public Date getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }

    public static void add_usage(List<Usage> list, int id, int itemId, int partId, int quantityUsed, Date usageDate) {
        Usage u = new Usage();
        u.setUsageId(id);
        u.setItemId(itemId);
        u.setPartId(partId);
        u.setQuantityUsed(quantityUsed);
        u.setUsageDate(usageDate);
        list.add(u);
    }

    public static void list_all_usages(List<Usage> list) {
        for (Usage u : list) {
            System.out.println(u.getUsageId() + ", ItemID:" + u.getItemId() + ", PartID:" + u.getPartId() + ", Qty:" + u.getQuantityUsed() + ", Date:" + u.getUsageDate());
        }
    }

    public static void delete_usage(List<Usage> list, int id) {
        list.removeIf(u -> u.getUsageId() == id);
        System.out.println("Have been succesfuly deleted.");
    }

    public static void edit_usage(List<Usage> list, int id, int itemId, int partId, int quantityUsed, Date usageDate) {
        for (Usage u : list) {
            if (u.getUsageId() == id) {
                u.setItemId(itemId);
                u.setPartId(partId);
                u.setQuantityUsed(quantityUsed);
                u.setUsageDate(usageDate);
            }
        }
    }

    public static void backup_usages(List<Usage> list) {
        System.out.println("Usages have been backed up.");
    }

    public static void restore_usages(List<Usage> list) {
        System.out.println("Usages have been restored.");
    }
}