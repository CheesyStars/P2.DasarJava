public class _27BreakContinueLabel {
    public static void main(String[] args) {
        //Membuat Variabel
        int a,b;
        System.out.println("Contoh Break Label");
        Mulai:
        //Perulangan For Bercabang
        for (a=0; a<2; a++) {
            for (b=0; b<3; b++) {
                //Percabangan If
                if (b == 1) {
                    break Mulai;
                }
                System.out.println("a = " +a+ " ;b = " +b);
            }
        }

        System.out.println("\nContoh Continue Label");
        Lanjut :
        for (a=0; a<2; a++) {
            for (b=0; b<3; b++) {
                if (b == 1) {
                    continue Lanjut;
                }
                System.out.println("a = " +a+ " ;b = " +b);
            }
        }
    }
}
