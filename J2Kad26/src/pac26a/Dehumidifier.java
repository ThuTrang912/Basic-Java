package pac26a;

interface Dehumidifier{
    public void dehmdOn();
    public void dehmdOff();
}
class DehumidifierTypeA implements Dehumidifier {
    public void dehmdOn() { System.out.println("【除湿器A】ONにしました！");}
    public void dehmdOff() { System.out.println("【除湿器A】OFFにしました！");}
}
