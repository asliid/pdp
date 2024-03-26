/**
 * Bu bir örnek Java sınıfıdır.
 */
public class ExampleClass {
    
    // Bu bir değişken tanımıdır
    private int number;
    
    /**
     * Bu bir constructor'dır.
     */
    public ExampleClass(int number) {
        this.number = number;
    }
    
    /**
     * Bu bir metodun javadoc açıklamasıdır.
     * Bu metod iki sayıyı toplar.
     * @param a Toplanacak ilk sayı
     * @param b Toplanacak ikinci sayı
     * @return Toplama işleminin sonucu
     */
    public int add(int a, int b) {
        return a + b;
    }
    
    // Bu bir başka metodun yorum satırıdır
    public void printNumber() {
        System.out.println("Number: " + number);
    }
}
