package greenwolf13.magecraft.client;

import net.minecraftforge.client.MinecraftForgeClient;
import greenwolf13.magecraft.CommonProxy;

public class ClientProxy extends CommonProxy {
   public void registerRenderers () {
      MinecraftForgeClient.preloadTexture(ITEMS_PNG);
      MinecraftForgeClient.preloadTexture(BLOCK_PNG);
   }
}