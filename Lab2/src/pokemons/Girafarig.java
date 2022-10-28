package pokemons;
import moves.ChargeBeam;
import moves.Thunder;
import moves.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Girafarig extends Pokemon{
    public Girafarig(String name, int level){
        super(name, level);
        Super.setType(Type.NORMAL,Type.PSYCHIC);
        Super.setStats(70, 80 , 65, 90, 65, 90, 65 ,85);
        Super.setMove(new WorkUp(), new ChargeBeam(), new Thunder());
    }
}
