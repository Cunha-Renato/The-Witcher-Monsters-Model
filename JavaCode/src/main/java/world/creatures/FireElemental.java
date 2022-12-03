package world.creatures;

import world.BombsEnum;
import world.SignsEnum;

public class FireElemental extends Construct
{
   protected FireElemental(Mage master)
   {
      super(master);
      setSubSpecie("FireElemental");
      setInfused(true);

      getWeakBombs().add(BombsEnum.NORTHERN_WIND);
      getWeakSigns().add(SignsEnum.AARD);
   }
}
