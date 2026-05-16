import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String pl[] = s.split("-");

        System.out.printf("%s%s",pl[0],pl[1]);
    }
}