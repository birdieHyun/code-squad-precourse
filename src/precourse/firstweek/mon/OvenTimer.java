package precourse.firstweek.mon;

import java.util.Scanner;

public class OvenTimer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int min = (A*60) + B + C;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour +" " + minute);

    }
}
