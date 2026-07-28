import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = a;
        for(int i = a+1; i <= b; i++){
            total*=i;
        }
        System.out.printf("%d",total);
    }
}