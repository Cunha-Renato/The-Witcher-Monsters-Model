package world.creatures;

import world.BombsEnum;
import world.Location;

public class Ghoul extends Necrophage
{
    public Ghoul(Location location)
    {
        super(location);
        setSubSpecie("Ghoul");

        getWeakBombs().add(BombsEnum.NORTHERN_WIND);
        getWeakSigns().clear();
    }
}
