/**
 * Нөөц (Stock)
 * Тодорхой агуулах дахь барааны одооны үлдэгдлийг төлөөлнө.
 */
public class Stock {

    private int stockId;           // Нөөцийн дугаар
    private Warehouse warehouse;   // Харьяа агуулах
    private Product product;       // Бараа
    private double quantity;       // Одооны үлдэгдэл тоо хэмжээ

    public Stock(int stockId, Warehouse warehouse, Product product, double quantity) {
        this.stockId = stockId;
        this.warehouse = warehouse;
        this.product = product;
        this.quantity = quantity;
    }

    // Нөөц нэмэгдүүлэх (орлого)
    public void increaseQuantity(double amount) { }

    // Нөөц хасах (зарлага)
    public void decreaseQuantity(double amount) { }

    // Нөөцийг шинэчлэх (тооллогын дараа)
    public void updateQuantity(double newQuantity) { }

    // Getters
    public int getStockId()         { return stockId; }
    public Warehouse getWarehouse() { return warehouse; }
    public Product getProduct()     { return product; }
    public double getQuantity()     { return quantity; }
}
