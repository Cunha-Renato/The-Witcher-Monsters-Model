package world.creatures;

import world.BombsEnum;
import world.Location;
import world.SignsEnum;

public class Alghoul extends Necrophage
{
    public Alghoul(Location location)
    {
        super(location);
        setSubSpecie("Alghoul");

        getWeakBombs().add(BombsEnum.NORTHERN_WIND);
        getWeakSigns().clear();
        getWeakSigns().add(SignsEnum.AXII);
    }
}
