package Lab2;
import ru.ifmo.se.pokemon.*;
import pokemons.*;
public class Battleground {
    public static void main(String[] args){
        Battle b = new Battle();
        Seedot p1 = new Seedot("Шелли", 2);
        Shiftry p2 = new Shiftry("Кольт", 1);
        Girafarig p3 = new Girafarig("Нита", 1);
        Nuzleaf p4 = new Nuzleaf("Джесси", 1);
        Golett p5 = new Golett("Роза", 2);
        Golurk p6 = new Golurk("Эль Примо", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
