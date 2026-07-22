import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int total = 0;
        int tmp;
        if(b>a){
           tmp=b;
           b=a;
           a=tmp;
        }
        for(int i = b; i <= a; i++){
            if(i%5==0) total+=i;
        }
        System.out.printf("%d",total);
    }
}