import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a%2==1 && a%3 ==0){
                total+=a;
            }
        }
        System.out.printf("%d",total);
    }
}