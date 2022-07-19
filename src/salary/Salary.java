
package salary;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("به برنامه محاسبه حقوق خوش آمدید");
        System.out.println("عدد سمت شخص را وارد کنید");
        System.out.println("1-مدیر\n2-کارگر ساعتی\n3-کارگر کمیسیونی\n4-کارگر مقاطعه کار");
        int a = s.nextInt();
       
            if (a==1) {
                Modir();
            }
            if (a==2) {
                KargarSaati();
            }
            if (a==3) {
                KargarKomision();
            }
            if (a==4) {
               MaqateKar();
        }
    }
 
    public static void Modir (){
        Scanner s = new Scanner (System.in);
        System.out.println("حقوق هفتگی را وارد کنید...");
        int a = s.nextInt();
        System.out.println("حقوق هقتگی برابر است با :");
        System.out.println(a);
        System.out.println("حقوق ماهانه برابر است با :");
        int salary = (a/7)*30;
        System.out.println(salary);
    }    
    public static void KargarSaati (){
        Scanner s = new Scanner (System.in);
        System.out.println("ساعات کار در هقته را وارد کنید");
        int saatkar = s.nextInt();
        System.out.println("دستمزد هر ساعت کار را وارد کنید");
        int dastmozd= s.nextInt();
        if (saatkar>40) {
          int saatezafe = saatkar-40;
          double  ezafekar = saatezafe *(dastmozd*(1.5)); 
          System.out.format("حقوق اضافه کار : %d \n",(int)ezafekar);
          int a = saatkar* dastmozd +(int) ezafekar;
        System.out.format("حقوق کل هفتگی برابر است با : %d \n", a);
        int salary = (a/7)*30;
        System.out.format("حقوق کل ماهانه برابر است با : %d \n", salary);
        }else{
        int a = saatkar*dastmozd;
        System.out.format("حقوق هفتگی برابر است با : %d \n", a);
        int salary = (a/7)*30;
        System.out.format("حقوق ماهانه برابر است با : %d \n", salary);
        }
    }
    public static void KargarKomision (){
        double salary = 250000+((250000/100)*5.7);
        System.out.format("حقوق هفتگی برابر است با : %d \n",(int)salary);
        int a =(int)((salary/7)*30);
        System.out.format("حقوق ماهانه برابر است با : %d \n",a);
    }
    public static void MaqateKar () {
        Scanner s = new Scanner (System.in);
        System.out.println("قیمت محصول تولید شده را وارد کنید");
        double qeymat_mahsul = s.nextInt();
        System.out.println("تعداد محصول تولید شده را وارد کنید");
        int tedad_nahsul = s.nextInt();
        System.out.println("دستمزد تولید هر محصول تولید شده را وارد کنید");
        double dastmozd = s.nextInt();
        int salary = (int) ((((int)qeymat_mahsul)+dastmozd)*tedad_nahsul);
        System.out.format("حقوق هفتگی برابر است با : %d \n",(int)salary);
        int a =(int)((salary/7)*30);
        System.out.format("حقوق ماهانه برابر است با : %d \n",a);
        
        
    }
}

