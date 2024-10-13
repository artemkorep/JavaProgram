//1
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length - 1; i += 2) {
            String str1 = args[i];
            String str2 = args[i + 1];
            System.out.println(duplicateChars(str1, str2));
        }
    }

    public static String duplicateChars(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) == -1) {
                result += ch;
            }
        }

        return result;
    }

}

//2
public class Main {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Количество нечетных чисел, кратных 3: " + dividedByThree(array));
    }

    public static int dividedByThree(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 != 0 && num % 3 == 0) {
                count++;
            }
        }
        return count;
    }
}

//3
public class Main {
    public static void main(String[] args) {
        String str1 = String.join(" ", args);
        System.out.println(getInitials(str1));

    }
    public static String getInitials(String str1) {
        String[] names = str1.split(" ");
        String firstName = names[1].substring(0,1).toUpperCase();
        String secondName = names[2].substring(0,1).toUpperCase();
        String lastName = names[0].substring(0,1).toUpperCase() + names[0].substring(1).toLowerCase();
        return firstName + "." + secondName + "." + lastName;

    }

}

//4
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] array = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Double.parseDouble(args[i]);
        }
        double[] normalizatorArray = normalizator(array);
        System.out.println(Arrays.toString(normalizatorArray));
    }
    public static double[] normalizator(double[] array) {
        double min = Arrays.stream(array).min().getAsDouble();
        double max = Arrays.stream(array).max().getAsDouble();

        double[] normalized = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            normalized[i] = (array[i] - min) / (max - min);
        }
        return normalized;
    }
}



//5
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] array = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Double.parseDouble(args[i]);
        }
        int[] result = compressedNums(array);
        System.out.println(Arrays.toString(result));

    }
    public static int[] compressedNums(double[] array) {
        return Arrays.stream(array).filter(num -> num != 0).mapToInt(num -> (int) Math.floor(num)).distinct().sorted().toArray();
    }
}

//6
public class Main {
    public static void main(String[] args) {
        String camelCase = args[0];
        String result = camelToSnake(camelCase);
        System.out.println(result);

    }
    public static String camelToSnake(String str) {
        return str.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }
}

//7
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        int result = secondBiggest(nums);
        System.out.println(result);

    }
    public static int secondBiggest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                second = largest;
                largest = num;

            } else if (num > second && num != largest) {
                second = num;
            }
        }
        return second;
    }
}

//8
public class Main {
    public static void main(String[] args) {
        String input = args[0];
        char marker = args[1].charAt(0);
        String result = localReverse(input, marker);
        System.out.println(result);
    }
    public static String localReverse(String str, char marker) {
        int firstMarker = str.indexOf(marker);
        int lastMarker = str.lastIndexOf(marker);

        if (firstMarker == -1 || lastMarker == -1 || firstMarker == lastMarker) {
            return str;
        }
        String between = str.substring(firstMarker + 1, lastMarker);
        String reversed = new StringBuilder(between).reverse().toString();
        return str.substring(0, firstMarker + 1) + reversed + str.substring(lastMarker);
    }
}

//9
public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int result = equal(num1, num2, num3);
        System.out.println(result);
    }

    public static int equal(int a, int b, int c) {
        int count = 0;
        if (a == b && b == c) {
            return 3;
        }
        if (a == b || a == c || b == c) {
            return 2;
        }
        return 0;

    }
}

//10
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];

        boolean result = isAnagram(str1,str2);
        System.out.println(result);

    }

    public static boolean isAnagram(String str1, String str2) {
        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
}