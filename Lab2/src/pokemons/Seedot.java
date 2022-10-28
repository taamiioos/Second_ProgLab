package pokemons;
import moves.Facade;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seedot extends Pokemon{
    public Seedot(String name, int level){
        super(name, level);
        Super.setType(Type.GRASS);
        Super.setstats(40, 40, 50, 30, 30, 30);
        Super.setMove(new Facade());
    }
}
