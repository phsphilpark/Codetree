import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        int n = sc.nextInt();

        if(a=='A'){
            for(int i = 1; i <= n; i++){
                System.out.printf("%d ",i);
            }
        }else if(a=='D'){
            for(int i = n; i > 0; i--){
                System.out.printf("%d ",i);
            }
        }
    }
}