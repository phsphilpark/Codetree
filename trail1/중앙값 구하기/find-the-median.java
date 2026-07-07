import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int max;
        int mid;
        int min;

        max = a;
        if(b>=max){
            max=b;
            mid=a;
            if(c>=max){
                max=c;
                mid=b;
                min=a;
            }else if(c>=mid){
                mid=c;
                min=a;
            }else{
                min=c;
            }
        }else{
            mid=b;
            if(c>=max){
                max=c;
                mid=a;
                min=b;
            }else if(c>=mid){
                mid=c;
                min=b;
            }else{
                min=c;
            }
        }
        System.out.print(mid);
    }
}