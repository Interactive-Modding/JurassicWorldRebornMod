package mod.reborn.client.model.animation.entity;

import mod.reborn.client.model.AnimatableModel;
import mod.reborn.client.model.animation.EntityAnimator;
import mod.reborn.server.entity.dinosaur.AnkylodocusEntity;
import mod.reborn.server.entity.dinosaur.DiplodocusEntity;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import mod.reborn.server.entity.dinosaur.AchillobatorEntity;

@SideOnly(Side.CLIENT)

public class AnkylodocusAnimator extends EntityAnimator<AnkylodocusEntity> {

    protected void performAnimations(AnimatableModel parModel, AnkylodocusEntity entity, float limbSwing, float limbSwingAmount, float ticks, float rotationYaw, float rotationPitch, float scale) {
    }
}