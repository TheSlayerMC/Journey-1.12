package net.jitl.client.render.entity;

import net.jitl.JITL;
import net.jitl.client.render.JEntityRenderRegistry;
import net.jitl.common.entity.overworld.TowerGuardianEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import ru.timeconqueror.timecore.animation.renderer.AnimatedLivingEntityRenderer;
import ru.timeconqueror.timecore.client.render.model.TimeEntityModel;

public class TowerGuardianRenderer extends AnimatedLivingEntityRenderer<TowerGuardianEntity, TimeEntityModel<TowerGuardianEntity>> {
	public TowerGuardianRenderer(EntityRendererManager rendererManager) {
		super(rendererManager, JEntityRenderRegistry.towerGuardianModel, 0.5F);
	}

	@Override
	public @NotNull ResourceLocation getTextureLocation(@NotNull TowerGuardianEntity entity) {
		return new ResourceLocation(JITL.MODID, "textures/entity/overworld/tower_guardian.png");
	}
}