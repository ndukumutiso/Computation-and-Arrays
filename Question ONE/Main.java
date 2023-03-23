public class Main {
    class Fibonacci {
        public int sumEvenFibonacci(int max) {
            int sum = 0;
            int prev = 1;
            int curr = 2;
            while (curr <= max) {
                if (curr % 2 == 0) {
                    sum += curr;
                }
                int next = prev + curr;
                prev = curr;
                curr = next;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Main outer = new Main();
        Fibonacci fib = outer.new Fibonacci();
        int sum = fib.sumEvenFibonacci(4000000);
        System.out.println("The sum of even-valued terms in the Fibonacci sequence whose values do not exceed 4 million is: " + sum);
    }
}



