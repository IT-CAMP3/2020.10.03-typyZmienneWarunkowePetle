public class Main7 {
    public static void main(String[] args) {
        int tab[] = new int[1000];

        for(int i = 0; i < 1000; i++) {
            tab[i] = i;
        }

        /*for (int i = 0; i < 1000; i++) {
            System.out.println(tab[i]);
        }*/

        for(int wartoscWyplutaZTablicy : tab) {
            System.out.println(wartoscWyplutaZTablicy);
            break;
        }
    }
}
