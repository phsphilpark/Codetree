import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int a_s = sc.nextLine().charAt(1);
        int b = sc.nextInt();
        int b_s = sc.nextLine().charAt(1);

        if((a>=19&&a_s=='M')||(b>=19&&b_s=='M')){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
    }
}