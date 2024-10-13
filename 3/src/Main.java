public class Main {
    public static void main(String[] args) {
        // Создание объекта склада
        Warehouse warehouse = new Warehouse();

        // Создание продуктов
        Product apple = new Product("Apple", 1.5, 100);
        Product banana = new Product("Banana", 0.8, 200);
        Product orange = new Product("Orange", 2.0, 150);

        // Вставка продуктов на склад
        warehouse.addProduct("1234567890", apple);
        warehouse.addProduct("0987654321", banana);
        warehouse.addProduct("1122334455", orange);

        // Поиск продукта по штрихкоду
        Product foundProduct = warehouse.getProduct("1234567890");
        if (foundProduct != null) {
            System.out.println("Найденный продукт: " + foundProduct);
        } else {
            System.out.println("Продукт не найден.");
        }

        // Удаление продукта по штрихкоду
        warehouse.removeProduct("0987654321");

        // Вывод всех продуктов на складе
        System.out.println("Все продукты на складе:");
        warehouse.displayAllProducts();
    }
}
