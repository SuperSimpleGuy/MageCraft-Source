package greenwolf13.magecraft;

import net.minecraft.src.Item;
import net.minecraft.src.CreativeTabs;

public class MageCraftItem extends Item {
   
   public MageCraftItem(int id, int maxStackSize, CreativeTabs tab, int texture, String name) {
      super(id);
      setMaxStackSize(maxStackSize);
      setCreativeTab(tab);
      setIconIndex(texture);
      setItemName(name);
      }

   }