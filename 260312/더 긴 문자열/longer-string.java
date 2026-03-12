import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String m = sc.nextLine();
        String[] ar = m.split(" ");

        if(ar[0].length()>ar[1].length()){
            System.out.print(ar[0] + " " + ar[0].length());
        }else if(ar[0].length()==ar[1].length()){
            System.out.print("same");
        }else{
            System.out.print(ar[1] + " " + ar[1].length());
        }
    }
}