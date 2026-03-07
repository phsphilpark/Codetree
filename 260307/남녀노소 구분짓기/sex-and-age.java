import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int n = sc.nextInt();

        if(n>=19){
            if(s==0){
                System.out.print("MAN");
            }else{
                System.out.print("WOMAN");
            }
        }else{
            if(s==0){
                System.out.print("BOY");
            }else{
                System.out.print("GIRL");
            }
        }
    }
}