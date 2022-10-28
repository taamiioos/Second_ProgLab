package moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {

        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            p.setMod(Stat.SPECIAL_ATTACK, 6);
        }
    }

    @Override
    protected String describe() {
        return "использует ChargeBeam";
    }
}