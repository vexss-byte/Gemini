package com.lapergods;

import com.lapergods.block.ThorStatueBlock;
import com.lapergods.block.entity.ThorStatueBlockEntity;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LapergodsMod implements ModInitializer {
    public static final String MOD_ID = "lapergods";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block THOR_STATUE_BLOCK = new ThorStatueBlock(BlockBehaviour.Properties.of().noOcclusion().strength(3.5f));
    public static final Item THOR_STATUE_ITEM = new BlockItem(THOR_STATUE_BLOCK, new Item.Properties());
    public static BlockEntityType<ThorStatueBlockEntity> THOR_STATUE_BE;

    @Override
    public void onInitialize() {
        Identifier statueId = Identifier.of(MOD_ID, "thor_statue");
        Registry.register(BuiltInRegistries.BLOCK, statueId, THOR_STATUE_BLOCK);
        Registry.register(BuiltInRegistries.ITEM, statueId, THOR_STATUE_ITEM);

        THOR_STATUE_BE = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            statueId,
            BlockEntityType.Builder.of(ThorStatueBlockEntity::new, THOR_STATUE_BLOCK).build(null)
        );

        LOGGER.info("Lapergods Mod (Fase 2: Patung Thor Block & Entity) initialized!");
    }
}
