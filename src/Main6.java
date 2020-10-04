public class Main6 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        tab[0] = 0;
        tab[1] = 1;


        System.out.println(tab[0]);
        System.out.println(tab[1]);

        int i = 100;
        /*while (i < 100) {
            i++;
            System.out.println("Pętla działa !!");
        }*/

        do {
            System.out.println("Pętla się kręci");
        } while (i < 100);

        for(int zmienna = 0; zmienna < 10; zmienna++) {
            System.out.println(zmienna);
        }
    }
}
