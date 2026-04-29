/**
 * Бараа (Product)
 * Агуулахад хадгалагдах бараа бүтээгдэхүүнийг төлөөлнө.
 */
public class Product {

    private int productId;       // Барааны дугаар
    private String name;         // Барааны нэр
    private String unit;         // Хэмжих нэгж (ширхэг, кг, литр...)
    private String category;     // Ангилал
    private String description;  // Тайлбар

    public Product(int productId, String name, String unit, String category) {
        this.productId = productId;
        this.name = name;
        this.unit = unit;
        this.category = category;
    }

    // Getters & Setters
    public int getProductId()       { return productId; }
    public String getName()         { return name; }
    public String getUnit()         { return unit; }
    public String getCategory()     { return category; }
    public String getDescription()  { return description; }
    public void setName(String n)   { this.name = n; }
    public void setUnit(String u)   { this.unit = u; }
    public void setDescription(String d) { this.description = d; }

    @Override
    public String toString() {
        return "[" + productId + "] " + name + " (" + unit + ")";
    }
}
