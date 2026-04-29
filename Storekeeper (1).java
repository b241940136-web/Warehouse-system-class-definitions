import java.time.LocalDate;
import java.util.List;

/**
 * Нярав (Storekeeper)
 * Агуулахыг хариуцах ажилтан.
 * Орлого, зарлага, тооллого хийх, тайлан харах үйлдлүүдийг гүйцэтгэнэ.
 */
public class Storekeeper {

    private int storekeeperID;     // Няравын дугаар
    private String fullName;       // Бүтэн нэр
    private String username;       // Нэвтрэх нэр
    private String password;       // Нууц үг
    private Warehouse warehouse;   // Хариуцсан агуулах

    public Storekeeper(int storekeeperID, String fullName, String username, String password) {
        this.storekeeperID = storekeeperID;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    /**
     * Орлогот хүлээн авах — Орлогын падаан үйлдэнэ
     * @param items    хүлээн авсан бараа, тоо ширхэгийн жагсаалт
     * @param sender   хүлээлгэн өгсөн хүн
     * @param date     хүлээн авсан огноо
     * @return         үйлдэгдсэн Орлогын падаан
     */
    public ReceiptVoucher receiveGoods(List<VoucherItem> items, String sender, LocalDate date) {
        return null;
    }

    /**
     * Зарлагаар гаргах — Зарлагын падаан үйлдэнэ
     * @param items    зарлагадсан бараа, тоо ширхэгийн жагсаалт
     * @param receiver хүлээн авсан хүн
     * @param date     зарлагадсан огноо
     * @return         үйлдэгдсэн Зарлагын падаан
     */
    public IssueVoucher issueGoods(List<VoucherItem> items, String receiver, LocalDate date) {
        return null;
    }

    /**
     * Нөөцийн тайлан харах — бүх барааны үлдэгдэл
     * @param productIds  шүүх бараануудын ID (хоосон бол бүгдийг харна)
     * @return            нөөцийн тайлан
     */
    public StockReport viewStockReport(List<Integer> productIds) {
        return null;
    }

    /**
     * Няравын тайлан харах — огноогоор шүүсэн орлого/зарлага/үлдэгдэл
     * @param startDate   тайлангийн эхлэх огноо
     * @param endDate     тайлангийн дуусах огноо
     * @param productIds  шүүх бараануудын ID (хоосон бол бүгдийг харна)
     * @return            няравын тайлан
     */
    public StorekeeperReport viewStorekeeperReport(LocalDate startDate, LocalDate endDate,
                                                    List<Integer> productIds) {
        return null;
    }

    /**
     * Тооллого хийх — нэг бараагаар
     * @param productId   тооллого хийх барааны ID
     * @param actualQty   бодит тоо хэмжээ
     * @param date        тооллого хийсэн огноо
     * @return            тооллогын бичлэг
     */
    public InventoryCount performInventoryCount(int productId, double actualQty, LocalDate date) {
        return null;
    }

    // Getters & Setters
    public int getStorekeeperID()       { return storekeeperID; }
    public String getFullName()         { return fullName; }
    public String getUsername()         { return username; }
    public Warehouse getWarehouse()     { return warehouse; }
    public void setWarehouse(Warehouse w) { this.warehouse = w; }
}
