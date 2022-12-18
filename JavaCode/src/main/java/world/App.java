package world;

import java.util.List;
import java.util.ArrayList;

import world.creatures.*;

public class App 
{
    public static void main(String[] args)
    {
        //Showing the Necrophages classes
        WaterHag m1 = new WaterHag(new Location("Itajuba", "Urban"));
        Drowner m2 = new Drowner(new Location("SP", "Rural"));
        Drowner m3 = new Drowner(m1.getLocation());
        WaterHag m4 = new WaterHag(m2.getLocation());
        Ghoul m5 = new Ghoul(new Location("Novigrad", "urban"));
        Alghoul m6 = new Alghoul(m5.getLocation());

        System.out.println("\nThe Necrophages in the world are: ");
        for(Necrophage a : m1.getPopulation())
            System.out.println(a.getSubSpecie());

        System.out.println("\nIn Itajuba there are: ");
        for(Necrophage a : m3.getGroup())
            System.out.println(a.getSubSpecie());
        
        System.out.println("\nIn SP there are: ");
        for(Necrophage a : m4.getGroup())
            System.out.println(a.getSubSpecie());

        System.out.println("\nIn Novigrad there are: ");
        for(Necrophage a : m6.getGroup())
            System.out.println(a.getSubSpecie());

            

        System.out.println("\n-----------------------------------------------------------------------\n");
//----------------------------------------------------------------------------------------------------------------------------------
        
        //Creating persons and Specters (Here the chances of turnign into a ghost is 100% but only for demonstration)
        List<Person> listPerson = new ArrayList<Person>();
        listPerson.add(new Person("Julian", "Elf", new Location("Rio_Farm", "Rural"), new Date(12, 1, 1990, new Time(12, 0, 0)), null));
        
        listPerson.add(new Person("Carlos", "Dwarf", m2.getLocation(), new Date(1, 15, 2004, new Time(20, 1, 20)), null));

        listPerson.add(new Person("Ana", "Human", m1.getLocation(), new Date(6, 27, 2022, new Time(0, 0, 0)), null));

        System.out.println("The persons created are: ");
        for(Person p : listPerson)
            System.out.println(p.getName() + " - " + p.getRace());

        System.out.println("\nNow they will die 1 by 1:");
        for(Person p : listPerson)
        {
            p.setDeathDate(new Date(12, 25, 2022, p.getBornDate().getTime()));
            System.out.println(p.getName() + " - " + p.getGhost().getSubSpecie());
        }
        
        System.out.println("\n-----------------------------------------------------------------------\n");
//----------------------------------------------------------------------------------------------------------------------------------
        //Creating the mage and its constructs
        Mage mage = new Mage("Ryze", "Human", null, null, null);
        
        mage.createConstruct("Golem");
        mage.createConstruct("Gargoyle");
        mage.createConstruct("Golem");
        mage.createConstruct("Gargoyle");
        mage.createConstruct("Gargoyle");

        System.out.println("All the constructs under the mage's control: ");
        for(Construct c : mage.getControledBeings())
            System.out.println(c.getSubSpecie());

        System.out.println("\nNow 3 of them will be infused with 3 diferent elements: ");
        mage.infuseConstruct(ElementsEnum.FIRE);
        mage.infuseConstruct(ElementsEnum.ICE);
        mage.infuseConstruct(ElementsEnum.EARTH);

        for(Construct c : mage.getControledBeings())
            System.out.println(c.getSubSpecie());
    }
}
