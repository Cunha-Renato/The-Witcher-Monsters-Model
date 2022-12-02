package world.creatures;

public abstract class Specter extends Monster
{
    private Person pastSelf;

    public Person getPastSelf() 
    {
        return pastSelf;
    }
    public void setPastSelf(Person pastSelf) 
    {
        this.pastSelf = pastSelf;
    }
}
