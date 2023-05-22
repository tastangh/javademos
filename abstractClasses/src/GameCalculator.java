public abstract class GameCalculator {
    //abstract classta illa abstract func olacak diye bişi de yok.
    public abstract void hesapla();
    //abstract olarak tanımlayınca diyor ki bunu herkes kendine göre tanımlamalı yani
    // yani annenin tüm çocuklarında bu işlem ayrı ayrı olmalı örn : yoğurt yiyiş :)


    public final void gameOver(){
        // final olarak tanımlanınca diyor ki bunun tanımı 1 tane yani
        // yani tüm çocuklara annenin adı ne diyince aynı cevabı versin.

        System.out.println("Oyun bitti.");

    }


}
