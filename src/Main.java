public class Main {
    public class Homework09 {

        // Function to calculate the number of divisors for a given triangle number
        public static int countDivisors(int number) {
            int count = 0;
            int sqrt = (int) Math.sqrt(number);
            for (int i = 1; i <= sqrt; i++) {
                if (number % i == 0) {
                    count += 2; // Count both i and number/i
                }
            }
            // If the number is a perfect square, the square root is counted twice
            if (sqrt * sqrt == number) {
                count--;
            }
            return count;
        }

        public static void main(String[] args) {
            int n = 1;
            int triangleNumber = 0;

            while (true) {
                triangleNumber = n * (n + 1) / 2;
                int numDivisors = countDivisors(triangleNumber);
                if (numDivisors > 100) {
                    break;
                }
                n++;
            }

            System.out.println("The first triangle number to have over one hundred divisors is: " + triangleNumber);
        }
    }
}