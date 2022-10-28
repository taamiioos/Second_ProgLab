package pokemons;
import moves.HammerArm;
import moves.IceBeam;
import moves.IronDefense;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Golett extends Pokemon{
    public Golett(String name, int level){
        super(name, level);
        Super.setType(Type.GROUND,Type.GHOST);
        Super.setstats(59, 74, 50, 35, 50, 35);
        Super.setMove(new IronDefense(), new IceBeam(), new HammerArm());
    }
}
