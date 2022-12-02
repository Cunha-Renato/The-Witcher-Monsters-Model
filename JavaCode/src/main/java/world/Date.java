package world;

public class Date 
{
    private int month;
    private int day;
    private int year;
    private Time time;

    public Date() 
    {
        month = 0;
        day = 0;
        year = 0;
        time = null;
    }
    public Date(int month, int day, int year, Time time)
    {
        this.month = month;
        this.day = day;
        this.year = year;
        this.time = time;
    }

    public int getMonth() 
    {
        return month;
    }
    public void setMonth(int month) 
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }
    public void setDay(int day) 
    {
        this.day = day;
    }

    public int getYear() 
    {
        return year;
    }
    public void setYear(int year) 
    {
        this.year = year;
    }

    public Time getTime() 
    {
        return time;
    }
    public void setTime(Time time) 
    {
        this.time = time;
    }
}
