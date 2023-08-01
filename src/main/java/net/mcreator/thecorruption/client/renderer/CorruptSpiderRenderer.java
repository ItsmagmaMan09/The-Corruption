package net.mcreator.thecorruption.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.thecorruption.entity.CorruptSpiderEntity;

public class CorruptSpiderRenderer extends MobRenderer<CorruptSpiderEntity, SpiderModel<CorruptSpiderEntity>> {
	public CorruptSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel<>(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorruptSpiderEntity entity) {
		return new ResourceLocation("corruption:textures/entities/spider.png");
	}
}
