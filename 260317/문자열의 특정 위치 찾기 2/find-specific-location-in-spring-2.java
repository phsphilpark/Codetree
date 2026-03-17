import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String sen[] = {"apple","banana","grape","blueberry","orange"};
        
        int total=0;

        char c = sc.next().charAt(0);

        for(int i=0;i<5;i++){
            char[] temp =sen[i].toCharArray();
            for(int j = 2; j<=3; j++){
                if(c == temp[j]){
                    System.out.println(sen[i]);
                    total++;
                    break;
                }
            }

        }
        System.out.print(total);
    }
}