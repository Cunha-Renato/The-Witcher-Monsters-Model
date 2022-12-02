package world.creatures;

import java.util.ArrayList;

import world.BombsEnum;
import world.OilsEnum;
import world.SignsEnum;

public class Wraith extends Specter
{
    protected Wraith()
    {
        this.setSubSpecie("Wraith");

        this.setWeakBombs(new ArrayList<BombsEnum>());
        this.getWeakBombs().add(BombsEnum.MOON_DUST);

        this.setWeakOils(new ArrayList<OilsEnum>());
        this.getWeakOils().add(OilsEnum.SPECTER_OIL);

        this.setWeakSigns(new ArrayList<SignsEnum>());
        this.getWeakSigns().add(SignsEnum.YRDEN);
        this.getWeakSigns().add(SignsEnum.QUEN);
    }
}
