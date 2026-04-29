import java.util.List;
import java.util.ArrayList;

/**
 * Агуулах (Warehouse)
 * Байгууллагын нэг агуулахыг төлөөлнө.
 * Нярав агуулахтай холбоотой бөгөөд бараанууд агуулахад хадгалагдана.
 */
public class Warehouse {

    private int warehouseId;           // Агуулахын дугаар
    private String name;               // Агуулахын нэр
    private String location;           // Хаяг / байршил
    private Storekeeper storekeeper;   // Хариуцсан нярав
    private List<Stock> stocks;        // Агуулахын барааны нөөц

    public Warehouse(int warehouseId, String name, String location) {
        this.warehouseId = warehouseId;
        this.name = name;
        this.location = location;
        this.stocks = new ArrayList<>();
    }

    // Агуулахад нярав томилох
    public void assignStorekeeper(Storekeeper storekeeper) { }

    // Барааны нөөц нэмэх
    public void addStock(Stock stock) { }

    // Агуулахын бүх нөөцийг авах
    public List<Stock> getAllStocks() { return null; }

    // Тодорхой барааны нөөцийг хайх
    public Stock findStock(int productId) { return null; }

    // Getters & Setters
    public int getWarehouseId()             { return warehouseId; }
    public String getName()                 { return name; }
    public String getLocation()             { return location; }
    public Storekeeper getStorekeeper()     { return storekeeper; }
    public List<Stock> getStocks()          { return stocks; }
}
