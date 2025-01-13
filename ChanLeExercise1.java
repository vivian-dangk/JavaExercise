
package lesson4;
import java.util.Scanner;
public class ChanLeExercise1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap so bat ky: ");
        int a = nhap.nextInt();
        if(a%2==0){
            System.out.println(a + " la so chan.");
        }else{
            System.out.println(a + " la so le.");
        }
    }
}
