package net.mcreator.thecorruption.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thecorruption.entity.CorruptSkeletonEntity;
import net.mcreator.thecorruption.client.model.Modelcorruptskeleton;

public class CorruptSkeletonRenderer extends MobRenderer<CorruptSkeletonEntity, Modelcorruptskeleton<CorruptSkeletonEntity>> {
	public CorruptSkeletonRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorruptskeleton(context.bakeLayer(Modelcorruptskeleton.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptSkeletonEntity entity) {
		return new ResourceLocation("corruption:textures/entities/skeleton.png");
	}
}
