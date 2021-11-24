import org.apache.juneau.annotation.Beanc;

public class Product
{
    private String Name;
    private int price;
    private String color;
    private String [] sellerName;

    @Beanc(properties="name,price,color,sellerName")
    public Product(String name, int price, String color, String[] sellerName)
    {
        Name = name;
        this.price = price;
        this.color = color;
        this.sellerName = sellerName;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String[] getSellerName() {
        return sellerName;
    }
}
