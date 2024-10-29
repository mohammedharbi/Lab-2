import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

//        1.Write a program to find all of the longest word in a given dictionary.
//        Example:
//        { "cat", "dog", "red", "is", "am" } Expected
//        Output:
//        "cat", "dog", "red"

//        String[] words = { "cat", "dog", "red", "is", "am" };
//        System.out.println(findLongestWord(words));

//        2. Write a program that displays the number of occurrences of an element in the array.
//           Original Array:
//            [1,1,1,3,3,5]
//           Sample Output:
//            3 occurs 2 times
//            1 occurs 3 times
//            9 occurs 0 time

//        int[] occarry = {1, 1, 1, 3, 3, 5};
//        occouracne(occarry);

//        3.Write a program to find the k largest elements in a given array. Elements in the array can be in
//        any order.
//        1
//        Original Array:
//        [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        3 largest elements of the said array are:
//        100 25 17

//        int [] a = {1, 4, 17, 7, 25, 3, 100};
//        printk(a);

//        4. Create a method to reverse an array of integers. Implement the method without creating a new
//           array.
//           Original Array:
//          [5,4,3,2,1]
//          Expected Output:
//          Reversed Array:
//          1 2 3 4 5

//        int[] revarray = {5,4,3,2,1};
//        reverseNumbArray(revarray);

//        5. Write a menu driven Java program with following option:
//         1. Accept elements of an array
//         2. Display elements of an array
//         3. Search the element within array
//         4. Sort the array
//         5. To Stop the size of the array should be
//         entered by the user.

//        System.out.println("Please enter the size of the array");
//        int n2 = input.nextInt();
//        int[] numbers = new int[n2];
//        boolean stop= false;
//
//        while (!stop) {
//            System.out.println("1.Accept elements of an array.\n" +
//                    "2.Display elements of an array.\n" +
//                    "3.Search the element within array.\n" +
//                    "4.Sort the array.\n" +
//                    "5.To Stop and exit.");
//            int n1 = input.nextInt();
//            switch (n1) {
//
//                case 1:
//                    fillArray(numbers);
//                    break;
//                case 2:
//                    printArray(numbers);
//                    break;
//                case 3:
//                    System.out.println("Please enter the number of an element to search: ");
//                    int el = input.nextInt();
//                    System.out.println("The element is: "+numbers[el]);
//                    break;
//                case 4:
//                    Arrays.sort(numbers);
//                    break;
//                case 5:
//                    stop = true;
//                    break;
//            }
//        }

//        6. Create a method that generates a random number within a given range. Allow the user to
//        specify the range and call the method to display random numbers.
//                Hint: use Random class
//        Sample Output:
//        2
//        Enter the minimum value of the range: 10
//        Enter the maximum value of the range: 100
//        Enter the number of random numbers to generate: 5 Random
//        numbers within the specified range:
//        71 - 98 - 96 - 71 - 71

//        System.out.println("Enter the minimum value of the range:");
//        int n1 = input.nextInt();
//        System.out.println("Enter the maximum value of the range");
//        int n2 = input.nextInt();
//        printRandom(n1,n2);

//        7. Write a program that checks the strength of a password. Create a method that evaluates a
//        password based on criteria like length, inclusion of special characters, and
//        uppercase/lowercase letters.  - - -
//                We have three methods: checkLength, checkSpecialCharacters, and
//        checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
//                The totalScore is calculated by adding the scores from these methods.
//        Classify the password as strong (8 or more), moderately strong (5 or more), or weak
//        based on the totalScore. -
//                The criteria for scoring:
//        • Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//                (3 points).
//        • Special characters: Absence (0 points), Presence (2 points).
//        • Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
//        points).
//        Example:
//        Enter a password: 3456 Expected Output:
//        Password is weak.

//        System.out.println("Please enter a string to check the strength of a password.");
//        String s = input.nextLine();
//        int points = checkLength(s);
//        points += checkSpecialCharacters(s);
//        points += checkUpperCaseLowerCase(s);
//
//        System.out.println(points);
//
//        if (points >= 8){
//            System.out.println("Password is Strong.");
//        } else if (points >=5 && points <= 7) {
//            System.out.println("Password is moderately strong.");
//        }else System.out.println("Weak.");

//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//                Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//                and each subsequent number in the sequence is the sum of the two preceding ones.
//        3
//        Example:
//        Enter the number of Fibonacci terms to generate: 10
//        Expected Output:
//        Fibonacci sequence with 10 terms:
//        0 1 1 2 3 5 8 13 21 34

//        System.out.println(" Enter the number of Fibonacci terms to generate:");
//        int n1 = input.nextInt();
//
//        fibonacciTerms(n1);

    }

    public static int[] fillArray(int[] a) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter " + n + " number");
            a[i] = input.nextInt();
            ++n;
        }

        return a;
    }

    public static ArrayList<String> findLongestWord(String[] a) {
        ArrayList<String> compared_words = new ArrayList<String>();
        String temp = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i].length() >= temp.length()) {
                compared_words.add(a[i]);
                temp = a[i];
            }

        }
        return compared_words;
    }

    public static void reverseNumbArray(int[] a) {
        int j = a.length - 1;
        int temp = 0;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void printRandom(int n1, int n2) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);
        System.out.println("Enter the number of random numbers to generate:");
        int n3 = input.nextInt();
        int[] num = new int[n3];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(n1, n2);
        }
        System.out.println(Arrays.toString(num));
    }

    public static void occouracne(int[] a) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to find the occurrences of an element in the array");
        int n = input.nextInt();
        int count=0;
        for (int i = 0; i < a.length; i++) {
                if (n == a[i]) {
                    count++;
                }
            }
            System.out.println(n + " occurs " + count + " times.");
        }


    public static void printk(int[] a) {
        Arrays.sort(a);
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a k (k = number of the largest elements)");
        int k = input.nextInt();
        for (int i = a.length - 1; i > a.length - k - 1; i--) {
            System.out.println(a[i]);
        }
    }

    public static int checkLength(String s) {
//        • Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//                (3 points).
        int points;
        if (s.length() >= 8) {
            points = 3;
        } else if (s.length() == 6 || s.length() == 7) {
            points = 2;
        } else points = 0;

        return points;
    }

    public static int checkSpecialCharacters(String s) {
        //        • Special characters: Absence (0 points), Presence (2 points).
        int points = 0;
        char ch;

            String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
            for (int i = 0; i < s.length(); i++) {
                String strChar = Character.toString(s.charAt(i));
                if (specialChars.contains(strChar)) {
                    points = 2;
                    break;
                }
            }

        return points;
    }
    public static int checkUpperCaseLowerCase(String s){
//        • Uppercase and lowercase letters: Absence of both (0 points), presence of both (3
//        points).
        boolean up = false;
        boolean lower = false;
        char ch;
        int points;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (Character.isLowerCase(ch)){lower = true;}
            if (Character.isUpperCase(ch)){up = true;}
        }
        if (lower == true && up == true){points = 3;}else points=0;
        return points;
    }
    public static void fibonacciTerms(int n){
        int sum;
        int n1 = 0;
        int n2 = 1;
        System.out.print("[");
        for (int i = 0; i <= n; i++) {
            if (i == n){
                System.out.println("]");
                break;}else System.out.print(n1+", ");
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}