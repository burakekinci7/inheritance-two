public class Main{
//sadece 1 class ı extends edilebilir!!!
    public static void main(String[] args) {
        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager());
    }
}