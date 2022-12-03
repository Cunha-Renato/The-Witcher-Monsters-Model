package world.creatures;

import java.util.ArrayList;
import java.util.List;

import world.Date;
import world.ElementsEnum;

public class Mage extends Person
{
    private List<Construct> controledBeings;

    public Mage(String name, String race, Date bornDate, Date deathDate)
    {
        super(name, race, bornDate, deathDate);
        controledBeings = new ArrayList<Construct>();
    }

    public List<Construct> getControledBeings() 
    {
        return controledBeings;
    }

    public void createConstruct(String subSpecie)
    {
        if(subSpecie == "Golem")
            controledBeings.add(new Golem(this));
        
        else if(subSpecie == "Gargoyle")
            controledBeings.add(new Gargoyle(this));   
    }

    public void infuseConstruct(ElementsEnum element)
    {
        for(int i=0; i<controledBeings.size(); i++)
        {
            Construct subject = controledBeings.get(i);

            if(!subject.isInfused())
            {
                switch(element)
                {
                    case FIRE:
                        controledBeings.add(controledBeings.indexOf(subject), new FireElemental(this));
        
                        controledBeings.remove(subject);
                    break;
        
                    case EARTH:
                        controledBeings.add(controledBeings.indexOf(subject), new EarthElemental(this));
            
                        controledBeings.remove(subject);
                    break;
        
                    case ICE:
                        controledBeings.add(controledBeings.indexOf(subject), new IceElemental(this));
            
                        controledBeings.remove(subject);
                    break;
        
                    default:
                    break;
                }

                break;
            }
        }
    }
}
