package revolution.revelation.foundation.init;

import revolution.revelation.core.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class FoundationBlocks {
	
	//Ores
	public static Block oreTin;
	public static Block oreCopper;
	public static Block oreSilver;
	public static Block oreLead;
	
	public static void init()
	{
		
	}
	
	public static void register()
	{
		
	}
	
	public static void registerRenders()
	{
		
	}

	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
