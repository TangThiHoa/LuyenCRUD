package model;

public class Order {
    private int id ;
    private int time ;
    private int total;
    private Customer customerId;

    public Order() {
    }

    public Order(int id, int time, int total, Customer customer) {
        this.id = id;
        this.time = time;
        this.total = total;
        this.customerId = customerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }
}
