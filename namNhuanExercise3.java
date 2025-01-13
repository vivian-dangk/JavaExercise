
package lesson4;
import java.util.Scanner;
public class namNhuanExercise3 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap nam: ");
        int a = nhap.nextInt();
        if(a%4==0&&a%100!=0){
            System.out.println("Nam " + a + " la nam nhuan.");
        }else{
            System.out.println("Nam " + a + " khong phai nam nhuan.");
        }
    }
}
