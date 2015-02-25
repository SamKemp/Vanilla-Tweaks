package pw.untamemadman.modding.vanillatweaks;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pw.untamemadman.modding.vanillatweaks.handler.ConfigHandler;
import pw.untamemadman.modding.vanillatweaks.proxy.IProxy;
import pw.untamemadman.modding.vanillatweaks.recipes.*;
import pw.untamemadman.modding.vanillatweaks.proxy.CommonProxy;
import pw.untamemadman.modding.vanillatweaks.reference.Reference;
import pw.untamemadman.modding.vanillatweaks.utility.LogHelper;

/**
 * Created by untamemadman on 2/21/2015.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUIFactoryClass)
public class VanillaTweaks
{
    @Mod.Instance(Reference.MOD_ID)
    public static VanillaTweaks instances;

    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init (FMLInitializationEvent event)
    {
        SpawnEggs.init();
        Skulls.init();
        Wood.init();
        R_Blocks.init();
        R_Items.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent even)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
