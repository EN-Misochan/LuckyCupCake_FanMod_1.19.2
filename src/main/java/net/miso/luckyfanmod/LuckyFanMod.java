package net.miso.luckyfanmod;

import net.fabricmc.api.ModInitializer;
import net.miso.luckyfanmod.painting.ModPaintings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuckyFanMod implements ModInitializer {
	public static final String MOD_ID = "luckyfanmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModPaintings.registerPaintings();
	}
}
