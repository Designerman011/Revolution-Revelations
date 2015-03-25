package revolution.revelation.foundation.init;

import revolution.revelation.core.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class FoundationItems {

	public static void init()
	{
		
	}
	
	public static void register()
	{
		
	}
	
	public static void registerRenders()
	{
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
