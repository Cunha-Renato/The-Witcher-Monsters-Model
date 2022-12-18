package world.creatures;

import java.util.ArrayList;
import java.util.List;

public class NecrophageGlobalPopulation 
{
    private static List<Necrophage> members = new ArrayList<Necrophage>();
    private static List<NecrophageHuntingGroup> group = new ArrayList<NecrophageHuntingGroup>();

    private int groupExists(Necrophage subject)
    {
        String aux = subject.getLocation().getName();

        for(NecrophageHuntingGroup nhg : group)
            if(nhg.getAreaName() == aux)
                return group.indexOf(nhg);
        
        return -1;
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
        int index = groupExists(subject);

        members.add(subject);

        if(index == -1)
            group.add(new NecrophageHuntingGroup(subject.getLocation().getName()));
        
        addToGroup(subject);
    }
    protected void remove(Necrophage subject)
    {
        members.remove(subject);
    }

    protected List<Necrophage> getGroup(Necrophage subject)
    {
        int index = groupExists(subject);

        if(index != -1)
            return group.get(index).getList();

        return null;
    }
    protected List<Necrophage> getPopulation() {return members;}
}
