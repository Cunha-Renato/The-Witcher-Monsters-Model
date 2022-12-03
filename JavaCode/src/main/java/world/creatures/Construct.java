package world.creatures;

import world.BombsEnum;
import world.OilsEnum;

public class Construct extends Monster
{
    private boolean infused;
    private Mage master;
    
    protected Construct()
    {
        master = null;
        infused = false;

        getWeakBombs().add(BombsEnum.DIMERITIUM_BOMB);
        getWeakOils().add(OilsEnum.ELEMENTA_OIL);
    }

    protected Construct(Mage master)
    {
        infused = false;
        this.master = master;

        getWeakBombs().add(BombsEnum.DIMERITIUM_BOMB);
        getWeakOils().add(OilsEnum.ELEMENTA_OIL);
    }

    public boolean isInfused() {return infused;}
    protected void setInfused(boolean infused) {this.infused = infused;}

    protected void setMaster(Mage master) {this.master = master;}
    public Mage getMaster() {return master;}
}
