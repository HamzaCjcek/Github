import java.util.Scanner;

public class C03 {
    /*
    Problem Tanımı :
Basit 4 işlem yapan bir hesap makinesi kodlayınız....
Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
Kullanicidan iki sayi girmesini isteyiniz.
Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.

***cikan sonucla yeni bi islem yaptirmayi sectirip isleme devam ettirin
***hesap makinesi ve islemler methodla calissin.

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        C03 t=new C03();
        System.out.print("İlk Sayiyi Giriniz :");
        double a= scan.nextInt();
        System.out.print("Yapmak İstediğiniz İşlemin Sembolünü Gir :");
        char islem=scan.next().charAt(0);
        System.out.print("İkinci Sayiyi Giriniz :");
        double b= scan.nextInt();

        String abc="bla bla";
        switch (islem)
        {
            case '+':
                double x= t.toplama(a,b);
                String returnismi=t.isim(abc);
                System.out.println(x);
                System.out.println(returnismi);
                break;
            case '-':
                x= t.cıkarma(a,b);
                System.out.println(x);
                break;
            case '*':
                x= t.carpma(a,b);
                System.out.println(x);
                break;
            case '/':
                x= t.bolme(a,b);
                System.out.println(x);
                break;

        }

    }
    public String isim(String b) { // with arguments
        return b;
    }
    public double toplama(double x, double y) { // with arguments
        double z = x+y;
        return z;
    }
    public double cıkarma(double x, double y) { // with arguments
        double z = x-y;
        return z;
    }
    public double carpma(double x, double y) { // with arguments
        double z = x*y;
        return z;
    }
    public double bolme(double x, double y) { // with arguments
        double z = x/y;

        return z;
    }




}

