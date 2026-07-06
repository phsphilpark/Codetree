import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        

        int cnt = 0;

        char a = sc.next().charAt(0);
        int b = sc.nextInt();
        if(a=='Y'&&b>=37){
            cnt++;
        }

        char c = sc.next().charAt(0);
        int d = sc.nextInt();

        if(c=='Y'&&d>=37){
            cnt++;
        }

        char e = sc.next().charAt(0);
        int f = sc.nextInt();

        if(e=='Y'&&f>=37){
            cnt++;
        }

        if(cnt>=2){
            System.out.print("E");
        }else{
            System.out.print("N");
        }


    }
}