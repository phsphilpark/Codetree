import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a;
        while(true){
            System.out.print(n + " ");

            if(n%2==1){
                n=n*2;
            }else{
                n=n+3;
            }
            if(n>b){
                break;
            }
        }
    }
}