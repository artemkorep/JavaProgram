// Абстрактный класс "Заведение"
abstract class Establishment {
    protected String name;  // Название заведения
    protected String address;  // Адрес заведения
    protected int capacity;  // Вместимость

    // Конструктор с параметрами
    public Establishment(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    // Конструктор по умолчанию
    public Establishment() {
        this("Неизвестно", "Неизвестный адрес", 0);
    }

    // Абстрактные методы
    public abstract void open();  // Открытие заведения
    public abstract void close();  // Закрытие заведения

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Переопределенный метод toString для вывода информации о заведении
    @Override
    public String toString() {
        return "Заведение: " + name + ", Адрес: " + address + ", Вместимость: " + capacity;
    }
}

// Класс "Кафе", наследующий класс "Заведение"
class Cafe extends Establishment {
    private static int cafeCount = 0;  // Счетчик созданных объектов Кафе
    private String cuisineType;  // Тип кухни

    // Конструктор с параметрами
    public Cafe(String name, String address, int capacity, String cuisineType) {
        super(name, address, capacity);
        this.cuisineType = cuisineType;
        cafeCount++;  // Увеличиваем счетчик
    }

    // Конструктор по умолчанию
    public Cafe() {
        this("Неизвестное кафе", "Неизвестный адрес", 0, "Неизвестная кухня");
    }

    // Метод для получения счетчика
    public static int getCafeCount() {
        return cafeCount;
    }

    // Реализация абстрактных методов
    @Override
    public void open() {
        System.out.println(name + " открыто и готово к приему посетителей.");
    }

    @Override
    public void close() {
        System.out.println(name + " закрыто.");
    }

    // Геттер и сеттер для типа кухни
    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип кухни: " + cuisineType;
    }
}

// Класс "Магазин", наследующий класс "Заведение"
class Store extends Establishment {
    private String productType;  // Тип продаваемых товаров

    // Конструктор с параметрами
    public Store(String name, String address, int capacity, String productType) {
        super(name, address, capacity);
        this.productType = productType;
    }

    // Конструктор по умолчанию
    public Store() {
        this("Неизвестный магазин", "Неизвестный адрес", 0, "Неизвестный товар");
    }

    // Реализация абстрактных методов
    @Override
    public void open() {
        System.out.println(name + " магазин открыт.");
    }

    @Override
    public void close() {
        System.out.println(name + " магазин закрыт.");
    }

    // Геттер и сеттер для типа товаров
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип товаров: " + productType;
    }
}

// Класс "Библиотека", наследующий класс "Заведение"
class Library extends Establishment {
    private int numberOfBooks;  // Количество книг в библиотеке

    // Конструктор с параметрами
    public Library(String name, String address, int capacity, int numberOfBooks) {
        super(name, address, capacity);
        this.numberOfBooks = numberOfBooks;
    }

    // Конструктор по умолчанию
    public Library() {
        this("Неизвестная библиотека", "Неизвестный адрес", 0, 0);
    }

    // Реализация абстрактных методов
    @Override
    public void open() {
        System.out.println(name + "  открыта.");
    }

    @Override
    public void close() {
        System.out.println(name + " закрыта.");
    }

    // Геттер и сеттер для количества книг
    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Количество книг: " + numberOfBooks;
    }
}

// Демонстрация работы классов
public class Main {
    public static void main(String[] args) {
        // Создаем объекты кафе, магазина и библиотеки
        Cafe cafe = new Cafe("Кафе 'Уют'", "ул. Центральная, 10", 30, "Итальянская кухня");
        Store store = new Store("Магазин 'Товары для дома'", "ул. Строителей, 20", 50, "Хозяйственные товары");
        Library library = new Library("Городская библиотека", "ул. Ленина, 5", 100, 5000);

        // Вывод информации об объектах
        System.out.println(cafe.toString());
        System.out.println(store.toString());
        System.out.println(library.toString());
        System.out.println("Количество созданных кафе: " + Cafe.getCafeCount());
        System.out.println();

        // Открытие и закрытие заведений
        cafe.open();
        store.open();
        library.open();

        cafe.close();
        store.close();
        library.close();
        System.out.println();

        //установка имени кафе
        cafe.setName("Кафе 'Хорошее заведение'");
        cafe.setAddress("проспект Мира, 28");
        cafe.setCapacity(180);
        cafe.setCuisineType("Грузинская кухня");

        // Проверка количества созданных объектов типа "Кафе"
        Cafe cafeJapan = new Cafe("Кафе 'Токио'", "ул. Архангельская, 73", 98, "Японская кухня");
        System.out.println(cafe.toString());
        System.out.println(cafeJapan.toString());
        System.out.println("Количество созданных кафе: " + Cafe.getCafeCount());
    }
}
