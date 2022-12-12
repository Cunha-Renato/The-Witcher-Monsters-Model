package world.creatures;

import java.util.ArrayList;
import java.util.List;

public class NecrophageHuntingGroup 
{
    private String areaName;
    protected List<Necrophage> members = new ArrayList<Necrophage>();

    protected NecrophageHuntingGroup(String areaName)
    {
        this.areaName = areaName;
    }

    protected void add(Necrophage subject)
    {
        members.add(subject);
    }
    protected void remove(Necrophage subject)
    {
        members.remove(subject);
    }

    protected String getAreaName() {return areaName;}
    protected List<Necrophage> getList() {return members;}
}
