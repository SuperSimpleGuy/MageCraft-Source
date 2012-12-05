package greenwolf13.magecraft;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class MageCraftBlock extends Block {

   public MageCraftBlock (int id, int texture, Material material, CreativeTabs tab, String name) {
      super(id, texture, material);
      setCreativeTab(tab);
      setBlockName(name);
   }
   
   @Override
   public String getTextureFile () {
      return CommonProxy.BLOCK_PNG;
   }

}