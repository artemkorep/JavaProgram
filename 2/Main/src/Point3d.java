public class Point3d extends Point2d {
    /** координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    /** Конструктор по умолчанию. **/
    public Point3d() {
        this(0, 0, 0);
    }

    /** Возвращение координаты Z **/
    public double getZ() {
        return zCoord;
    }

    /** Установка значения координаты Z. **/
    public void setZ(double val) {
        zCoord = val;
    }
    public static void main(String[] args) {
        // Создание точки в 2D пространстве
        Point2d point2d = new Point2d(1.0, 2.0);
        System.out.println("Point2d: (" + point2d.getX() + ", " + point2d.getY() + ")");

        // Создание точки в 3D пространстве
        Point3d point3d = new Point3d(1.0, 2.0, 3.0);
        System.out.println("Point3d: (" + point3d.getX() + ", " + point3d.getY() + "," + point3d.getZ() + ")");

        // Изменение значений координат
        point3d.setX(10.0);
        point3d.setY(20.0);
        point3d.setZ(30.0);

        // Вывод обновленной информации
        System.out.println("Обновленные координаты Point3d: (" + point3d.getX() + ", " + point3d.getY() + "," + point3d.getZ() + ")");
    }
}
