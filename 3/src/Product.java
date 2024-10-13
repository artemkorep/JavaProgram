// Класс Product для хранения информации о продукте
public class Product {
    private String name;      // Название продукта
    private double price;     // Цена продукта
    private int quantity;     // Доступное количество

    // Конструктор с параметрами
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры для полей
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Переопределение метода toString() для вывода информации о продукте
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}
