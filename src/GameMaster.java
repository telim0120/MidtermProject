public class GameMaster {
    public static void main(String[] args) {
        Hero abel = new Hero("アベル", 100, "銅の剣");
        Slime slime = new Slime("スライムA", 30);

        System.out.println("冒険が始まる…！");
        abel.showStatus();
        slime.showStatus();

        System.out.println("戦闘開始！");

        abel.attack(slime);
        slime.showStatus();

        slime.attack(abel);
        abel.showStatus();

        abel.heal();
        abel.showStatus();

        abel.attack(slime);
        abel.attack(slime);
        abel.attack(slime);

        System.out.println("--- 戦闘終了 ---");
        System.out.println("最終ステータス：");
        abel.showStatus();
        slime.showStatus();

        System.out.println("アベルは生きている：" + abel.isAlive());
        System.out.println("スライムAは生きている：" + slime.isAlive());

        System.out.println("--- 参照の確認 ---");
        Character partyMember = abel;
        partyMember.hp -= 50;

        System.out.println("partyMember経由でHPを減らした後：");
        abel.showStatus();
    }
}
