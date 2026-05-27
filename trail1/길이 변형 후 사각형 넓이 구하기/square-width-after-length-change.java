import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a=a+8;
        b=b*3;

        System.out.printf("%d\n%d\n%d",a,b,a*b);
    }
}