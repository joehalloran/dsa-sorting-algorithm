/**
 * Created by j.halloran on 12/06/2017.
 */
public class ParkingTester {
    public static void main(String[] args) {
        ParkingTester pt = new ParkingTester();
        for (int i = 1; i < 11; i++) {
            System.out.println(pt.recursivePark(i));
        }
        for (int i = 1; i < 11; i++) {
            System.out.println(pt.pizza(i));
        }
    }

    public int recursivePark(int x){
        if (x == 1 || x == 2){
            return 1;
        } else if (x == 3) {
            return 2;
        } else {
            return recursivePark(x-1) + recursivePark(x - 3);
        }
    }

    public int pizza(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 + pizza(n -1);
        }
    }
}
