package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Pokemon{
    public Nuzleaf(String name, int level){
        super(name, level);
        setType(Type.GRASS,Type.DARK);
        setstats(70, 70, 40, 60, 40, 60);
        setMove(new Facade(), new Confide(), new LeafBlade());
    }
}
