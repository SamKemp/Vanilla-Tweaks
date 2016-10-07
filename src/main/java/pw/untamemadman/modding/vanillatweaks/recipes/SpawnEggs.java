package pw.untamemadman.modding.vanillatweaks.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pw.untamemadman.modding.vanillatweaks.utility.LogHelper;

/**
 * Created by untamemadman on 2/21/2015.
 */

public class SpawnEggs
{
    public static void init()
    {
        //Blank Spawn Egg
        GameRegistry.addShapedRecipe(new ItemStack(Items.SPAWN_EGG, 1, 0), " Z ", "ZXZ", " Z ", 'Z', new ItemStack(Items.IRON_INGOT),'X', new ItemStack(Items.EGG));
        
        //NBT
        
        //Creeper
        NBTTagCompound CreeperTag = new NBTTagCompound();
        NBTTagCompound CreeperTagEnt = new NBTTagCompound();
        String CreeperStringMob = "Creeper";
        CreeperTagEnt.setString("id", CreeperStringMob);
        CreeperTag.setTag("EntityTag", CreeperTagEnt);
        ItemStack CreeperEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        CreeperEgg.setTagCompound(CreeperTag);
        
        //Skeleton
        NBTTagCompound SkeletonTag = new NBTTagCompound();
        NBTTagCompound SkeletonTagEnt = new NBTTagCompound();
        String SkeletonStringMob = "Skeleton";
        SkeletonTagEnt.setString("id", SkeletonStringMob);
        SkeletonTag.setTag("EntityTag", SkeletonTagEnt);
        ItemStack SkeletonEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        SkeletonEgg.setTagCompound(SkeletonTag);

        //Spider
        NBTTagCompound SpiderTag = new NBTTagCompound();
        NBTTagCompound SpiderTagEnt = new NBTTagCompound();
        String SpiderStringMob = "Spider";
        SpiderTagEnt.setString("id", SpiderStringMob);
        SpiderTag.setTag("EntityTag", SpiderTagEnt);
        ItemStack SpiderEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        SpiderEgg.setTagCompound(SpiderTag);

        //Zombie
        NBTTagCompound ZombieTag = new NBTTagCompound();
        NBTTagCompound ZombieTagEnt = new NBTTagCompound();
        String ZombieStringMob = "Zombie";
        ZombieTagEnt.setString("id", ZombieStringMob);
        ZombieTag.setTag("EntityTag", ZombieTagEnt);
        ItemStack ZombieEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        ZombieEgg.setTagCompound(ZombieTag);

        //Slime
        NBTTagCompound SlimeTag = new NBTTagCompound();
        NBTTagCompound SlimeTagEnt = new NBTTagCompound();
        String SlimeStringMob = "Slime";
        SlimeTagEnt.setString("id", SlimeStringMob);
        SlimeTag.setTag("EntityTag", SlimeTagEnt);
        ItemStack SlimeEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        SlimeEgg.setTagCompound(SlimeTag);

        //Ghast
        NBTTagCompound GhastTag = new NBTTagCompound();
        NBTTagCompound GhastTagEnt = new NBTTagCompound();
        String GhastStringMob = "Ghast";
        GhastTagEnt.setString("id", GhastStringMob);
        GhastTag.setTag("EntityTag", GhastTagEnt);
        ItemStack GhastEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        GhastEgg.setTagCompound(GhastTag);

        //Zombie Pigman
        NBTTagCompound ZombiePigmanTag = new NBTTagCompound();
        NBTTagCompound ZombiePigmanTagEnt = new NBTTagCompound();
        String ZombiePigmanStringMob = "PigZombie";
        ZombiePigmanTagEnt.setString("id", ZombiePigmanStringMob);
        ZombiePigmanTag.setTag("EntityTag", ZombiePigmanTagEnt);
        ItemStack ZombiePigmanEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        ZombiePigmanEgg.setTagCompound(ZombiePigmanTag);

        //Enderman
        NBTTagCompound EndermanTag = new NBTTagCompound();
        NBTTagCompound EndermanTagEnt = new NBTTagCompound();
        String EndermanStringMob = "Enderman";
        EndermanTagEnt.setString("id", EndermanStringMob);
        EndermanTag.setTag("EntityTag", EndermanTagEnt);
        ItemStack EndermanEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        EndermanEgg.setTagCompound(EndermanTag);

        //Cave Spider
        NBTTagCompound CaveSpiderTag = new NBTTagCompound();
        NBTTagCompound CaveSpiderTagEnt = new NBTTagCompound();
        String CaveSpiderStringMob = "CaveSpider";
        CaveSpiderTagEnt.setString("id", CaveSpiderStringMob);
        CaveSpiderTag.setTag("EntityTag", CaveSpiderTagEnt);
        ItemStack CaveSpiderEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        CaveSpiderEgg.setTagCompound(CaveSpiderTag);

        //Silverfish
        NBTTagCompound SilverfishTag = new NBTTagCompound();
        NBTTagCompound SilverfishTagEnt = new NBTTagCompound();
        String SilverfishStringMob = "Silverfish";
        SilverfishTagEnt.setString("id", SilverfishStringMob);
        SilverfishTag.setTag("EntityTag", SilverfishTagEnt);
        ItemStack SilverfishEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        SilverfishEgg.setTagCompound(SilverfishTag);

        //Blaze
        NBTTagCompound BlazeTag = new NBTTagCompound();
        NBTTagCompound BlazeTagEnt = new NBTTagCompound();
        String BlazeStringMob = "Blaze";
        BlazeTagEnt.setString("id", BlazeStringMob);
        BlazeTag.setTag("EntityTag", BlazeTagEnt);
        ItemStack BlazeEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        BlazeEgg.setTagCompound(BlazeTag);

        //Magma Cube
        NBTTagCompound MagmaCubeTag = new NBTTagCompound();
        NBTTagCompound MagmaCubeTagEnt = new NBTTagCompound();
        String MagmaCubeStringMob = "LavaSlime";
        MagmaCubeTagEnt.setString("id", MagmaCubeStringMob);
        MagmaCubeTag.setTag("EntityTag", MagmaCubeTagEnt);
        ItemStack MagmaCubeEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        MagmaCubeEgg.setTagCompound(MagmaCubeTag);

        //Bat
        NBTTagCompound BatTag = new NBTTagCompound();
        NBTTagCompound BatTagEnt = new NBTTagCompound();
        String BatStringMob = "Bat";
        BatTagEnt.setString("id", BatStringMob);
        BatTag.setTag("EntityTag", BatTagEnt);
        ItemStack BatEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        BatEgg.setTagCompound(BatTag);

        //Witch
        NBTTagCompound WitchTag = new NBTTagCompound();
        NBTTagCompound WitchTagEnt = new NBTTagCompound();
        String WitchStringMob = "Witch";
        WitchTagEnt.setString("id", WitchStringMob);
        WitchTag.setTag("EntityTag", WitchTagEnt);
        ItemStack WitchEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        WitchEgg.setTagCompound(WitchTag);

        //Endermite
        NBTTagCompound EndermiteTag = new NBTTagCompound();
        NBTTagCompound EndermiteTagEnt = new NBTTagCompound();
        String EndermiteStringMob = "Endermite";
        EndermiteTagEnt.setString("id", EndermiteStringMob);
        EndermiteTag.setTag("EntityTag", EndermiteTagEnt);
        ItemStack EndermiteEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        EndermiteEgg.setTagCompound(EndermiteTag);

        //Guardian
        NBTTagCompound GuardianTag = new NBTTagCompound();
        NBTTagCompound GuardianTagEnt = new NBTTagCompound();
        String GuardianStringMob = "Guardian";
        GuardianTagEnt.setString("id", GuardianStringMob);
        GuardianTag.setTag("EntityTag", GuardianTagEnt);
        ItemStack GuardianEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        GuardianEgg.setTagCompound(GuardianTag);

        //Pig
        NBTTagCompound PigTag = new NBTTagCompound();
        NBTTagCompound PigTagEnt = new NBTTagCompound();
        String PigStringMob = "Pig";
        PigTagEnt.setString("id", PigStringMob);
        PigTag.setTag("EntityTag", PigTagEnt);
        ItemStack PigEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        PigEgg.setTagCompound(PigTag);

        //Sheep
        NBTTagCompound SheepTag = new NBTTagCompound();
        NBTTagCompound SheepTagEnt = new NBTTagCompound();
        String SheepStringMob = "Sheep";
        SheepTagEnt.setString("id", SheepStringMob);
        SheepTag.setTag("EntityTag", SheepTagEnt);
        ItemStack SheepEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        SheepEgg.setTagCompound(SheepTag);

        //Cow
        NBTTagCompound CowTag = new NBTTagCompound();
        NBTTagCompound CowTagEnt = new NBTTagCompound();
        String CowStringMob = "Cow";
        CowTagEnt.setString("id", CowStringMob);
        CowTag.setTag("EntityTag", CowTagEnt);
        ItemStack CowEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        CowEgg.setTagCompound(CowTag);

        //Chicken
        NBTTagCompound ChickenTag = new NBTTagCompound();
        NBTTagCompound ChickenTagEnt = new NBTTagCompound();
        String ChickenStringMob = "Chicken";
        ChickenTagEnt.setString("id", ChickenStringMob);
        ChickenTag.setTag("EntityTag", ChickenTagEnt);
        ItemStack ChickenEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        ChickenEgg.setTagCompound(ChickenTag);
        
        //Squid
        NBTTagCompound SquidTag = new NBTTagCompound();
        NBTTagCompound SquidTagEnt = new NBTTagCompound();
        String SquidStringMob = "Squid";
        SquidTagEnt.setString("id", SquidStringMob);
        SquidTag.setTag("EntityTag", SquidTagEnt);
        ItemStack SquidEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        SquidEgg.setTagCompound(SquidTag);

        //Wolf
        NBTTagCompound WolfTag = new NBTTagCompound();
        NBTTagCompound WolfTagEnt = new NBTTagCompound();
        String WolfStringMob = "Wolf";
        WolfTagEnt.setString("id", WolfStringMob);
        WolfTag.setTag("EntityTag", WolfTagEnt);
        ItemStack WolfEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        WolfEgg.setTagCompound(WolfTag);

        //Mooshroom
        NBTTagCompound MooshroomTag = new NBTTagCompound();
        NBTTagCompound MooshroomTagEnt = new NBTTagCompound();
        String MooshroomStringMob = "MushroomCow";
        MooshroomTagEnt.setString("id", MooshroomStringMob);
        MooshroomTag.setTag("EntityTag", MooshroomTagEnt);
        ItemStack MooshroomEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        MooshroomEgg.setTagCompound(MooshroomTag);

        //Ocelot
        NBTTagCompound OcelotTag = new NBTTagCompound();
        NBTTagCompound OcelotTagEnt = new NBTTagCompound();
        String OcelotStringMob = "Ozelot";
        OcelotTagEnt.setString("id", OcelotStringMob);
        OcelotTag.setTag("EntityTag", OcelotTagEnt);
        ItemStack OcelotEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        OcelotEgg.setTagCompound(OcelotTag);

        //Horse
        NBTTagCompound HorseTag = new NBTTagCompound();
        NBTTagCompound HorseTagEnt = new NBTTagCompound();
        String HorseStringMob = "EntityHorse";
        HorseTagEnt.setString("id", HorseStringMob);
        HorseTag.setTag("EntityTag", HorseTagEnt);
        ItemStack HorseEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        HorseEgg.setTagCompound(HorseTag);

        //Rabbit
        NBTTagCompound RabbitTag = new NBTTagCompound();
        NBTTagCompound RabbitTagEnt = new NBTTagCompound();
        String RabbitStringMob = "Rabbit";
        RabbitTagEnt.setString("id", RabbitStringMob);
        RabbitTag.setTag("EntityTag", RabbitTagEnt);
        ItemStack RabbitEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        RabbitEgg.setTagCompound(RabbitTag);

        //Villager
        NBTTagCompound VillagerTag = new NBTTagCompound();
        NBTTagCompound VillagerTagEnt = new NBTTagCompound();
        String VillagerStringMob = "Villager";
        VillagerTagEnt.setString("id", VillagerStringMob);
        VillagerTag.setTag("EntityTag", VillagerTagEnt);
        ItemStack VillagerEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        VillagerEgg.setTagCompound(VillagerTag);

        //Snow Golem
        NBTTagCompound SnowGolemTag = new NBTTagCompound();
        NBTTagCompound SnowGolemTagEnt = new NBTTagCompound();
        String SnowGolemStringMob = "SnowMan";
        SnowGolemTagEnt.setString("id", SnowGolemStringMob);
        SnowGolemTag.setTag("EntityTag", SnowGolemTagEnt);
        ItemStack SnowGolemEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        SnowGolemEgg.setTagCompound(SnowGolemTag);

        //Iron Golem
        NBTTagCompound IronGolemTag = new NBTTagCompound();
        NBTTagCompound IronGolemTagEnt = new NBTTagCompound();
        String IronGolemStringMob = "VillagerGolem";
        IronGolemTagEnt.setString("id", IronGolemStringMob);
        IronGolemTag.setTag("EntityTag", IronGolemTagEnt);
        ItemStack IronGolemEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        IronGolemEgg.setTagCompound(IronGolemTag);

        //Shulker
        NBTTagCompound ShulkerTag = new NBTTagCompound();
        NBTTagCompound ShulkerTagEnt = new NBTTagCompound();
        String ShulkerStringMob = "Shulker";
        ShulkerTagEnt.setString("id", ShulkerStringMob);
        ShulkerTag.setTag("EntityTag", ShulkerTagEnt);
        ItemStack ShulkerEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        ShulkerEgg.setTagCompound(ShulkerTag);

        //Polar Bear
        NBTTagCompound PolarBearTag = new NBTTagCompound();
        NBTTagCompound PolarBearTagEnt = new NBTTagCompound();
        String PolarBearStringMob = "PolarBear";
        PolarBearTagEnt.setString("id", PolarBearStringMob);
        PolarBearTag.setTag("EntityTag", PolarBearTagEnt);
        ItemStack PolarBearEgg = new ItemStack(Items.SPAWN_EGG, 1,0);
        PolarBearEgg.setTagCompound(PolarBearTag);
        
        //Recipes
        
        //Creeper
        GameRegistry.addShapedRecipe(CreeperEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.GUNPOWDER), 'X', new ItemStack(Items.SPAWN_EGG));

        //Skeleton
        GameRegistry.addShapedRecipe(SkeletonEgg, "ZZC", "ZXC", "ZCC", 'Z', new ItemStack(Items.ARROW),'C', new ItemStack(Items.BONE), 'X', new ItemStack(Items.SPAWN_EGG));
        GameRegistry.addShapedRecipe(SkeletonEgg, "ZCC", "ZXC", "ZZC", 'Z', new ItemStack(Items.ARROW),'C', new ItemStack(Items.BONE), 'X', new ItemStack(Items.SPAWN_EGG));

        //Spider
        GameRegistry.addShapedRecipe(SpiderEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.STRING), 'X', new ItemStack(Items.SPAWN_EGG));

        //Zombie
        GameRegistry.addShapedRecipe(ZombieEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.ROTTEN_FLESH), 'X', new ItemStack(Items.SPAWN_EGG));

        //Slime
        GameRegistry.addShapedRecipe(SlimeEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.SLIME_BALL), 'X', new ItemStack(Items.SPAWN_EGG));

        //Ghast
        GameRegistry.addShapedRecipe(GhastEgg, "ZCZ", "VXV", "ZCZ", 'Z', new ItemStack(Blocks.NETHERRACK), 'C', new ItemStack(Items.FEATHER), 'V', new ItemStack(Items.GHAST_TEAR), 'X', new ItemStack(Items.SPAWN_EGG));
        GameRegistry.addShapedRecipe(GhastEgg, "ZVZ", "CXC", "ZVZ", 'Z', new ItemStack(Blocks.NETHERRACK), 'C', new ItemStack(Items.FEATHER), 'V', new ItemStack(Items.GHAST_TEAR), 'X', new ItemStack(Items.SPAWN_EGG));

        //Zombie Pigman
        GameRegistry.addShapedRecipe(ZombiePigmanEgg, "ZCZ", "VXV", "ZBZ", 'Z', new ItemStack(Blocks.NETHERRACK), 'C', new ItemStack(Items.GOLDEN_SWORD), 'V', new ItemStack(Items.COOKED_PORKCHOP), 'B', new ItemStack(Items.NETHERBRICK), 'X', new ItemStack(Items.SPAWN_EGG));

        //Enderman
        GameRegistry.addShapedRecipe(EndermanEgg, "ZCV", "BXN", "VMZ", 'Z', new ItemStack(Items.ENDER_PEARL), 'C', new ItemStack(Blocks.DIRT), 'V', new ItemStack(Items.ENDER_EYE), 'B', new ItemStack(Blocks.SAND), 'N', new ItemStack(Blocks.LOG), 'M', new ItemStack(Blocks.COBBLESTONE), 'X', new ItemStack(Items.SPAWN_EGG));

        //Cave Spider
        GameRegistry.addShapedRecipe(CaveSpiderEgg, "ZCZ", "CXC", "ZCZ", 'Z', new ItemStack(Items.STRING), 'C', new ItemStack(Items.SPIDER_EYE), 'X', new ItemStack(Items.SPAWN_EGG));

        //Silverfish
        GameRegistry.addShapedRecipe(SilverfishEgg, "ZCZ", "VXV", "ZCZ", 'Z', new ItemStack(Items.FISH), 'C', new ItemStack(Items.IRON_INGOT), 'V', new ItemStack(Blocks.STONE), 'X', new ItemStack(Items.SPAWN_EGG));
        GameRegistry.addShapedRecipe(SilverfishEgg, "ZVZ", "CXC", "ZVZ", 'Z', new ItemStack(Items.FISH), 'C', new ItemStack(Items.IRON_INGOT), 'V', new ItemStack(Blocks.STONE), 'X', new ItemStack(Items.SPAWN_EGG));

        //Blaze
        GameRegistry.addShapedRecipe(BlazeEgg, "ZCZ", "VXV", "ZCZ", 'Z', new ItemStack(Blocks.NETHERRACK), 'C', new ItemStack(Items.GOLD_INGOT), 'V', new ItemStack(Items.BLAZE_ROD), 'X', new ItemStack(Items.SPAWN_EGG));
        GameRegistry.addShapedRecipe(BlazeEgg, "ZVZ", "CXC", "ZVZ", 'Z', new ItemStack(Blocks.NETHERRACK), 'C', new ItemStack(Items.GOLD_INGOT), 'V', new ItemStack(Items.BLAZE_ROD), 'X', new ItemStack(Items.SPAWN_EGG));

        //Magma Cube
        GameRegistry.addShapedRecipe(MagmaCubeEgg, "ZCZ", "VXV", "ZBZ", 'Z', new ItemStack(Blocks.NETHERRACK), 'C', new ItemStack(Items.SLIME_BALL), 'B', new ItemStack(Items.MAGMA_CREAM), 'V', new ItemStack(Items.BLAZE_POWDER), 'X', new ItemStack(Items.SPAWN_EGG));

        //Bat
        GameRegistry.addShapedRecipe(BatEgg, "ZZZ", "CXC", "CVC", 'Z', new ItemStack(Items.DYE), 'C', new ItemStack(Items.FEATHER), 'V', new ItemStack(Items.DYE, 1, 3), 'X', new ItemStack(Items.SPAWN_EGG));

        //Witch
        GameRegistry.addShapedRecipe(WitchEgg, "ZCV", "BXB", "NML", 'Z', new ItemStack(Items.SPIDER_EYE), 'C', new ItemStack(Items.GLASS_BOTTLE), 'V', new ItemStack(Items.GUNPOWDER), 'B', new ItemStack(Items.STICK), 'N', new ItemStack(Items.GLOWSTONE_DUST), 'M', new ItemStack(Items.REDSTONE), 'L', new ItemStack(Items.SUGAR), 'X', new ItemStack(Items.SPAWN_EGG));

        //Endermite
        GameRegistry.addShapedRecipe(EndermiteEgg, "ZZZ", "CXC", "VVV", 'Z', new ItemStack(Blocks.STONE), 'C', new ItemStack(Items.ENDER_EYE), 'V', new ItemStack(Items.ENDER_PEARL), 'X', new ItemStack(Items.SPAWN_EGG));

        //Guardian
        GameRegistry.addShapedRecipe(GuardianEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.PRISMARINE_SHARD), 'X', new ItemStack(Items.SPAWN_EGG));

        //Pig
        GameRegistry.addShapedRecipe(PigEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.PORKCHOP), 'X', new ItemStack(Items.SPAWN_EGG));

        //Sheep
        GameRegistry.addShapedRecipe(SheepEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Blocks.WOOL), 'X', new ItemStack(Items.SPAWN_EGG));

        //Cow
        GameRegistry.addShapedRecipe(CowEgg, "ZZC", "ZXC", "ZCC", 'Z', new ItemStack(Items.LEATHER),'C', new ItemStack(Items.BEEF), 'X', new ItemStack(Items.SPAWN_EGG));
        GameRegistry.addShapedRecipe(CowEgg, "ZCC", "ZXC", "ZZC", 'Z', new ItemStack(Items.LEATHER),'C', new ItemStack(Items.BEEF), 'X', new ItemStack(Items.SPAWN_EGG));

        //Chicken
        GameRegistry.addShapedRecipe(ChickenEgg, "ZZC", "ZXC", "ZCC", 'Z', new ItemStack(Items.FEATHER),'C', new ItemStack(Items.CHICKEN), 'X', new ItemStack(Items.SPAWN_EGG));
        GameRegistry.addShapedRecipe(ChickenEgg, "ZCC", "ZXC", "ZZC", 'Z', new ItemStack(Items.FEATHER),'C', new ItemStack(Items.CHICKEN), 'X', new ItemStack(Items.SPAWN_EGG));

        //Squid
        GameRegistry.addShapedRecipe(SquidEgg, "ZZZ", "ZXZ", "ZZZ", 'Z', new ItemStack(Items.DYE), 'X', new ItemStack(Items.SPAWN_EGG));

        //Wolf
        GameRegistry.addShapedRecipe(WolfEgg, "ZZZ", "VXV", "CVC", 'Z', new ItemStack(Items.DYE, 1, 15), 'V', new ItemStack(Items.STRING), 'C', new ItemStack(Items.RABBIT_FOOT), 'X', new ItemStack(Items.SPAWN_EGG));

        //Mooshroom
        GameRegistry.addShapedRecipe(MooshroomEgg, "ZCV", "ZXV", "ZBV", 'Z', new ItemStack(Items.BEEF), 'V', new ItemStack(Items.LEATHER), 'C', new ItemStack(Blocks.RED_MUSHROOM), 'B', new ItemStack(Blocks.BROWN_MUSHROOM), 'X', new ItemStack(Items.SPAWN_EGG));
        GameRegistry.addShapedRecipe(MooshroomEgg, "ZBV", "ZXV", "ZCV", 'Z', new ItemStack(Items.BEEF), 'V', new ItemStack(Items.LEATHER), 'C', new ItemStack(Blocks.RED_MUSHROOM), 'B', new ItemStack(Blocks.BROWN_MUSHROOM), 'X', new ItemStack(Items.SPAWN_EGG));

        //Ocelot
        GameRegistry.addShapedRecipe(OcelotEgg, "ZCZ", "VXV", "BNB", 'Z', new ItemStack(Items.FISH), 'C', new ItemStack(Items.COOKED_FISH), 'V', new ItemStack(Items.FISH, 1, 3), 'B', new ItemStack(Items.FISH, 1, 2), 'N', new ItemStack(Blocks.GRASS), 'X', new ItemStack(Items.SPAWN_EGG));

        //Horse
        GameRegistry.addShapedRecipe(HorseEgg, "ZZZ", "ZXZ", "CVC", 'Z', new ItemStack(Items.LEATHER), 'V', new ItemStack(Items.BONE), 'C', new ItemStack(Items.RABBIT_FOOT), 'X', new ItemStack(Items.SPAWN_EGG));

        //Rabbit
        GameRegistry.addShapedRecipe(RabbitEgg, "ZVZ", "ZXZ", "CVC", 'Z', new ItemStack(Items.RABBIT_HIDE), 'C', new ItemStack(Items.RABBIT_FOOT), 'V', new ItemStack(Items.RABBIT), 'X', new ItemStack(Items.SPAWN_EGG));

        //Villager
        GameRegistry.addShapedRecipe(VillagerEgg, "ZCV", "CXC", "BCN", 'Z', new ItemStack(Items.POTATO), 'C', new ItemStack(Items.EMERALD), 'V', new ItemStack(Items.BREAD), 'B', new ItemStack(Items.CARROT), 'N', new ItemStack(Items.PUMPKIN_PIE), 'X', new ItemStack(Items.SPAWN_EGG));

        //Snow Golem
        GameRegistry.addShapedRecipe(SnowGolemEgg, " C ", "ZXZ", "ZZZ", 'C', new ItemStack(Blocks.PUMPKIN), 'Z', new ItemStack(Items.SNOWBALL), 'X', new ItemStack(Items.SPAWN_EGG));

        //Iron Golem
        GameRegistry.addShapedRecipe(IronGolemEgg, " C ", "VXV", "ZZZ", 'C', new ItemStack(Blocks.PUMPKIN), 'V', new ItemStack(Blocks.IRON_BLOCK), 'Z', new ItemStack(Items.IRON_INGOT), 'X', new ItemStack(Items.SPAWN_EGG));
    
        //Shulker
        GameRegistry.addShapedRecipe(ShulkerEgg, "CVC", "VXV", "CVC", 'C', new ItemStack(Blocks.PURPUR_BLOCK), 'V', new ItemStack(Items.ENDER_PEARL), 'X', new ItemStack(Items.SPAWN_EGG));

        //Polar Bear
        GameRegistry.addShapedRecipe(PolarBearEgg, "CVC", "VXV", "CVC", 'C', new ItemStack(Blocks.SNOW), 'V', new ItemStack(Items.FISH), 'X', new ItemStack(Items.SPAWN_EGG));
    
    }
}
