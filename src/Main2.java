public class Main2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int wynik;

        wynik = a / b;

        System.out.println(wynik);

        boolean logiczna1;
        logiczna1 = wynik == b;
        System.out.println(logiczna1);
        logiczna1 = !logiczna1;
        System.out.println(logiczna1);

        //System.out.println(3 > 7);

        int i = 0;

        System.out.println(i++);
        System.out.println(++i);

        System.out.println(i--);
        System.out.println(--i);


    }
}
