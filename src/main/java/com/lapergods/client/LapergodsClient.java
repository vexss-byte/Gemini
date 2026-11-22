package com.lapergods.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LapergodsClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("lapergods-client");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Lapergods Mod (Fase 1) initialized on Client!");
    }
}
