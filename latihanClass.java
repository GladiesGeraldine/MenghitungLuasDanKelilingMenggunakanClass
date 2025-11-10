public class latihanClass {
    public static void main(String[] args) {
        Segitiga sgtg=new Segitiga(6,4,6,7);

        System.out.println("SEGITIGA");
        System.out.println("Luas: " +sgtg.getLuas());
        System.out.println("Keliling: " +sgtg.getKeliling());
        System.out.println();

        Persegi psg=new Persegi(4);

        System.out.println("PERSEGI");
        System.out.println("Luas: " +psg.getLuas());
        System.out.println("Keliling: " +psg.getKeliling());
        System.out.println();

        Lingkaran lgkr=new Lingkaran(14);

        System.out.println("LINGKARAN");
        System.out.printf("Luas: %.2f\n" ,lgkr.getLuas());
        System.out.printf("Keliling: %.2f" ,lgkr.getKeliling());
        System.out.println();
    }
}
