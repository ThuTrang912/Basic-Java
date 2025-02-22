package pac26s;

public class OldAircon {
    public static final int COOL = 0;
    public static final int WARM = 1;
    private int mode = COOL;
    public void showMode() {
        if (mode == COOL) {
            System.out.println("【旧式エアコン】ただいま冷房中です！");
        } else {
            System.out.println("【旧式エアコン】ただいま暖房中です！");
        }
    }
    public void changeMode() {
        if (mode == COOL) {
            mode = WARM;
            System.out.println("【旧式エアコン】暖房に切り換えました！");
        } else {
            mode = COOL;
            System.out.println("【旧式エアコン】冷房に切り換えました！");
        }
    }
    public int getMode() { return mode; }
}
