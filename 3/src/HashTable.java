import java.util.LinkedList;

// Класс для хранения пар "ключ-значение"
class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key + " => " + value;
    }
}

public class HashTable<K, V> {
    private LinkedList<Entry<K, V>>[] table;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Конструктор по умолчанию
    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    // Конструктор с указанием начальной емкости
    public HashTable(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }

    // Метод для вычисления хэша
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    // Метод для добавления элемента
    public void put(K key, V value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        // Проверяем, существует ли уже ключ
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);  // Обновляем значение, если ключ уже существует
                return;
            }
        }

        // Добавляем новую пару
        table[index].add(new Entry<>(key, value));
        size++;
    }

    // Метод для получения значения по ключу
    public V get(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;  // Если ключ не найден
    }

    // Метод для удаления элемента по ключу
    public void remove(K key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Entry<K, V> entry : table[index]) {
                if (entry.getKey().equals(key)) {
                    table[index].remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    // Метод для получения размера таблицы
    public int size() {
        return size;
    }

    // Метод для проверки, пуста ли таблица
    public boolean isEmpty() {
        return size == 0;
    }

    // Метод для отображения содержимого таблицы (для удобства тестирования)
    public void display() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Index " + i + ": ");
            if (table[i] != null) {
                for (Entry<K, V> entry : table[i]) {
                    System.out.print(entry + " ");
                }
            }
            System.out.println();
        }
    }

    // Тестирование работы хэш-таблицы
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        // Добавляем элементы
        hashTable.put("apple", 5);
        hashTable.put("banana", 3);
        hashTable.put("orange", 7);
        hashTable.put("pear", 2);

        // Отображаем содержимое таблицы
        hashTable.display();

        // Получаем значения по ключу
        System.out.println("Value for 'banana': " + hashTable.get("banana"));

        // Удаляем элемент
        hashTable.remove("orange");
        hashTable.display();

        // Проверка размера и пустоты
        System.out.println("Size: " + hashTable.size());
        System.out.println("Is empty: " + hashTable.isEmpty());
    }
}
