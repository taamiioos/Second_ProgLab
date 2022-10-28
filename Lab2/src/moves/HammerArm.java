package moves;

import ru.ifmo.se.pokemon.*;

public class HammerArm extends PhysicalMove {
    public HammerArm() {
        super(Type.FIGHTING, 100, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.SPEED, -6);
        }
    }

    @Override
    protected String describe() {
        return "использует HammerArm";
    }
}