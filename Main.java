import heroes.Elf;
import heroes.Hero;
import heroes.Knight;
import heroes.Wizard;

public class Main {
    public static void main(String[] args) throws Exception {
        Hero legolas = new Elf("Legolas", 1, 70, 1);
        legolas.put (new HealthPotion(5), 1);
        legolas.useItem(1);
        System.out.println(legolas.action(null));
        System.out.println(legolas.toString());

        Hero arthur = new Knight("Arthur", 35, 70, 100, 24);
        arthur.change(new Sword (2.5));
        System.out.println(arthur.action(legolas));
        System.out.println(arthur.action(legolas));

        Hero merlin = new Wizard("Merlin", 100, 100, 100, 80);
        merlin.change(new Sword (2.5));
        merlin.levelUp();
    }
}
