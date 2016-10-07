package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.omg.CORBA._IDLTypeStub;
import pw.untamemadman.modding.vanillatweaks.handler.ConfigHandler;

/**
 * Created by untamemadman on 2/21/2015.
 */

public class R_Items
{
    public static void init()
    {
        //Nether Star
        if(ConfigHandler.NetherStarRecipe)
        {
            GameRegistry.addShapedRecipe(new ItemStack(Items.NETHER_STAR), "ZZZ", "XXX", "CXV", 'Z', new ItemStack(Items.SKULL, 1, 1), 'X', new ItemStack(Blocks.SOUL_SAND), 'C', new ItemStack(Items.DIAMOND_SWORD), 'V', new ItemStack(Items.BOW));
        }

        //Leather
        if(ConfigHandler.LeatherRecipie)
        {
            GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH), new ItemStack(Items.LEATHER), 1);
        }

        //Ender Pearl
        GameRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL), "CCC", "ZXZ", " Z ", 'X', new ItemStack(Items.SLIME_BALL), 'C', new ItemStack(Items.DYE, 1, 4), 'Z', new ItemStack(Items.BLAZE_POWDER));

        //Golden Apple
        GameRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Blocks.GOLD_BLOCK), 'X', new ItemStack(Items.GOLDEN_APPLE));
    }
}
