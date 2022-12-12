package world.creatures;

import java.util.Random;

import world.Date;
import world.Location;

public class Person 
{
    private String name;
    private String race;
    private Location location;
    private Date bornDate;
    private Date deathDate;
    private Specter ghost;

    public Person() 
    {
        name = " ";
        race = " ";
        location = null;
        bornDate = null;
        deathDate = null;
        ghost = null;
    }
    public Person(String name, String race, Location location, Date bornDate, Date deathDate)
    {
        this.name = name;
        this.race = race;
        this.location = location;
        this.bornDate = bornDate;
        ghost = null;

        setDeathDate(deathDate);
    }
    
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getRace() 
    {
        return race;
    }

    public Date getBornDate() 
    {
        return bornDate;
    }
    public void setBornDate(Date date) {this.bornDate = date;}

    public Specter getGhost() 
    {
        return ghost;
    }

    public Date getDeathDate()
    {
        return deathDate;
    }
    public void setDeathDate(Date when)
    {
        deathDate = when;

        if(deathDate != null)
        {
            Random rand = new Random();

            if(rand.nextInt(100) <= 100)
            {
                int deathHour = deathDate.getTime().getHours();

                if((deathHour < 19 && deathHour >= 6) && location.getArea() == "Rural")
                    ghost = new NoonWraith();
                else if((deathHour < 6 || deathHour >= 19) && location.getArea() == "Rural")
                    ghost = new NightWraith();
                else
                    ghost = new Wraith();

                ghost.setPastSelf(this);
            }
        }
    }
    
    public Location geLocation() {return location;}
    public void setLocation(Location location) {this.location = location;}
}
