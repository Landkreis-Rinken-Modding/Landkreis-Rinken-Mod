
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.lkr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.lkr.client.model.ModelSchussichereWeste;
import net.lkr.client.model.ModelFWleggins;
import net.lkr.client.model.ModelFWTorso;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LandkreisRinkenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelFWleggins.LAYER_LOCATION, ModelFWleggins::createBodyLayer);
		event.registerLayerDefinition(ModelSchussichereWeste.LAYER_LOCATION, ModelSchussichereWeste::createBodyLayer);
		event.registerLayerDefinition(ModelFWTorso.LAYER_LOCATION, ModelFWTorso::createBodyLayer);
	}
}
