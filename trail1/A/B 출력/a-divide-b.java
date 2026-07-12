import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder answer = new StringBuilder();

        answer.append(a / b);
        answer.append('.');
   
        int remainder = a % b;
        
        int i = 0;
        while(i < 20){
            remainder *= 10;

            answer.append(remainder / b);
            remainder %= b;
            i++;
        }

        System.out.println(answer);
    }
}