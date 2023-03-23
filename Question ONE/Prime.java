public class isPrime {
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 500; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}