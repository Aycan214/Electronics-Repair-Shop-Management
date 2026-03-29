package electronicgoodsrepairmentshopmgmtsystems;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class RepairOrder {

    private int orderId;
    private int custId;
    private Date orderDate;
    private String status;
    private float totalCost;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public static void add_order(List<RepairOrder> list, int id, int custId, Date orderDate, String status, float totalCost) {
        RepairOrder ro = new RepairOrder();
        ro.setOrderId(id);
        ro.setCustId(custId);
        ro.setOrderDate(orderDate);
        ro.setStatus(status);
        ro.setTotalCost(totalCost);
        list.add(ro);
    }

    public static void list_all_orders(List<RepairOrder> list) {
        for (RepairOrder ro : list) {
            System.out.println(ro.getOrderId() + ", CustID:" + ro.getCustId() + ", " + ro.getStatus() + ", Cost:" + ro.getTotalCost());
        }
    }

    public static void delete_order(List<RepairOrder> list, int id) {
        list.removeIf(ro -> ro.getOrderId() == id);
        System.out.println("Have been succesfuly deleted.");
    }

    public static void edit_order(List<RepairOrder> list, int id, int custId, Date orderDate, String status, float totalCost) {
        for (RepairOrder ro : list) {
            if (ro.getOrderId() == id) {
                ro.setCustId(custId);
                ro.setOrderDate(orderDate);
                ro.setStatus(status);
                ro.setTotalCost(totalCost);
            }
        }
    }

    public static void backup_orders(List<RepairOrder> list) {
        System.out.println("Orders have been backed up.");
    }

    public static void restore_orders(List<RepairOrder> list) {
        System.out.println("Orders have been restored.");
    }
}