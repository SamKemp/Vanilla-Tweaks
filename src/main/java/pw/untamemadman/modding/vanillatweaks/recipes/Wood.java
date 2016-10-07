package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by untamemadman on 2/22/2015.
 */

public class Wood
{
    public static void init()
    {
        //Oak to Spruce
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 2, 1), new ItemStack(Blocks.LOG, 1, 0), new ItemStack(Blocks.LOG, 1, 0));

        //Spruce to Birch
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 2, 2), new ItemStack(Blocks.LOG, 1, 1), new ItemStack(Blocks.LOG, 1, 1));

        //Birch to Jungle
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 2, 3), new ItemStack(Blocks.LOG, 1, 2), new ItemStack(Blocks.LOG, 1, 2));

        //Jungle to Acacia
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG2, 2, 0), new ItemStack(Blocks.LOG, 1, 3), new ItemStack(Blocks.LOG, 1, 3));

        //Acacia to Dark Oak
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG2, 2, 1), new ItemStack(Blocks.LOG2, 1, 0), new ItemStack(Blocks.LOG2, 1, 0));

        //Dark Oak to Oak
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 2, 0), new ItemStack(Blocks.LOG2, 1, 1), new ItemStack(Blocks.LOG2, 1, 1));
    }
}
