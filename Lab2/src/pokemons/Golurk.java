package pokemons;
import moves.HammerArm;
import moves.IceBeam;
import moves.IronDefense;
import moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Golurk extends Pokemon{
    public Golurk(String name, int level){
        super(name, level);
        Super.setType(Type.GROUND,Type.GHOST);
        Super.setstats(89, 124, 80, 55, 80, 55);
        Syper.setMove(new IronDefense(), new IceBeam(), new HammerArm(), new Thunderbolt());
    }
}
