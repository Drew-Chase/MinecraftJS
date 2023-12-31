package chase.minecraft.architectury.minecraftjs;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MinecraftJS
{
	public static final String MOD_ID = "minecraftjs";
	public static final Logger log = LogManager.getLogger(MOD_ID);
	
	public static void init()
	{
		ScriptLoader.Instance.LoadScripts();
	}
	
	public static ResourceLocation getModResource(String name)
	{
		return new ResourceLocation(MOD_ID, name);
	}
	
}