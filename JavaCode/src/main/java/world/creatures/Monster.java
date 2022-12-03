package world.creatures;

import world.BombsEnum;
import world.OilsEnum;
import world.SignsEnum;

import java.util.ArrayList;
import java.util.List;

public abstract class Monster 
{
    private String subSpecie;
    private List<BombsEnum> weakBombs;
    private List<OilsEnum> weakOils;
    private List<SignsEnum> weakSigns;

    protected Monster() 
    {
        subSpecie = " ";
        weakBombs = new ArrayList<BombsEnum>();
        weakOils = new ArrayList<OilsEnum>();
        weakSigns = new ArrayList<SignsEnum>();
    }
    protected Monster(String subSpecie, List<BombsEnum> weakBombs, List<OilsEnum> weakOils, List<SignsEnum> weakSigns)
    {
        this.subSpecie = subSpecie;
        this.weakBombs = weakBombs;
        this.weakOils = weakOils;
        this.weakSigns = weakSigns;
    }
    public String getSubSpecie() 
    {
        return subSpecie;
    }
    public void setSubSpecie(String subSpecie) 
    {
        this.subSpecie = subSpecie;
    }
    
    public List<BombsEnum> getWeakBombs() 
    {
        return weakBombs;
    }
    public void setWeakBombs(List<BombsEnum> weakBombs) 
    {
        this.weakBombs = weakBombs;
    }
    
    public List<OilsEnum> getWeakOils() 
    {
        return weakOils;
    }
    public void setWeakOils(List<OilsEnum> weakOils) 
    {
        this.weakOils = weakOils;
    }
    
    public List<SignsEnum> getWeakSigns() 
    {
        return weakSigns;
    }
    public void setWeakSigns(List<SignsEnum> weakSigns) 
    {
        this.weakSigns = weakSigns;
    }
}
