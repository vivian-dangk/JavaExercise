
package lesson4;
import java.util.Scanner;
public class LonnhatExercise5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap ba so bat ky: ");
        int a = nhap.nextInt();
        int b = nhap.nextInt();
        int c = nhap.nextInt();
        int max = 0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(c>max){
            max=c;
        }
        
        int max2 = Math.max(a, Math.max(b, c));
                
        System.out.println("So lon nhat la: " + max);
        System.out.println("So lon nhat la: " + max2);
    }
}