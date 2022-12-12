package world.creatures;

import java.util.ArrayList;
import java.util.List;

public class NecrophageGlobalPopulation 
{
    private static List<Necrophage> members = new ArrayList<Necrophage>();

    private static List<NecrophageHuntingGroup> group = new ArrayList<NecrophageHuntingGroup>();

    private boolean groupExists(Necrophage subject)
    {
        String aux = subject.getLocation().getName();

        for(NecrophageHuntingGroup nhg : group)
            if(nhg.getAreaName() == aux)
                return true;
        
        return false;
    }

    private void addToGroup(Necrophage subject)
    {
        String aux = subject.getLocation().getName();

        for(NecrophageHuntingGroup nhg : group)
            if(nhg.getAreaName() == aux)
            {
                nhg.add(subject);
                break;
            }
        
    }

    protected void add(Necrophage subject)
    {
        members.add(subject);

        if(!groupExists(subject))
            group.add(new NecrophageHuntingGroup(subject.getLocation().getName()));
        
        addToGroup(subject);
    }
    protected void remove(Necrophage subject)
    {
        members.remove(subject);
    }

    protected List<Necrophage> getGroup(Necrophage subject)
    {
        String aux = subject.getLocation().getName();

        for(NecrophageHuntingGroup nhg : group)
            if(nhg.getAreaName() == aux)
                return nhg.getList();

        return null;
    }
}
