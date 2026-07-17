import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b;){
            if(i%2==0){
                System.out.printf("%d ",i);
                i+=3;
            }else{
                System.out.printf("%d ",i);
                i*=2;
            }
        }
    }
}