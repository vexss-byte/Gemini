package com.lapergods.client.model;

import com.geckolib.model.DefaultedBlockGeoModel;
import com.lapergods.LapergodsMod;
import com.lapergods.block.entity.ThorStatueBlockEntity;
import net.minecraft.resources.Identifier;

public class ThorStatueModel extends DefaultedBlockGeoModel<ThorStatueBlockEntity> {
    public ThorStatueModel() {
        super(Identifier.of(LapergodsMod.MOD_ID, "thor_statue"));
    }

    @Override
    public Identifier getModelResource(ThorStatueBlockEntity animatable) {
        return Identifier.of(LapergodsMod.MOD_ID, "geo/thor_statue.geo.json");
    }

    @Override
    public Identifier getTextureResource(ThorStatueBlockEntity animatable) {
        return Identifier.of(LapergodsMod.MOD_ID, "textures/block/thor_statue.png");
    }

    @Override
    public Identifier getAnimationResource(ThorStatueBlockEntity animatable) {
        return Identifier.of(LapergodsMod.MOD_ID, "animations/thor_statue.animation.json");
    }
}
