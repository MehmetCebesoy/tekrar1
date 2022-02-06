public class Main {

    public static void main(String[] args) {
        int sayi1=20;
        int sayi2;
        sayi2=25;
        int sayi3=2;
if (sayi1>sayi2){
    if(sayi1>sayi3){
        System.out.println("en büyük sayi"+sayi1);
    }}
else if(sayi2>sayi1){
        if(sayi2>sayi3){
            System.out.println("en büyük sayi"+sayi2);
        }}
        else{
            System.out.println("en büyük sayi"+sayi3);
        }
        // benim yaptığım çözüm üste
        int sayı1=20;
        int sayı2=25;
        int sayı3=2;
        int enBuyuk=sayı1;
        if(enBuyuk<sayı2){
            enBuyuk=sayı2;
        }
        if(enBuyuk<sayı3){
            enBuyuk=sayı3;
        }
        System.out.println("en büyük sayı = "+enBuyuk);

    }
}
