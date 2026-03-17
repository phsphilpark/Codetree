import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];

        int n3=0;
        int n5=0;

        for(int i=0;i<10;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
            if(a[i]%3==0){
                n3++;
            }
            if(a[i]%5==0){
                n5++;
            }
        }

        System.out.print(n3 +" " + n5);
    }
}