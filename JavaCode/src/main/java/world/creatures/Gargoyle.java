package world.creatures;

import world.SignsEnum;

public class Gargoyle extends Construct
{
   protected Gargoyle(Mage master) 
   {
      super(master);
      setSubSpecie("Gargoyle");
      getWeakSigns().add(SignsEnum.QUEN);
   }    
}
