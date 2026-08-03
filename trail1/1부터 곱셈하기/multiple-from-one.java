import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 1;
        for(int i = 1; i <= 3000000; i++){
            total*=i;
            if(total >= n){
                System.out.printf("%d",i);
                break;
            }
        }
    }
}