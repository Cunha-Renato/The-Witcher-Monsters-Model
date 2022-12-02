package world;

import world.creatures.*;

public class App 
{
    public static void main(String[] args)
    {
        Person person = new Person("Renato", "Human", new Date(1, 1, 2022, new Time(11, 0, 0)), null);

        person.setDeathDate(new Date(1, 2, 2022, new Time(1, 0, 0)));

        System.out.println(person.getGhost().getPastSelf().getName()); 
    }
}
