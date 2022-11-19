import java.util.Scanner;

public class TwoPoints {
    public static int computePointOfInterception(int x, int y) {
                  //TODO Add your implementation here

        while(true) {

            if(x == y)
                return x;

            if(x == 10) x = 0;
            if(x == 11) x = 1;
            if(y == 11) y = 0;

            x += 2;
            y += 1;
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two no. : ");
        int x = sc.nextInt();
        int y = sc.nextInt();


        System.out.println(computePointOfInterception(x, y));

    }
}
