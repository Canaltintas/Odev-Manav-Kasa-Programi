import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        float aFiyat,eFiyat,dFiyat,mFiyat,pFiyat;
        float aKg,eKg,dKg,mKg,pKg,tPrice;

        Scanner input = new Scanner(System.in);

        aFiyat=2.14f;
        eFiyat=3.67f;
        dFiyat=1.11f;
        mFiyat=0.95f;
        pFiyat=5.00f;

        System.out.print("Armut Miktarını Giriniz :");
        aKg=input.nextFloat();
        System.out.print("Elma Miktarını Giriniz :");
        eKg=input.nextFloat();
        System.out.print("Domates Miktarını Giriniz :");
        dKg=input.nextFloat();
        System.out.print("Muz Miktarını Giriniz :");
        mKg=input.nextFloat();
        System.out.print("Patlıcan Miktarını Giriniz :");
        pKg=input.nextFloat();

        tPrice=(aFiyat*aKg) + (eFiyat*eKg) + (dFiyat*dKg) + (mFiyat*mKg) + (pFiyat*pKg);

        System.out.println("Toplam : " +tPrice + " TL");




    }
}
