package net.mcreator.thecorruption.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.thecorruption.entity.CorruptCreeperEntity;

public class CorruptCreeperRenderer extends MobRenderer<CorruptCreeperEntity, CreeperModel<CorruptCreeperEntity>> {
	public CorruptCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel<>(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptCreeperEntity entity) {
		return new ResourceLocation("corruption:textures/entities/creeper.png");
	}
}
