package Before;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Controller rc = new Controller();
        rc.setAircon(new AirconTypeA());
        rc.setHumidifier(new HumidifierTypeA());
        rc.setDehumidifier(new DehumidifierTypeA());

        while(true) {
            rc.showCommand();
            System.out.print("どのボタンを押しますか？＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;
            rc.pushButton(n);
            System.out.println();
        }
    }
}
