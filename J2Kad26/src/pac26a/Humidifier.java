package pac26a;
interface Humidifier{
    public void hmdOn();
    public void hmdOff();
}
class HumidifierTypeA implements Humidifier{
    public void hmdOn() { System.out.println("【加湿器A】ONにしました！");}
    public void hmdOff() { System.out.println("【加湿器A】OFFにしました！");}
}
