//1
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            String gallon = args[i];
//            double liters = convert(Integer.parseInt(gallon));
//            System.out.println("Полученные литры: " + String.format("%.3f", liters));
//        }
//    }
//
//    public static double convert(int gallon) {
//        double convert_gallon = 3.78541;
//        return gallon * convert_gallon;
//    }
//}

//2
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 1; i += 2) {
//            int num1 = Integer.parseInt(args[i]);
//            int num2 = Integer.parseInt(args[i + 1]);
//            if (num1 <= 60 && num2 <= 3) {
//                int result = fitCalc(num1, num2);
//                System.out.println("Сожженные калории: " + result);
//            } else {
//                System.out.println("Введите корректные данные");
//            }
//        }
//    }
//
//    public static int fitCalc(int num1, int num2) {
//        return num1 * num2;
//    }
//}

//3
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 2; i += 3) {
//            int boxes = Integer.parseInt(args[i]);
//            int bags = Integer.parseInt(args[i + 1]);
//            int barrels = Integer.parseInt(args[i + 2]);
//            int result = containers(boxes, bags, barrels);
//            System.out.println("Общее количество товаров на складе: " + result);
//        }
//    }
//
//    public static int containers(int boxes, int bags, int barrels) {
//        int goodsBox = boxes * 20;
//        int goodsBag = bags * 50;
//        int goodsBarrel = barrels * 100;
//        return goodsBarrel + goodsBag + goodsBox;
//    }
//}

//4
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 2; i += 3) {
//            int x = Integer.parseInt(args[i]);
//            int y = Integer.parseInt(args[i + 1]);
//            int z = Integer.parseInt(args[i + 2]);
//            String result = triangleType(x, y, z);
//            System.out.println(result);
//
//        }
//    }
//
//    public static String triangleType(int x, int y, int z) {
//        if (x + y > z && x + z > y && y + z > x) {
//            if (x == y && y == z) {
//                return "Равносторонний";
//            } else if ((x == y && x != z) || (y == z && x != y) || (x == z && x != y)) {
//                return "Равнобедренный";
//            } else {
//                return "Разносторонний";
//            }
//        } else {
//            return "Не является треугольником";
//        }
//    }
//}

//5
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 1; i += 2) {
//            int a = Integer.parseInt(args[i]);
//            int b = Integer.parseInt(args[i + 1]);
//            int result = ternaryEvaluation(a, b);
//            System.out.println("Большее число: " + result);
//
//        }
//    }
//
//    public static int ternaryEvaluation(int a, int b) {
//        int max = (a > b) ? a : b;
//        return max;
//    }
//
//}

//6
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 2; i += 3) {
//            int n = Integer.parseInt(args[i]);
//            double w = Double.parseDouble(args[i + 1]);
//            double h = Double.parseDouble(args[i + 2]);
//            int result = howManyItems(n, w, h);
//            System.out.println("Количество пододеяльников: " + result);
//        }
//    }
//    public static int howManyItems(int n, double w, double h) {
//        double nArea = n / 2;
//        double detail = w * h;
//        return (int) (nArea / detail);
//    }
//}

//7
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            int number = factorial(Integer.parseInt(args[i]));
//            System.out.println("Факториал числа: " + number);
//        }
//    }
//    public static int factorial(int n) {
//        int result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
//}

//8
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 1; i += 2) {
//            int a = Integer.parseInt(args[i]);
//            int b = Integer.parseInt(args[i+1]);
//            System.out.println("Наибольший общий делитель: " + gcd(a, b));
//        }
//    }
//
//    public static int gcd(int a, int b) {
//        while (b != 0) {
//            int mem = b;
//            b = a % b;
//            a = mem;
//        }
//        return a;
//    }
//}

//9
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 1; i += 2) {
//            int ticket = Integer.parseInt(args[i]);
//            int price = Integer.parseInt(args[i + 1]);
//            System.out.println("Общая выручка: " + ticketSaler(ticket, price));
//        }
//    }
//    public static int ticketSaler(int ticket, int price) {
//        double revenue = ticket * price * (1 - 28.0 / 100.0);
//        return (int)revenue;
//    }
//}

//10
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length - 1; i += 2) {
//            int students = Integer.parseInt(args[i]);
//            int availtables = Integer.parseInt(args[i + 1]);
//            System.out.println("Не хватает столов для размещения: " + tables(students, availtables));
//
//        }
//    }
//
//    public static int tables(int students, int availtables) {
//        int lefttables = (students + 1) / 2; //количество столов для размещения всех студентов
//        return Math.max(0, lefttables - availtables);
//    }
//}