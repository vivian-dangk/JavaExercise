
package lesson4;
import java.util.Scanner;
public class ptbac2 {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap he so: ");
        int a = nhap.nextInt();
        int b = nhap.nextInt();
        int c = nhap.nextInt();
        float denta=b*b-4*a*c;
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("PT vo nghiem.");
                }
            }else{
                System.out.println("PT bac nhat co 1 nghiem: x = " + -c/b);
            }
        }else{
            if(denta==0){
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + -b/(2*a));
            }else if(denta>0){
            System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + ((-b-Math.sqrt(denta))/(2*a)) + " va x2 = " + ((-b+Math.sqrt(denta))/(2*a)));
            }else{
            System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}
