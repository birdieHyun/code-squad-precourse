package precourse.firstweek.mon;

import java.util.Scanner;

public class Alarm {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(H <0 || H > 23 || M < 0 || M > 59){
            System.out.println("오류입니다.");
        }

        if((M-45) < 0){
            if(H == 0){
                System.out.println((23) + " " + (M+15));
            }if(H > 0) {
                System.out.println((H - 1) + " " + (M+15));
            }
        }
        if((M-45) >= 0){
            System.out.println(H + " " + (M-45));
        }
    }
}
