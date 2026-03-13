import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        StringBuilder sb = new StringBuilder(st);

        sb.setCharAt(1, 'a');
        sb.setCharAt(st.length() - 2, 'a');
        
        System.out.print(sb);
    }
}