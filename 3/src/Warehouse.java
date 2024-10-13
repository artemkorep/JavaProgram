import java.util.HashMap;
import java.util.Map;

// Класс Warehouse для учета продуктов на складе
public class Warehouse {
    private HashMap<String, Product> products;  // Хэш-таблица для хранения продуктов по штрихкодам

    // Конструктор по умолчанию
    public Warehouse() {
        products = new HashMap<>();
    }

    // Метод для добавления продукта в склад
    public void addProduct(String barcode, Product product) {
        products.put(barcode, product);
        System.out.println("Продукт добавлен: " + product.toString());
    }

    // Метод для поиска продукта по штрихкоду
    public Product getProduct(String barcode) {
        return products.get(barcode);
    }

    // Метод для удаления продукта по штрихкоду
    public void removeProduct(String barcode) {
        Product removedProduct = products.remove(barcode);
        if (removedProduct != null) {
            System.out.println("Продукт удален: " + removedProduct.toString());
        } else {
            System.out.println("Продукт со штрихкодом " + barcode + " не найден.");
        }
    }

    // Метод для вывода всех продуктов на складе
    public void displayAllProducts() {
        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println("Штрихкод: " + entry.getKey() + ", Продукт: " + entry.getValue());
        }
    }
}
