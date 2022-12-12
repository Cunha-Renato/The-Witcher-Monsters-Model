package world;

import world.creatures.*;

public class App 
{
    public static void main(String[] args)
    {
        //Showing the Necrophages classes
        WaterHag m1 = new WaterHag(new Location("Itajuba", "urbana"));
        Drowner m2 = new Drowner(new Location("SP", "rural"));
        Drowner m3 = new Drowner(m1.getLocation());
        WaterHag m4 = new WaterHag(m2.getLocation());

        System.out.println("Em Itajuba existem: ");
        for(Necrophage a : m3.getGroup())
            System.out.println(a.getSubSpecie());
        
        System.out.println("\nE em SP existem: ");
        for(Necrophage a : m4.getGroup())
            System.out.println(a.getSubSpecie());

        //Creating persons and 
    }
}
