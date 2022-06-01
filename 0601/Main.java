import java.util.Scanner;
/**
 * 여기에 Main 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Main
{
    public static void main(String[] args){
        int sum = 0;
        int count = 1;
        
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        sum = num;
        
        while(true){
            int a = sum / 10;
            int b = sum % 10;
            int c = (a+b) % 10;
            sum = (b*10) + c;
            if (sum == num){
                break;
            }
            count += 1;
        }
        System.out.println(count);
    }
}
