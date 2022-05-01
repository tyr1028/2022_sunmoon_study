import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int int_1 = scan.nextInt();
        int int_2 = scan.nextInt();
        int sum = int_1 + int_2;
        int minus = int_1 - int_2;
        double multip = int_1 * int_2;
        double divi = int_1 / int_2;
        int remain = int_1 % int_2;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multip);
        System.out.println(divi);
        System.out.println(remain);
    }
}
