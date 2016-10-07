package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by untamemadman on 19/03/2015.
 */

public class Spawners
{
    public static void init()
    {
        //Pig
        NBTTagCompound PigTag = new NBTTagCompound();
        NBTTagCompound PigTagEnt = new NBTTagCompound();
        String PigStringMob = "Pig";
        PigTagEnt.setString("id", PigStringMob);
        PigTag.setTag("EntityTag", PigTagEnt);
        ItemStack PigEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        PigEgg.setTagCompound(PigTag);

        //Default Spawner
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.MOB_SPAWNER, 1), "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Blocks.IRON_BARS), 'X', PigEgg);
    }
}
