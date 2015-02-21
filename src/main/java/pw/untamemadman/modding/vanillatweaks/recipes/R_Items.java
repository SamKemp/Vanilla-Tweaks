package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by untamemadman on 2/21/2015.
 */

public class R_Items
{
    public static void init()
    {
        //Nether Star
        GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), "ZZZ", "XXX", "CXV", 'Z', new ItemStack(Items.skull, 1, 1), 'X', new ItemStack(Blocks.soul_sand), 'C', new ItemStack(Items.diamond_sword), 'V', new ItemStack(Items.bow));
    }
}
