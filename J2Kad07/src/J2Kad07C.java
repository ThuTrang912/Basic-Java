/*
	課題名：J2Kad07D「RPGキャラクター」
	作成日：2022/10/20
	作成者：田中太郎
*/
import java.awt.image.RGBImageFilter;
import java.util.Scanner;

public class J2Kad07C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("ジョブを選んでください（0：戦士、1：魔法使い、2：モンク、-1：終了）＞");
            RPGCharacter[] characters = {new Fighter() , new Mage() , new Monk()};
            int job = in.nextInt();
            if (job < 0) break;
            characters[job].checkAllAction();

            System.out.println();
        }
    }
}
