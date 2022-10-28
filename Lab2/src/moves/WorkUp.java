package moves;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends PhysicalMove {
    public WorkUp() {
        super(Type.NORMAL, 0 , 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 1) {
            p.setMod(Stat.SPECIAL_ATTACK);
            ;
        }
    }

    @Override
    protected String describe() {
        return "использует WorkUp";
    }
}