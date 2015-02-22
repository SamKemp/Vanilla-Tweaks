package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by untamemadman on 2/21/2015.
 */

public class R_Blocks
{
    public static void init()
    {
        //Sponge
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge), "   ", "ZXZ", " C ", 'Z', new ItemStack(Items.string), 'X', new ItemStack(Blocks.wool), 'C', new ItemStack(Items.slime_ball));

        //Wet Sponge
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sponge, 1, 1), " V ", "ZXZ", " C ", 'Z', new ItemStack(Items.string), 'X', new ItemStack(Blocks.wool), 'C', new ItemStack(Items.slime_ball), 'V', new ItemStack(Items.water_bucket));
    }
}
