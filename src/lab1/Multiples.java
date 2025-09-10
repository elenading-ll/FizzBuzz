package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples(1, 3, 5));
    }

     public static int multiples(int n, int a, int b) {
        int sum = 0;

        while (n < 1000) {
            if (n % a == 0 || n % b == 0) {
                sum++;
            }
            n++;
        }
        System.out.println(sum);
        return sum;
    }
}
