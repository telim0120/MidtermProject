public class GameMaster {
    public static void main(String[] args) {
        Hero abel = new Hero("アベル", 100, "銅の剣");
        Slime slimeA = new Slime("スライムA", 30);

        System.out.println("冒険が始まる…！");
        abel.showStatus();
        slimeA.showStatus();

        System.out.println("戦闘開始！");
        abel.attack(slimeA);
        slimeA.showStatus();

        slimeA.attack(abel);
        abel.showStatus();

        abel.heal();
        abel.showStatus();

        abel.attack(slimeA);
        abel.attack(slimeA);
        abel.attack(slimeA);

        abel.showStatus();
        slimeA.showStatus();

        System.out.println(abel.name + "は生きているか？ " + abel.isAlive());
        System.out.println(slimeA.name + "は生きているか？ " + slimeA.isAlive());

        Character partyMember = abel;
        partyMember.hp -= 50;
        System.out.println("partyMember経由でHPを減らした後：");
        abel.showStatus();
    }
}
