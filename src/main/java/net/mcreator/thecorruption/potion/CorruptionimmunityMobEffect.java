
package net.mcreator.thecorruption.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CorruptionimmunityMobEffect extends MobEffect {
	public CorruptionimmunityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737895);
	}

	@Override
	public String getDescriptionId() {
		return "effect.corruption.corruptionimmunity";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
