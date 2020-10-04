public class Main4 {
    public static void main(String[] args) {
        int a = 7;

        if(a >= 5) {
            System.out.println("Działa !!!");
        } else if(a < 1) {
            System.out.println("Trochę działa !!!");
        } else if(a == 3) {
            //cos tam
        } else {
            System.out.println("Nie działa !!!");
        }

        switch (a) {
            case 1:
                //cos tam 1
            case 2:
                //cos tam 2
            case 3:
                //cos tam 3
                default:
                    //cos tam 4
        }

        if(a == 1) {
            //cos tam 1
        } else if(a == 2) {
            //cos tam 2
        } else if(a == 3) {
            //cos tam 3
        } else {
            //cos tam 4
        }

        System.out.println("Koniec programu !!");
    }
}
