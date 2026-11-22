package com.lapergods.client;

import com.lapergods.LapergodsMod;
import com.lapergods.client.render.ThorStatueBlockRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LapergodsClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("lapergods-client");

    @Override
    public void onInitializeClient() {
        BlockEntityRenderers.register(LapergodsMod.THOR_STATUE_BE, ThorStatueBlockRenderer::new);
        LOGGER.info("Lapergods Client Renderer registered for Thor Statue!");
    }
}
