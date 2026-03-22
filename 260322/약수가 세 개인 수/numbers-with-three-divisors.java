import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int st = sc.nextInt();
        int ed = sc.nextInt();
        int total = 0;
        for(int i = st; i<= ed; i++){
            int temp = 0;
            for(int j = 1; j<=i;j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(temp==3){
                total++;
            }
        }
        System.out.print(total);
    }
}