package world.creatures;

import world.BombsEnum;
import world.OilsEnum;
import world.SignsEnum;

public class NightWraith extends Specter
{
    protected NightWraith()
    {
        this.setSubSpecie("NightWraith");

        this.getWeakBombs().add(BombsEnum.MOON_DUST);
    
        this.getWeakOils().add(OilsEnum.SPECTER_OIL);

        this.getWeakSigns().add(SignsEnum.YRDEN);
    }
}
