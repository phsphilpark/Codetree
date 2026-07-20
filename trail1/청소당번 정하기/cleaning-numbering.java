import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt_c = 0;
        int cnt_b = 0;
        int cnt_r = 0;
        for(int i = 1; i <= n; i++){
        if(i%12==0) cnt_r++;
        else if(i%3 == 0) cnt_b++;
        else if(i%2 == 0) cnt_c++;
        }
        System.out.printf("%d %d %d",cnt_c,cnt_b,cnt_r);
    }
}