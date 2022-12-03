package world.creatures;


import world.BombsEnum;
import world.OilsEnum;
import world.SignsEnum;

public class Wraith extends Specter
{
    protected Wraith()
    {
        this.setSubSpecie("Wraith");

        this.getWeakBombs().add(BombsEnum.MOON_DUST);

        this.getWeakOils().add(OilsEnum.SPECTER_OIL);

        this.getWeakSigns().add(SignsEnum.YRDEN);
        this.getWeakSigns().add(SignsEnum.QUEN);
    }
}
