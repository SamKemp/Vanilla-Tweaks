package pw.untamemadman.modding.vanillatweaks.handler;

import java.io.File;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import pw.untamemadman.modding.vanillatweaks.reference.Reference;

public class ConfigHandler
{
    public static Configuration configuration;
    //Categorys
    public static final String CATEGORY_GENERAL = "General";
    public static final String CATEGORY_RECIPIES = "Recipies";
    public static final String CATEGORY_EGGRECIPIES = "Spawn Egg Recipies";
    public static final String CATEGORY_SPAWNRECIPIES = "Spawners Recipies";
    public static final String CATEGORY_SKULLRECIPIES = "Skull Recipies";

    public static boolean testValue = true;
    public static boolean LeatherRecipie = true;
    public static boolean NetherStarRecipe = true;
    public static boolean WoodRecipe = true;
    
    //SpawnEggs
    public static boolean ALL_SpawnEggsRecipe = true;
    
    //Spawners
    public static boolean All_SpawnersRecipe = true;
    
    //Skulls
    public static boolean All_SkullsRecipe = true;
    public static boolean Skeleton_SkullsRecipe = true;
    public static boolean WitherSkeleton_SkullsRecipe = true;
    public static boolean Zombie_SkullsRecipe = true;
    public static boolean Head_SkullsRecipe = true;
    public static boolean Creeper_SkullsRecipe = true;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    private static void loadConfiguration()
    {
        //General Stuff
        testValue = configuration.getBoolean("Useless", CATEGORY_GENERAL, true, "This is useless!");

        //Recipie Configs
        LeatherRecipie = configuration.getBoolean("Leather Recipe", CATEGORY_RECIPIES, true, "Enable or disable the Rotten Flesh to Leather smelting recipe");
        NetherStarRecipe = configuration.getBoolean("Nether Star Recipe", CATEGORY_RECIPIES, true, "Enable or disable the Nether Star crafting recipe");
        
        //Spawn Eggs
        ALL_SpawnEggsRecipe = configuration.getBoolean("ALL Spawn Egg Recipe", CATEGORY_EGGRECIPIES, true, "Enable or disable the the ability to craft ALL Spawn Eggs");
        
        //Spawners
        All_SpawnersRecipe = configuration.getBoolean("ALL Spawners Recipe", CATEGORY_SPAWNRECIPIES, true, "Enable or disable the the ability to craft ALL Spawners");
        
        //Skulls
        All_SkullsRecipe = configuration.getBoolean("All Skulls Recipe's", CATEGORY_SKULLRECIPIES, true, "Enable or disable the ability to craft ALL Skulls");
        Skeleton_SkullsRecipe = configuration.getBoolean("Skeleton Skulls Recipe", CATEGORY_SKULLRECIPIES, true, "Enable or disable the ability to craft Skeleton Skulls");
        WitherSkeleton_SkullsRecipe = configuration.getBoolean("Wither Skeleton Skulls Recipe", CATEGORY_SKULLRECIPIES, true, "Enable or disable the ability to craft Wither Skeleton Skulls");
        Zombie_SkullsRecipe = configuration.getBoolean("Zombie Skulls Recipe", CATEGORY_SKULLRECIPIES, true, "Enable or disable the ability to craft Zombie Skulls");
        Head_SkullsRecipe = configuration.getBoolean("Head Recipe", CATEGORY_SKULLRECIPIES, true, "Enable or disable the ability to craft Heads");
        Creeper_SkullsRecipe = configuration.getBoolean("Wither Skeleton Skulls Recipe's", CATEGORY_SKULLRECIPIES, true, "Enable or disable the ability to craft Creeper Skulls");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}