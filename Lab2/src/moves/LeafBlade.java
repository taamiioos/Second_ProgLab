package moves;

import ru.ifmo.se.pokemon.*;

public class LeafBlade extends PhysicalMove {
    public LeafBlade() {

        super(Type.GRASS, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.15) {
            p.setMod(Stat.HP);
            ;
        }
    }

    @Override
    protected String describe() {

        return "использует LeafBlade";
    }
}