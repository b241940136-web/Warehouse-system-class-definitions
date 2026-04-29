import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Падааны мөр (VoucherItem)
 * Орлого эсвэл зарлагын падааны нэг барааны мөрийг төлөөлнө.
 */
class VoucherItem {

    private Product product;    // Бараа
    private double quantity;    // Тоо хэмжээ

    public VoucherItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct()   { return product; }
    public double getQuantity()   { return quantity; }
}

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Орлогын падаан (ReceiptVoucher)
 * Нярав барааг хүлээн авахад үйлддэг баримт бичиг.
 * Хүлээн авсан бараа, тоо ширхэг, хүлээлгэн өгсөн хүн, огноо тусгагдана.
 */
class ReceiptVoucher {

    private int voucherId;              // Падааны дугаар
    private Warehouse warehouse;        // Агуулах
    private Storekeeper storekeeper;    // Нярав
    private String sender;             // Хүлээлгэн өгсөн хүн
    private LocalDate receiptDate;     // Хүлээн авсан огноо
    private List<VoucherItem> items;   // Барааны жагсаалт

    public ReceiptVoucher(int voucherId, Warehouse warehouse,
                          Storekeeper storekeeper, String sender, LocalDate receiptDate) {
        this.voucherId = voucherId;
        this.warehouse = warehouse;
        this.storekeeper = storekeeper;
        this.sender = sender;
        this.receiptDate = receiptDate;
        this.items = new ArrayList<>();
    }

    // Падаанд мөр нэмэх
    public void addItem(VoucherItem item) { }

    // Падаан хэвлэх
    public void print() { }

    // Getters
    public int getVoucherId()               { return voucherId; }
    public Warehouse getWarehouse()         { return warehouse; }
    public Storekeeper getStorekeeper()     { return storekeeper; }
    public String getSender()               { return sender; }
    public LocalDate getReceiptDate()       { return receiptDate; }
    public List<VoucherItem> getItems()     { return items; }
}

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Зарлагын падаан (IssueVoucher)
 * Нярав барааг зарлагаар гаргахад үйлддэг баримт бичиг.
 * Зарлагадсан бараа, тоо ширхэг, хүлээн авсан хүн, огноо тусгагдана.
 */
class IssueVoucher {

    private int voucherId;              // Падааны дугаар
    private Warehouse warehouse;        // Агуулах
    private Storekeeper storekeeper;    // Нярав
    private String receiver;           // Хүлээн авсан хүн
    private LocalDate issueDate;       // Зарлагадсан огноо
    private List<VoucherItem> items;   // Барааны жагсаалт

    public IssueVoucher(int voucherId, Warehouse warehouse,
                        Storekeeper storekeeper, String receiver, LocalDate issueDate) {
        this.voucherId = voucherId;
        this.warehouse = warehouse;
        this.storekeeper = storekeeper;
        this.receiver = receiver;
        this.issueDate = issueDate;
        this.items = new ArrayList<>();
    }

    // Падаанд мөр нэмэх
    public void addItem(VoucherItem item) { }

    // Падаан хэвлэх
    public void print() { }

    // Getters
    public int getVoucherId()               { return voucherId; }
    public Warehouse getWarehouse()         { return warehouse; }
    public Storekeeper getStorekeeper()     { return storekeeper; }
    public String getReceiver()             { return receiver; }
    public LocalDate getIssueDate()         { return issueDate; }
    public List<VoucherItem> getItems()     { return items; }
}
