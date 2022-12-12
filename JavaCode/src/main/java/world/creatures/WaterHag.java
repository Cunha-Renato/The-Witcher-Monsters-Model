package world.creatures;

import world.BombsEnum;
import world.Location;
import world.SignsEnum;

public class WaterHag extends Necrophage
{
    public WaterHag(Location location)
    {
        super(location);
        setSubSpecie("WaterHag");

        getWeakBombs().add(BombsEnum.NORTHERN_WIND);
        getWeakSigns().add(SignsEnum.QUEN);
    }
    
}
