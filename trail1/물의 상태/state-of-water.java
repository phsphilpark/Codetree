import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n>=100){
            System.out.print("vapor");
        }else if(n>=0){
            System.out.printf("water");
        }else{
            System.out.printf("ice");
        }
    }
}