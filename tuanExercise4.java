
package lesson4;
import java.util.Scanner;
public class tuanExercise4 {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap so tu 1-7:  ");
        int a = nhap.nextInt();
        switch(a){
            case 1: System.out.println("Thu hai."); break;
            case 2: System.out.println("Thu ba."); break;
            case 3: System.out.println("Thu tu."); break;
            case 4: System.out.println("Thu nam."); break;
            case 5: System.out.println("Thu sau."); break;
            case 6: System.out.println("Thu bay."); break;
            case 7: System.out.println("Chu nhat."); break;
            default: System.out.println("Khong co thu nay.");
        }
    }
}
