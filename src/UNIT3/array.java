package UNIT3;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i =0 ; i < a.length;i++){
            a[i]= sc.nextInt();
        }
    }
}
