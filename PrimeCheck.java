public class PrimeCheck {
    public static void main(String[] args) {
        int num = 30;
        boolean x = true;

        if (num <= 1) {
            x = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    x = false;
                    break;
                }
            }
        }

        if (x)
            System.out.println(num + " is a Prime number.");
        else
            System.out.println(num + " is NOT a Prime number.");
    }
}