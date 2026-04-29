import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Нөөцийн тайлангийн мөр (StockReportLine)
 * Нэг барааны одооны үлдэгдлийг тайланд дүрслэнэ.
 */
class StockReportLine {

    private Product product;       // Бараа
    private double currentQty;    // Одооны үлдэгдэл

    public StockReportLine(Product product, double currentQty) {
        this.product = product;
        this.currentQty = currentQty;
    }

    public Product getProduct()     { return product; }
    public double getCurrentQty()   { return currentQty; }
}

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Нөөцийн тайлан (StockReport)
 * Агуулахын бүх бараа буюу сонгосон барааны одооны үлдэгдлийг харуулна.
 */
class StockReport {

    private Warehouse warehouse;           // Агуулах
    private LocalDate reportDate;         // Тайлан үүсгэсэн огноо
    private List<StockReportLine> lines;  // Тайлангийн мөрүүд

    public StockReport(Warehouse warehouse, LocalDate reportDate) {
        this.warehouse = warehouse;
        this.reportDate = reportDate;
        this.lines = new ArrayList<>();
    }

    // Тайлан мөр нэмэх
    public void addLine(StockReportLine line) { }

    // Тайлан хэвлэх / харуулах
    public void display() { }

    // Getters
    public Warehouse getWarehouse()             { return warehouse; }
    public LocalDate getReportDate()            { return reportDate; }
    public List<StockReportLine> getLines()     { return lines; }
}

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Няравын тайлангийн мөр (StorekeeperReportLine)
 * Нэг барааны тайлангийн хугацаан дахь хөдөлгөөний мэдээлэл.
 */
class StorekeeperReportLine {

    private Product product;        // Бараа
    private double openingQty;     // Эхний үлдэгдэл
    private double totalReceipt;   // Нийт орлого
    private double totalIssue;     // Нийт зарлага
    private double closingQty;     // Эцсийн үлдэгдэл

    public StorekeeperReportLine(Product product, double openingQty,
                                  double totalReceipt, double totalIssue) {
        this.product = product;
        this.openingQty = openingQty;
        this.totalReceipt = totalReceipt;
        this.totalIssue = totalIssue;
        this.closingQty = openingQty + totalReceipt - totalIssue;
    }

    // Getters
    public Product getProduct()     { return product; }
    public double getOpeningQty()   { return openingQty; }
    public double getTotalReceipt() { return totalReceipt; }
    public double getTotalIssue()   { return totalIssue; }
    public double getClosingQty()   { return closingQty; }
}

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Няравын тайлан (StorekeeperReport)
 * Сонгосон огноон хоорондын орлого, зарлага, эхний/эцсийн үлдэгдлийг харуулна.
 */
class StorekeeperReport {

    private Warehouse warehouse;                 // Агуулах
    private Storekeeper storekeeper;            // Нярав
    private LocalDate startDate;               // Эхлэх огноо
    private LocalDate endDate;                 // Дуусах огноо
    private List<StorekeeperReportLine> lines; // Тайлангийн мөрүүд

    public StorekeeperReport(Warehouse warehouse, Storekeeper storekeeper,
                              LocalDate startDate, LocalDate endDate) {
        this.warehouse = warehouse;
        this.storekeeper = storekeeper;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lines = new ArrayList<>();
    }

    // Тайлан мөр нэмэх
    public void addLine(StorekeeperReportLine line) { }

    // Тайлан хэвлэх / харуулах
    public void display() { }

    // Getters
    public Warehouse getWarehouse()                     { return warehouse; }
    public Storekeeper getStorekeeper()                 { return storekeeper; }
    public LocalDate getStartDate()                     { return startDate; }
    public LocalDate getEndDate()                       { return endDate; }
    public List<StorekeeperReportLine> getLines()       { return lines; }
}

// ─────────────────────────────────────────────────────────────────────────────
/**
 * Тооллогын бичлэг (InventoryCount)
 * Нярав тодорхой барааг тооллоход үүсдэг баримт.
 * Бодит тоо ба байвал зохих үлдэгдлийн зөрүүг илүүдэл/дутагдал болгон бүртгэнэ.
 */
class InventoryCount {

    private int countId;             // Тооллогын дугаар
    private Warehouse warehouse;     // Агуулах
    private Storekeeper storekeeper; // Нярав
    private Product product;         // Тооллого хийсэн бараа
    private LocalDate countDate;    // Тооллого хийсэн огноо
    private double expectedQty;     // Байвал зохих үлдэгдэл
    private double actualQty;       // Бодит тоо хэмжээ
    private double difference;      // Зөрүү (+ илүүдэл, - дутагдал)

    public InventoryCount(int countId, Warehouse warehouse, Storekeeper storekeeper,
                          Product product, LocalDate countDate,
                          double expectedQty, double actualQty) {
        this.countId = countId;
        this.warehouse = warehouse;
        this.storekeeper = storekeeper;
        this.product = product;
        this.countDate = countDate;
        this.expectedQty = expectedQty;
        this.actualQty = actualQty;
        this.difference = actualQty - expectedQty;
    }

    // Тооллогын үр дүнг барааны нөөцт хэрэгжүүлэх
    public void applyToStock() { }

    // Тооллогын протокол хэвлэх
    public void print() { }

    // Getters
    public int getCountId()              { return countId; }
    public Product getProduct()          { return product; }
    public LocalDate getCountDate()      { return countDate; }
    public double getExpectedQty()       { return expectedQty; }
    public double getActualQty()         { return actualQty; }
    public double getDifference()        { return difference; }
    public boolean isSurplus()           { return difference > 0; }
    public boolean isShortage()          { return difference < 0; }
}
