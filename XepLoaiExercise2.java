
package lesson4;
import java.util.Scanner;
public class XepLoaiExercise2 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap diem trung binh (1-10): ");
        float gpa = nhap.nextFloat();
        if(gpa>=8){
            System.out.println("Gioi.");
        }else if(gpa>=6.5){
            System.out.println("Kha");
        }else if(gpa>=5){
            System.out.println("Trung binh.");
        }else{
            System.out.println("Yeu.");
        }
    }
}
