import java.util.*;

class Product 
{  //Encapsulation (Private, Protected, Getters, and Setters)
    private String productId;
    private String productName;
    protected int quantity; 
    private double price;

    public Product(String productId, String productName, int quantity, double price) 
    {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() 
    {
        return productId;
    }

    public String getProductName() 
    {
        return productName;
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public double getPrice() 
    {
        return price;
    }
}

class PerishableProduct extends Product 
{ //Inheritance 
    public String expirationDate;

    public PerishableProduct(String productId, String productName, int quantity, double price, String expirationDate) 
    {
        super(productId, productName, quantity, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() 
    {
        return expirationDate;
    }

    public int updateStock(int amount) //Polymorphism

    {
        if (amount < 0)
        {
            throw new InvalidQuantityException("Quantity cannot be negative");
        }

        if (quantity + amount > 100)
        {
            throw new RuntimeException("Cannot exceed maximum quantity of 100 for perishable products");
        }
        
        quantity += amount;
        return quantity;
    }
    
    public int removeStock(int amount) 
    {
        if (quantity - amount >= 0)
           return quantity -= amount;
        else
        {
           throw new InsufficientStockException("insufficient stock for product apple");
        }   
    }
}

class NonPerishableProduct extends Product 
{
    public int shelfLife;

    public NonPerishableProduct(String productId, String productName, int quantity, double price, int shelfLife) 
    {
        super(productId, productName, quantity, price);
        this.shelfLife = shelfLife;
    }

    //@Override
    public int updateStock(int amount) //Polymorphism
    {
        if (amount < 0)
        {
            throw new InvalidQuantityException("Quantity cannot be negative");
        }
        quantity += amount;
        return quantity;
    }
}

interface InventoryOperation //Abstraction Interface
{
    void addProduct(Product product);
    void removeProduct(String productId);
}

class Inventory implements InventoryOperation 
{
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) 
    {
        products.add(product);
    }

    public void removeProduct(String productId) 
    {
        for(int i = 0; i < products.size(); i++)
        {
            if (products.get(i).getProductId().equals(productId))
            {
                products.remove(i);
                System.out.println("Product " + productId + " removed successfully");
            }
        }
    }
}

class InsufficientStockException extends RuntimeException
{
    public InsufficientStockException(String message)
    {
        super(message);
    }
}

class InvalidQuantityException extends RuntimeException
{
    public InvalidQuantityException(String message)
    {
        super(message);
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Inventory inventory = new Inventory();
        PerishableProduct apple = new PerishableProduct("P001", "Apple", 50, 0.5, "2024-12-31");
        inventory.addProduct(apple);
        NonPerishableProduct rice = new NonPerishableProduct("NP001", "Rice", 200, 1.0, 365); 
        inventory.addProduct(rice);
        
        System.out.println("Product added: Apple with quantity " + apple.getQuantity());
        System.out.println("Product added: Rice with quantity " + rice.getQuantity());
        apple.updateStock(30);
        System.out.println("Stock updated: Apple new quantity is " + apple.getQuantity());
        
        try 
        {
            apple.updateStock(30);
        } 
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            inventory.removeProduct("P001");
        } 
        catch (InsufficientStockException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            apple.removeStock(90); // Attempting to remove more than available
        } 
        catch (InsufficientStockException e) 
        {
            System.out.println(e.getMessage());
        }

        try 
        {
            apple.updateStock(-10);
        } 
        catch (InvalidQuantityException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
