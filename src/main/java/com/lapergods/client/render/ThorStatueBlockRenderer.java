package com.lapergods.client.render;

import com.geckolib.renderer.GeoBlockRenderer;
import com.lapergods.block.entity.ThorStatueBlockEntity;
import com.lapergods.client.model.ThorStatueModel;

public class ThorStatueBlockRenderer extends GeoBlockRenderer<ThorStatueBlockEntity> {
    public ThorStatueBlockRenderer() {
        super(new ThorStatueModel());
    }
}
