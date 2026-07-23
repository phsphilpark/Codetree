import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int total = 0;
        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();
            if(n>=0 && n <= 200){
                total+=n;
                cnt++;
            }
        }
        System.out.printf("%d %.1f",total,((1.0)*total)/cnt);
    }
} 