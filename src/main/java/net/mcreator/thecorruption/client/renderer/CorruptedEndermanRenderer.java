package net.mcreator.thecorruption.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thecorruption.entity.CorruptedEndermanEntity;
import net.mcreator.thecorruption.client.model.ModelCorruptedEnderman;

public class CorruptedEndermanRenderer extends MobRenderer<CorruptedEndermanEntity, ModelCorruptedEnderman<CorruptedEndermanEntity>> {
	public CorruptedEndermanRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCorruptedEnderman(context.bakeLayer(ModelCorruptedEnderman.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptedEndermanEntity entity) {
		return new ResourceLocation("corruption:textures/entities/corruptedenderman.png");
	}
}
