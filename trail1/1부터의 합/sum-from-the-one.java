import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total = 0;
        int count;
        for(int i = 1; ; i++){
            count = i;
            if(total + i >=n) break;
            total+=i;
           
        }
        System.out.printf("%d",count);
    }
}