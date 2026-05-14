import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] time = s.split(":");

        int a = Integer.parseInt(time[0]);

        System.out.printf("%d:%s",a+1,time[1]);
    }
}