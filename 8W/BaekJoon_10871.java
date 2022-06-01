import java.util.Scanner;
public class BaekJoon_10871 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int X = scan.nextInt();
        int[] A;
        int[] B;
        A = new int[N];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            if (A[i] < X) {
                System.out.print(A[i] + " ");
            }
            else{
                continue;
            }
        }
   }
}
