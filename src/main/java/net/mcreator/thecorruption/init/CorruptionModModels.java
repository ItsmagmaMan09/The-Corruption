
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thecorruption.init;

import net.mcreator.thecorruption.client.model.Modelcorruptskeleton;
import net.mcreator.thecorruption.client.model.ModelCorruptedEnderman;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CorruptionModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelcorruptskeleton.LAYER_LOCATION, Modelcorruptskeleton::createBodyLayer);
		EntityModelLayerRegistry.registerModelLayer(ModelCorruptedEnderman.LAYER_LOCATION, ModelCorruptedEnderman::createBodyLayer);
	}
}
