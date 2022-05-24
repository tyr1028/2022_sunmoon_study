import java.util.Scanner;

public class BaekJoon_2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        int count = 0;
        if((sugar % 3) == 0) {
            if (sugar % 5 == 0) {
                count += sugar / 5;
            } else {
                count += sugar / 3;
            }
        }
        else{
            while(sugar % 5 != 0){
                sugar = sugar - 5;
                count++;
                if(sugar > 3){
                    count += sugar / 3;
                    sugar = sugar % 3;
                }
            }
        }
        System.out.println(count);
    }
}
