public class Main5 {
    public static void main(String[] args) {
        int a = 1;

        switch (a) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                System.out.println("cos tam");
                break;
            case 20:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
                default:
                    System.out.println("wieksze od 3");
                    break;
        }

        char b = 'M';

        switch (b) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;
                default:
                    System.out.println("Other");
                    break;
        }
    }
}
