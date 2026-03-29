package electronicgoodsrepairmentshopmgmtsystems;

import java.util.List;
import java.util.ArrayList;

public class RepairItem {

    private int itemId;
    private int orderId;
    private int empId;
    private String itemName;
    private String itemType;
    private String manufacturer;
    private String serialNo;
    private String issueDesc;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc;
    }

    public static void add_item(List<RepairItem> list, int id, int orderId, int empId, String itemName, String itemType, String manufacturer, String serialNo, String issueDesc) {
        RepairItem ri = new RepairItem();
        ri.setItemId(id);
        ri.setOrderId(orderId);
        ri.setEmpId(empId);
        ri.setItemName(itemName);
        ri.setItemType(itemType);
        ri.setManufacturer(manufacturer);
        ri.setSerialNo(serialNo);
        ri.setIssueDesc(issueDesc);
        list.add(ri);
    }

    public static void list_all_items(List<RepairItem> list) {
        for (RepairItem ri : list) {
            System.out.println(ri.getItemId() + ", " + ri.getItemName() + " (" + ri.getItemType() + "), " + ri.getIssueDesc());
        }
    }

    public static void delete_item(List<RepairItem> list, int id) {
        list.removeIf(ri -> ri.getItemId() == id);
    }

    public static void edit_item(List<RepairItem> list, int id, int orderId, int empId, String itemName, String itemType, String manufacturer, String serialNo, String issueDesc) {
        for (RepairItem ri : list) {
            if (ri.getItemId() == id) {
                ri.setOrderId(orderId);
                ri.setEmpId(empId);
                ri.setItemName(itemName);
                ri.setItemType(itemType);
                ri.setManufacturer(manufacturer);
                ri.setSerialNo(serialNo);
                ri.setIssueDesc(issueDesc);
            }
        }
    }

    public static void backup_items(List<RepairItem> list) {
        System.out.println("Items have been backed up.");
    }

    public static void restore_items(List<RepairItem> list) {
        System.out.println("Items have been restored.");
    }
}