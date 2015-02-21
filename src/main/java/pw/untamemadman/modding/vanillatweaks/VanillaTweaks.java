package pw.untamemadman.modding.vanillatweaks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pw.untamemadman.modding.vanillatweaks.init.Recipes;
import pw.untamemadman.modding.vanillatweaks.proxy.CommonProxy;
import pw.untamemadman.modding.vanillatweaks.reference.Reference;

/**
 * Created by untamemadman on 2/21/2015.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUIFactoryClass)
public class VanillaTweaks
{
    @Mod.Instance(Reference.MOD_ID)
    public static VanillaTweaks instances;

    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent even)
    {

    }

    @Mod.EventHandler
    public void Init (FMLInitializationEvent event)
    {
        Recipes.init();
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent even)
    {

    }
}
