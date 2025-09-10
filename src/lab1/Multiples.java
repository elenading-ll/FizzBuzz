package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1000, 3, 5));
    }

     public static int multiples(int n, int a, int b) {
        int number = 1;
        int sum = 0;

        while (number < n) {
            if (number % a == 0 || number % b == 0) {
                sum++;
            }
            number++;
        }
        System.out.println(sum);
        return sum;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
