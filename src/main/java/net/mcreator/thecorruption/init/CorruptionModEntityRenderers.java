
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.mcreator.thecorruption.client.renderer.CorruptedEndermanRenderer;
import net.mcreator.thecorruption.client.renderer.CorruptZombieRenderer;
import net.mcreator.thecorruption.client.renderer.CorruptSpiderRenderer;
import net.mcreator.thecorruption.client.renderer.CorruptSkeletonRenderer;
import net.mcreator.thecorruption.client.renderer.CorruptCreeperRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CorruptionModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(CorruptionModEntities.CORRUPT_ZOMBIE, CorruptZombieRenderer::new);
		EntityRendererRegistry.register(CorruptionModEntities.CORRUPT_SKELETON, CorruptSkeletonRenderer::new);
		EntityRendererRegistry.register(CorruptionModEntities.CORRUPT_CREEPER, CorruptCreeperRenderer::new);
		EntityRendererRegistry.register(CorruptionModEntities.CORRUPT_SPIDER, CorruptSpiderRenderer::new);
		EntityRendererRegistry.register(CorruptionModEntities.CORRUPTED_ENDERMAN, CorruptedEndermanRenderer::new);
	}
}
