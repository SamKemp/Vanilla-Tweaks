package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.omg.CORBA._IDLTypeStub;

/**
 * Created by untamemadman on 2/21/2015.
 */

public class R_Items
{
    public static void init()
    {
        //Nether Star
        GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), "ZZZ", "XXX", "CXV", 'Z', new ItemStack(Items.skull, 1, 1), 'X', new ItemStack(Blocks.soul_sand), 'C', new ItemStack(Items.diamond_sword), 'V', new ItemStack(Items.bow));

        //Leather
        GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(Items.leather), 1);

        //Ender Pearl
        GameRegistry.addShapedRecipe(new ItemStack(Items.ender_pearl), "CCC", "ZXZ", " Z ", 'X', new ItemStack(Items.slime_ball), 'C', new ItemStack(Items.dye, 1, 4), 'Z', new ItemStack(Items.blaze_powder));
    }
}
