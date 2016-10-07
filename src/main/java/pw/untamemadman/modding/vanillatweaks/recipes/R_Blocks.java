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
    public static final int Wildcard_TYPE = Short.MAX_VALUE;

    public static void init()
    {
        //Sponge
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.SPONGE), "   ", "ZXZ", " C ", 'Z', new ItemStack(Items.STRING), 'X', new ItemStack(Blocks.WOOL), 'C', new ItemStack(Items.SLIME_BALL));

        //Wet Sponge
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.SPONGE, 1, 1), " V ", "ZXZ", " C ", 'Z', new ItemStack(Items.STRING), 'X', new ItemStack(Blocks.WOOL), 'C', new ItemStack(Items.SLIME_BALL), 'V', new ItemStack(Items.WATER_BUCKET));

        //Bedrock
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.BEDROCK), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Blocks.STONE), 'X', new ItemStack(Items.BED));
    }
}
