import java.util.Scanner;
public class BaekJoon_10871 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int number;
        int[] A;
        int[] B;
        A = new int[N];
        B = new int[N];
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= N+1; i++) {
            A[i] = sc.nextInt();
            if (i < X) {
                B[i] = i;
            }
            else{
                continue;
            }
        }
        System.out.println(B);
   }
}
