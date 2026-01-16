public class PrintPrimeNumber {
    public static void main(String[] args) {
       
       

       for(int num = 2;num<=1000;num++){

          boolean x = true;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {

                    x = false;

                    break;
                }
               }
          if (x)
            System.out.println(num);
        }

       }}