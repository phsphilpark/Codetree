import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp;
        if(a>=b){
            tmp=a;
        }else{
            tmp=b;
            b=a;
        }
        System.out.printf("%d",tmp-b);
    }
}