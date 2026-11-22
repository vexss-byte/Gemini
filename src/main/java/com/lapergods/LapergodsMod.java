package com.lapergods;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LapergodsMod implements ModInitializer {
    public static final String MOD_ID = "lapergods";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Lapergods Mod (Fase 1) initialized on Common/Server!");
    }
}
