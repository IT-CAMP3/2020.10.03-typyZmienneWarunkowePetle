public class Main3 {
    public static void main(String[] args) {
        int[] tab;
        tab = new int[10];

        String[] stringTab = new String[10];

        tab[5] = 5;

        System.out.println(tab[0]);

        System.out.println(stringTab[0]);

        boolean[] boolTab = new boolean[5];

        System.out.println(boolTab[0]);
        char[] chars = new char[5];

        System.out.println(chars[0]);

        tab[0] = 0;
        tab[1] = 1;
        tab[2] = 2;
        tab[3] = 3;
        tab[4] = 4;

        System.out.println(tab[0]);

        int[] tablica = {0,1,2,3,10};

        System.out.println(tablica[0]);
        System.out.println(tablica[4]);

        int[][] tablicaDwuwymiarowa = new int[5][5];

        tablicaDwuwymiarowa[2][2] = 1;
    }
}
