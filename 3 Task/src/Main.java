////1
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i += 2) {
//            String str1 = args[i];
//            String str2 = args[i + 1];
//            System.out.println(isStrangePair(str1, str2));
//        }
//    }
//    public static boolean isStrangePair(String str1, String str2) {
//        if (!str1.isEmpty() && !str2.isEmpty()) {
//            return (str1.charAt(0) == str2.charAt(str2.length() - 1)) &&
//                    (str1.charAt(str1.length() - 1) == str2.charAt(0));
//        }
//        return false;
//    }
//}

////2
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List<String[]> items = new ArrayList<>();
//        for (int i = 0; i < args.length - 1; i += 2) {
//            String name = args[i];
//            String price = args[i + 1];
//            items.add(new String[]{name, price});
//        }
//        int discount = Integer.parseInt(args[args.length - 1]);
//        List<String[]> discountedItems = sale(items, discount);
//        for (String[] item : discountedItems) {
//            System.out.println(item[0] + ": " + item[1]);
//        }
//    }
//    public static List<String[]> sale(List<String[]> items, int discount) {
//        List<String[]> discountedItems = new ArrayList<>();
//        for (String[] item : items) {
//            String name = item[0];
//            int originalPrice = Integer.parseInt(item[1]);
//            int discountedPrice = (int) Math.round(originalPrice * (1 - discount / 100.0));
//            discountedPrice = Math.max(discountedPrice, 1);
//            discountedItems.add(new String[]{name, String.valueOf(discountedPrice)});
//        }
//        return discountedItems;
//    }
//}

////3
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i += 5) {
//            int x = Integer.parseInt(args[i]);
//            int y = Integer.parseInt(args[i+1]);
//            int r = Integer.parseInt(args[i+2]);
//            int m = Integer.parseInt(args[i+3]);
//            int n = Integer.parseInt(args[i+4]);
//            System.out.println(successShoot(x, y, r, m, n));
//        }
//    }
//    public static boolean successShoot(int x, int y, int r, int m, int n) {
//        double distance = Math.sqrt(Math.pow(m - x, 2) + Math.pow(n - y, 2));
//        return distance <= r;
//    }
//}

////4
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            int number = Integer.parseInt(args[i]);
//            System.out.println(parityAnalysis(number));
//        }
//    }
//    public static boolean parityAnalysis(int number) {
//        int sumOfDigits = 0;
//        int originalNumber = number;
//        while (number != 0) {
//            sumOfDigits += number % 10;
//            number /= 10;
//        }
//        return (originalNumber % 2 == sumOfDigits % 2);
//    }
//}

////5
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i += 2) {
//            String player1 = args[i];
//            String player2 = args[i + 1];
//
//            System.out.println(rps(player1, player2));
//        }
//    }
//
//    public static String rps(String player1, String player2) {
//        player1 = player1.toLowerCase();
//        player2 = player2.toLowerCase();
//        if (player1.equals(player2)) {
//            return "Tie";
//        }
//
//        switch (player1) {
//            case "rock":
//                return (player2.equals("scissors")) ? "Player 1 wins" : "Player 2 wins";
//            case "paper":
//                return (player2.equals("rock")) ? "Player 1 wins" : "Player 2 wins";
//            case "scissors":
//                return (player2.equals("paper")) ? "Player 1 wins" : "Player 2 wins";
//            default:
//                return "Invalid input from Player 1";
//        }
//    }
//}

////6
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            int number = Integer.parseInt(args[i]);
//            System.out.println(bugger(number));
//        }
//    }
//
//    public static int bugger(int number) {
//        int count = 0;
//        while (number >= 10) {
//            int product = 1;
//            while (number > 0) {
//                product *= number % 10;
//                number /= 10;
//            }
//            number = product;
//            count++;
//        }
//        return count;
//    }
//}

////7
//public class Main {
//    public static void main(String[] args) {
//        String[][] inventory = new String[args.length / 3][3];
//        for (int i = 0; i < args.length; i += 3) {
//            inventory[i / 3][0] = args[i]; // Название предмета
//            inventory[i / 3][1] = args[i + 1]; // Цена
//            inventory[i / 3][2] = args[i + 2]; // Количество
//        }
//        System.out.println(mostExpensive(inventory));
//    }
//    public static String mostExpensive(String[][] inventory) {
//        String mostExpensiveItem = "";
//        int maxTotalValue = 0;
//        for (String[] item : inventory) {
//            String name = item[0];
//            int price = Integer.parseInt(item[1]);
//            int quantity = Integer.parseInt(item[2]);
//            int totalValue = price * quantity;
//            if (totalValue > maxTotalValue) {
//                maxTotalValue = totalValue;
//                mostExpensiveItem = name;
//            }
//        }
//        return "Наиб. общ. стоимость у предмета " + mostExpensiveItem + " - " + maxTotalValue;
//    }
//}

////8
//import java.util.HashSet;
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            String input = args[i];
//            System.out.println("Самая длинная подстрока уникальных символов: " + longestUnique(input));
//        }
//    }
//    public static String longestUnique(String str) {
//        String longestSubstring = "";
//        String currentSubstring = "";
//
//        HashSet<Character> uniqueChars = new HashSet<>();
//
//        for (int i = 0; i < str.length(); i++) {
//            char currentChar = str.charAt(i);
//
//            if (!uniqueChars.contains(currentChar)) {
//                uniqueChars.add(currentChar);
//                currentSubstring += currentChar;
//            } else {
//                if (currentSubstring.length() > longestSubstring.length()) {
//                    longestSubstring = currentSubstring;
//                }
//
//                int firstOccurrence = currentSubstring.indexOf(currentChar);
//                currentSubstring = currentSubstring.substring(firstOccurrence + 1) + currentChar;
//
//                uniqueChars.clear();
//                for (char c : currentSubstring.toCharArray()) {
//                    uniqueChars.add(c);
//                }
//            }
//        }
//        if (currentSubstring.length() > longestSubstring.length()) {
//            longestSubstring = currentSubstring;
//        }
//        return longestSubstring;
//    }
//}

////9
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i += 2) {
//            String word = args[i];
//            String affix = args[i + 1];
//            if (affix.startsWith("-")) {
//                System.out.println(isSuffix(word, affix));
//            } else {
//                System.out.println(isPrefix(word, affix));
//            }
//        }
//    }
//    public static boolean isPrefix(String word, String prefix) {
//        return word.startsWith(prefix.substring(0, prefix.length() - 1));
//    }
//    public static boolean isSuffix(String word, String suffix) {
//        return word.endsWith(suffix.substring(1));
//    }
//}

////10
//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i += 5) {
//            int a = Integer.parseInt(args[i]);
//            int b = Integer.parseInt(args[i+1]);
//            int c = Integer.parseInt(args[i+2]);
//            int w = Integer.parseInt(args[i+3]);
//            int h = Integer.parseInt(args[i+4]);
//            System.out.println(doesBrickFit(a, b, c, w, h));
//        }
//    }
//    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
//        return (a <= w && b <= h) || (a <= h && b <= w) ||
//                (b <= w && c <= h) || (b <= h && c <= w) ||
//                (a <= w && c <= h) || (a <= h && c <= w);
//    }
//}

