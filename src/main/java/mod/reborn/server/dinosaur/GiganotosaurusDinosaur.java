package mod.reborn.server.dinosaur;


import mod.reborn.server.entity.Diet;
import mod.reborn.server.entity.dinosaur.GiganotosaurusEntity;
import mod.reborn.server.period.TimePeriod;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.ArrayList;

public class GiganotosaurusDinosaur extends Dinosaur
{
    public static final double SPEED = 0.4F;
    public GiganotosaurusDinosaur()
    {
        super();
        this.setName("Giganotosaurus");
        this.setDinosaurType(DinosaurType.AGGRESSIVE);
        this.setDinosaurClass(GiganotosaurusEntity.class);
        this.setTimePeriod(TimePeriod.CRETACEOUS);
        this.setEggColorMale(0x4F3F33, 0x4F3F33);
        this.setEggColorFemale(0x756E54, 0x4B474A);
        this.setHealth(20, 80);
        this.setSpeed((SPEED -0.05), SPEED);
        this.setStrength(4, 35);
        this.setEyeHeight(0.45F, 3.5F);
        this.setSizeX(0.2F, 3.6F);
        this.setSizeY(0.5F, 3.6F);
        this.setMaximumAge(fromDays(60));
        this.setStorage(54);
        this.setAttackSpeed(2);
        this.setDiet((Diet.CARNIVORE.get()));
        this.setBones("skull", "tooth", "neck_vertebrae", "pelvis", "ribcage", "shoulder", "leg_bones", "arm_bones", "tail_vertebrae", "foot_bones", "claw");
        this.setHeadCubeName("Head");
        this.setScale(2.37F, 0.1F);
        this.shouldDefendOffspring();
        this.setAttackBias(280);
        this.setBreeding(false, 2, 6, 70, false, true);
        String[][] recipe = {
                {"", "", "","neck_vertebrae","skull"},
                {"tail_vertebrae", "pelvis", "ribcage","shoulder","tooth"},
                {"", "leg_bones", "", "arm_bones", "claw"},
                {"", "foot_bones", "", "", ""}};
        this.setRecipe(recipe);
        this.enableSkeleton();
        ArrayList<Biome> biomeList = new ArrayList<Biome>();
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.SAVANNA));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.PLAINS));
        biomeList.addAll(BiomeDictionary.getBiomes(BiomeDictionary.Type.FOREST));
        this.setSpawn(1, biomeList.toArray(new Biome[biomeList.size()]));
    }
}
