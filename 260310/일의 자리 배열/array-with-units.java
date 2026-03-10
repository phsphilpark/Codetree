import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();

        num[0] = a;
        num[1] = b;

        for(int i = 2; i <10; i++){
            num[i] = (num[i-1] + num[i-2])%10;
        }
        
        for(int i=0;i<10;i++){
            System.out.print(num[i] + " ");
        }
    }
}