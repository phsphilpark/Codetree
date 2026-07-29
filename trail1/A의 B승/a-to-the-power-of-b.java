import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a;
        if(b==0){
            total=1;
        }else{
            for(int i = 0; i < b-1; i++){
            total*=a;
        }}
        System.out.printf("%d",total);

    }
}