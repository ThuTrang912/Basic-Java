package J2Test;

public class SwimMonster extends Monster {
    public SwimMonster(String name) {
        super(name);
        System.out.println("SwimMonster！");
        }
    public void intro() {
        super.intro();			// Monsterのintro
        System.out.println("泳ぎが得意さ！");
    }
}

