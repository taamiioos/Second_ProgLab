package pokemons;

import moves.Facade;
import moves.LeafBlade;

public class Shiftry extends Pokemon{
    public Shiftry(String name, int level){
        super(name, level);
        Super.setType(Type.GRASS,Type.DARK);
        Super.setStats(90, 100, 60, 90, 60, 80);
        Super.setMove(new Facade(), new LeafBlade());
    }
}
