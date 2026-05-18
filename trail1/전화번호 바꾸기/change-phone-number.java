import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] num = s.split("-");

        int[] newNum = new int[3];

        newNum[1] = Integer.parseInt(num[1]);
        newNum[2] = Integer.parseInt(num[2]);

       
            int tmp = newNum[1];
            newNum[1] = newNum[2];
            newNum[2] = tmp;
        

        System.out.printf("%s-%d-%d",num[0],newNum[1],newNum[2]);

    }
}