import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("N sayıssını giriniz : ");
        int n = sc.nextInt();
        double sum=0;

        for (int i = 1; i <= n; i++) {
            sum+= 1.0/i;
        }
        System.out.println("Sonuç : " + sum);
    }
}
