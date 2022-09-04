package net.miso.luckyfanmod.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.miso.luckyfanmod.LuckyFanMod;

public class ModPaintings {
    public static final PaintingVariant LUCKY = registerPainting("luckychan", new PaintingVariant(64,64));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant){
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(LuckyFanMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings(){
        LuckyFanMod.LOGGER.debug("Registering Paintings" + LuckyFanMod.MOD_ID);
    }
}
