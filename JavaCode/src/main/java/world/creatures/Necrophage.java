package world.creatures;

import java.util.List;
import world.Location;
import world.OilsEnum;
import world.SignsEnum;

public abstract class Necrophage extends Monster
{
    private Location location;
    private static NecrophageGlobalPopulation globalPopulation;

    public Necrophage(Location location)
    {
        super();
        this.location = location;
        this.getWeakOils().add(OilsEnum.NECROPHAGE_OIL);
        this.getWeakSigns().add(SignsEnum.IGNI);

        if(globalPopulation == null)
            globalPopulation = new NecrophageGlobalPopulation();


        globalPopulation.add(this);
    }

    public Location getLocation() {return location;}
    public void setLocation(Location location) {this.location = location;}

    public List<Necrophage> getGroup() {return globalPopulation.getGroup(this);}
    public List<Necrophage> getPopulation() {return globalPopulation.getPopulation();}
}
