package greenwolf13.magecraft;

import java.util.Random;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class MageCraftRubyOreBlock extends Block {

   public MageCraftRubyOreBlock (int id, int texture, Material material, CreativeTabs tab, String name) {
      super(id, texture, material);
      setCreativeTab(tab);
      setBlockName(name);
   }
   
   @Override
   public String getTextureFile () {
      return CommonProxy.BLOCK_PNG;
   }

   public int idDropped(int par1, Random random, int par2) {
      return MageCraft.itemRubyMageCraft.shiftedIndex;
   }

}