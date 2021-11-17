public class App {
    public static void main(String[] args) throws Exception {


        LinearniSeznam<Integer> seznam = new LinearniSeznam<>();
        seznam.vlozPrvni(15);
        seznam.vlozPredchozi(7);
        seznam.VymazatPrvni();
        seznam.vlozNasledujici(34);
        

        seznam.VypsatSeznam();
    }
}
