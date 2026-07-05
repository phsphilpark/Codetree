import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a<=6){
            if(a%2==0){
            if(a==2){
                System.out.print("28");
            }else{
                System.out.print("30");
            }
            }else{
            System.out.print("31");
        }
        }else{
            if(a%2==0){
                System.out.print("31");
            }else{
                if(a==7){
                    System.out.print("31");
                }else{
                System.out.print("30");
                }
            }
        }
    }
}