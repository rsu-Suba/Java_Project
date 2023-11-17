import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 2;
        int q = 0;
        int same = 1;
        int prime = 0;
        String result = "";
        long start = System.currentTimeMillis();
        scan.close();
        for (i = 2;; i++){
            if (i > 2 && i % 2 == 0){
                continue;
            }
            if (n % i == 0){
                if (i == q){
                    same++;
                }
                else {
                    q = i;
                    if (same > 1) {
                        result += "^" + String.valueOf(same);
                        same = 1;
                    }
                    result += "\n" + String.valueOf(i);
                }
                if (i > Math.sqrt(n)){
                    q = i;
                    if (same > 1) {
                        result += "^" + String.valueOf(same);
                        same = 1;
                    }
                    break;
                }
                n = n / i;
                i = 1;
                prime++;
                continue;
            }
            else{
                continue;
            }
        }
        if (prime == 0){
            result = "\n" + n + " is Prime num.";
        }
        long end = System.currentTimeMillis();
        System.out.println(result + "\nFinish (" + (end - start) + "ms)\n");
    }
}