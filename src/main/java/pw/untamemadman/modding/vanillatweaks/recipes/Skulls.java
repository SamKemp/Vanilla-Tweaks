package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pw.untamemadman.modding.vanillatweaks.handler.ConfigHandler;

/**
 * Created by untamemadman on 2/22/2015.
 */

public class Skulls
{
    public static void init()
    {
        //Skeleton Skull
        if(ConfigHandler.Skeleton_SkullsRecipe)
        {
            GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL), "XXX", "XXX", "X X", 'X', new ItemStack(Items.BONE));
        }

        //Wither Skeleton Skull
        if(ConfigHandler.WitherSkeleton_SkullsRecipe)
        {
            GameRegistry.addSmelting(new ItemStack(Items.SKULL), new ItemStack(Items.SKULL, 1, 1), 5);
        }

        //Zombie Head
        if(ConfigHandler.Zombie_SkullsRecipe)
        {
            GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 2), "XXX", "XZX", "   ", 'X', new ItemStack(Items.ROTTEN_FLESH), 'Z', new ItemStack(Items.SKULL));
        }

        //Head
        if(ConfigHandler.Head_SkullsRecipe)
        {
            GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 3), "XXX", "XZX", "   ", 'X', new ItemStack(Items.LEATHER), 'Z', new ItemStack(Items.SKULL));
        }

        //Creeper Head
        if(ConfigHandler.Creeper_SkullsRecipe)
        {
            GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 4), "XXX", "XZX", "CCC", 'X', new ItemStack(Items.ROTTEN_FLESH), 'Z', new ItemStack(Items.SKULL), 'C', new ItemStack(Items.GUNPOWDER));
        }
    }
}
