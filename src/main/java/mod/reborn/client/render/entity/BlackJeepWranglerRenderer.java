package mod.reborn.client.render.entity;

import mod.reborn.client.model.animation.entity.vehicle.CarAnimator;
import mod.reborn.server.entity.vehicle.BlackJeepWranglerEntity;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class BlackJeepWranglerRenderer extends CarRenderer<BlackJeepWranglerEntity> {

    public BlackJeepWranglerRenderer(RenderManager manager) {
        super(manager, "black_jeep_wrangler");
    }

    @Override
    protected CarAnimator createCarAnimator() {
        return new CarAnimator()
                .addDoor(new CarAnimator.Door("door left main", 0, true))
                .addDoor(new CarAnimator.Door("door right main", 1, false));
    }
}