package world;

public class Location 
{
    private String name;
    private String area; //Urban or Rural
    
    public Location(){}
    public Location(String name, String area)
    {
        this.name = name;
        this.area = area;
    }

    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getArea() 
    {
        return area;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }
}
