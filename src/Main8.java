import java.util.Random;

public class Main8 {
    public static void main(String[] args) {
        Random r = new Random();

        int[] numbers = new int[100];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(1000);
        }

        for (int liczba : numbers) {
            System.out.println(liczba);
        }

        for (int liczba : numbers) {
            if(liczba == 5) {
                System.out.println("Znaleziono !!!");
                break;
            }
        }


    }
}
