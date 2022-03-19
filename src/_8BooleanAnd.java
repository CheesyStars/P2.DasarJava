public class _8BooleanAnd {
    public static void main(String[] args) {
        //Mendeklarasikan & Menginisialisasikan Variabel
        int a = 5, b = 7;
        //Melakukan Perbandingan Menggunakan Operaor Boolean And "&"
        if ((a < 2) & (b++ < 10)) {
            b +=2;
        }
        //Menampilkan Variabel
        System.out.println(b);
    }
}
