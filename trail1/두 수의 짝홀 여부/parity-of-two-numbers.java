import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%2==0){
            System.out.print("even\n");
        }else{
            System.out.print("odd\n");
        }

        if(b%2==0){
            System.out.print("even\n");
        }else{
            System.out.print("odd\n");
        }
    }
}