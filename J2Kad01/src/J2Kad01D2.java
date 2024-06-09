/*
    課題名：J2Kad01D2「フィールド」
    作成日：2022/09/26
    作成者：田中太郎
 */
public class J2Kad01D2 {
    static int x = 10;
    public static void main(String[]args){
        add5();
        add5();
        add5();
        System.out.println("x：" + x);
    }
    public static void add5(){
        x += 5;
        System.out.println("x に5 を足しました！");

    }
}
