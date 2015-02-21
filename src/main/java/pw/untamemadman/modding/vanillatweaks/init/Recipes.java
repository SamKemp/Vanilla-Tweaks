package pw.untamemadman.modding.vanillatweaks.init;

import net.minecraft.client.main.GameConfiguration;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by untamemadman on 2/21/2015.
 */

public class Recipes
{
    public static void init()
    {
        //Nether Star
        GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), "ZZZ", "XXX", "CXV", 'Z', new ItemStack(Items.skull, 1, 1), 'X', new ItemStack(Blocks.soul_sand), 'C', new ItemStack(Items.diamond_sword), 'V', new ItemStack(Items.bow));

        //Spawn Egg's
        //Creeper
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 50), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.gunpowder), 'X', new ItemStack(Items.egg));
        //Skeleton
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 51), "ZZC", "ZXC", "ZCC", 'Z', new ItemStack(Items.arrow),'C', new ItemStack(Items.bone), 'X', new ItemStack(Items.egg));
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 51), "ZCC", "ZXC", "ZZC", 'Z', new ItemStack(Items.arrow),'C', new ItemStack(Items.bone), 'X', new ItemStack(Items.egg));
        //Cow
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 92), "ZZC", "ZXC", "ZCC", 'Z', new ItemStack(Items.leather),'C', new ItemStack(Items.beef), 'X', new ItemStack(Items.egg));
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 92), "ZCC", "ZXC", "ZZC", 'Z', new ItemStack(Items.leather),'C', new ItemStack(Items.beef), 'X', new ItemStack(Items.egg));
        //Squid
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 94), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.dye), 'X', new ItemStack(Items.egg));
        //Zombie
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 54), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.rotten_flesh), 'X', new ItemStack(Items.egg));
        //Spider
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 52), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.string), 'X', new ItemStack(Items.egg));
        //Slime
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 55), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.slime_ball), 'X', new ItemStack(Items.egg));
        //Ghast
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 56), "ZCZ", "VXV", "ZCZ", 'Z', new ItemStack(Blocks.netherrack), 'C', new ItemStack(Items.feather), 'V', new ItemStack(Items.ghast_tear), 'X', new ItemStack(Items.egg));
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 56), "ZVZ", "CXC", "ZVZ", 'Z', new ItemStack(Blocks.netherrack), 'C', new ItemStack(Items.feather), 'V', new ItemStack(Items.ghast_tear), 'X', new ItemStack(Items.egg));
        //Zombie Pigman
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 57), "ZCZ", "VXV", "ZBZ", 'Z', new ItemStack(Blocks.netherrack), 'C', new ItemStack(Items.golden_sword), 'V', new ItemStack(Items.cooked_porkchop), 'B', new ItemStack(Items.netherbrick), 'X', new ItemStack(Items.egg));
        //Enderman
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 58), "ZCV", "BXN", "VMZ", 'Z', new ItemStack(Items.ender_pearl), 'C', new ItemStack(Blocks.dirt), 'V', new ItemStack(Items.ender_eye), 'B', new ItemStack(Blocks.sand), 'N', new ItemStack(Blocks.log), 'M', new ItemStack(Blocks.cobblestone), 'X', new ItemStack(Items.egg));
        //Blaze
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 61), "ZCZ", "VXV", "ZCZ", 'Z', new ItemStack(Blocks.netherrack), 'C', new ItemStack(Items.gold_ingot), 'V', new ItemStack(Items.blaze_rod), 'X', new ItemStack(Items.egg));
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 61), "ZVZ", "CXC", "ZVZ", 'Z', new ItemStack(Blocks.netherrack), 'C', new ItemStack(Items.gold_ingot), 'V', new ItemStack(Items.blaze_rod), 'X', new ItemStack(Items.egg));
        //Magma Cube
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 56), "ZCZ", "VXV", "ZBZ", 'Z', new ItemStack(Blocks.netherrack), 'C', new ItemStack(Items.slime_ball), 'B', new ItemStack(Items.magma_cream), 'V', new ItemStack(Items.blaze_powder), 'X', new ItemStack(Items.egg));
        //Bat
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 65), "ZZZ", "CXC", "CVC", 'Z', new ItemStack(Items.dye), 'C', new ItemStack(Items.feather), 'V', new ItemStack(Items.dye, 3), 'X', new ItemStack(Items.egg));
        //Silverfish
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 60), "ZCZ", "VXV", "ZCZ", 'Z', new ItemStack(Items.fish), 'C', new ItemStack(Items.iron_ingot), 'V', new ItemStack(Blocks.stone), 'X', new ItemStack(Items.egg));
        GameRegistry.addShapedRecipe(new ItemStack(Items.spawn_egg, 1, 60), "ZVZ", "CXC", "ZVZ", 'Z', new ItemStack(Items.fish), 'C', new ItemStack(Items.iron_ingot), 'V', new ItemStack(Blocks.stone), 'X', new ItemStack(Items.egg));
    }
}
