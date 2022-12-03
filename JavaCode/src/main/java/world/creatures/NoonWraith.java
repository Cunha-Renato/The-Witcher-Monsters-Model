package world.creatures;

import world.BombsEnum;
import world.OilsEnum;
import world.SignsEnum;

public class NoonWraith extends Specter
{
    protected NoonWraith()
    {
        this.setSubSpecie("NoonWraith");

        this.getWeakBombs().add(BombsEnum.MOON_DUST);
    
        this.getWeakOils().add(OilsEnum.SPECTER_OIL);

        this.getWeakSigns().add(SignsEnum.YRDEN);
    }
}
