public class Point2d {
/** координата X **/
    private double xCoord;
/** координата Y **/
    private double yCoord;
/** Конструктор инициализации **/
    public Point2d (double x, double y) {
        xCoord = x;
        yCoord = y;
    }
/** Конструктор по умолчанию. **/
    public Point2d () {
        this(0, 0);
    }
/** Возвращение координаты X **/
    public double getX () {
        return xCoord;
    }
/** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
/** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }
/** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }
//    public static void main(String[] args) {
//        Point2d myPoint = new Point2d (); //создает точку (0,0)
//        Point2d myOtherPoint = new Point2d (6,3); //создает точку (5,3)
//        System.out.println("Точка X: " + myOtherPoint.getX());
//        System.out.println("Точка Y: " + myOtherPoint.getY());
//        System.out.println("Точка X: " + myPoint.getX());
//        System.out.println("Точка Y: " + myPoint.getY());
//        myPoint.setX(10.2);
//        myPoint.setY(5);
//        System.out.println("Установлено новое значение точки X: " + myPoint.getX());
//        System.out.println("Установлено новое значение точки Y: " + myPoint.getY());
//    }
}
