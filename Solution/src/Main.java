import java.util.Scanner;
// The method should return a boolean indicating whether or not the given number is prime
// (a number only divisible by 1 and itself).

public class Solution {
    int num;

    public static boolean isPrime() {
        if (num % 2 == 0) {
            return false;
        } else if (num % 2 == 1) {
            for (i = 0; i <= num; i++) {
                if (num % i == 0) {
                    return true;
                }
            }
        }
        else {
            return true;
        }
        return false;
    }

    public static void main(String[]args) {

        //Solution checkPrime = new Solution();
        //new checkPrime().isPrime();

        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = numInput.nextInt();
        System.out.println(isPrime());
    }
}